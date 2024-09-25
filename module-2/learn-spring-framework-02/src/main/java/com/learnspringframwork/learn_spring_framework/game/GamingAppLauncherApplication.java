package com.learnspringframwork.learn_spring_framework.game;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.learnspringframwork.learn_spring_framework.game")
public class GamingAppLauncherApplication {

    public static void main(String[] args) {


        try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
            context.getBean(GamingConsole.class).up();

            //gameRunner run() method
            context.getBean(GameRunner.class).run();
        }
    }
}
