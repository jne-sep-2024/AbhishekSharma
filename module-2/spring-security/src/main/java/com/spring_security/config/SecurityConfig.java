package com.spring_security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    //To inject the object
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
                .csrf(csrf -> csrf.disable()) // Disable CSRF for simplicity
                .authorizeHttpRequests(auth -> {
                    auth
                            .requestMatchers("/admin/**").hasRole("ADMIN") // Role-based access control
                            .requestMatchers("/anonymous").anonymous() // Allow only anonymous users
                            .requestMatchers("/login*").permitAll() // Permit all users to access the login page
                            .anyRequest().authenticated(); // All other requests require authentication
                })
                .formLogin(form -> form
                        .loginPage("/login.html") // Custom login page
                        .loginProcessingUrl("/perform_login") // URL for form submission
                        .defaultSuccessUrl("/homepage.html", true) // Redirect on successful login
                        .failureUrl("/login.html?error=true") // Redirect on failure
                        .failureHandler(authenticationFailureHandler()) // Custom failure handler
                )
                .logout(logout -> logout
                        .logoutUrl("/perform_logout") // URL to trigger logout
                        .deleteCookies("JSESSIONID") // Delete session cookie on logout
                        .logoutSuccessHandler(logoutSuccessHandler()) // Custom logout handler
                );

        return http.build();
    }

    //In-memory implementation
    @Bean
    public InMemoryUserDetailsManager userDetailsService() {

        UserDetails user1 = User.withUsername("user1")
                .password(passwordEncoder().encode("user1pass"))
                .roles("USER")
                .build();

        UserDetails admin = User.withUsername("admin")
                .password(passwordEncoder().encode("admin"))
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user1, admin);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


    private LogoutSuccessHandler logoutSuccessHandler() {
        return (request, response, authentication) -> {
            response.sendRedirect("/login.html");
        };
    }


    private AuthenticationFailureHandler authenticationFailureHandler() {
        return (request, response, exception) -> {
            response.sendRedirect("/login.html?error=true");
        };
    }

}
