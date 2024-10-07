import com.spring_security.config.SecurityConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.DelegatingFilterProxy;

public class AppInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        // To use the above-defined Spring Security configuration,
        AnnotationConfigWebApplicationContext root = new AnnotationConfigWebApplicationContext();
        root.register(SecurityConfig.class);

        servletContext.addListener(new ContextLoaderListener(root));
        servletContext
                .addFilter("securityFilter", new DelegatingFilterProxy
                        ("springSecurityFilterChain"))
                .addMappingForUrlPatterns(null, false, "/*");


    }
}
