package com.learnspringframwork.learn_spring_framework;

import com.learnspringframwork.learn_spring_framework.game.GameRunner;
import com.learnspringframwork.learn_spring_framework.game.GamingConsole;
import com.learnspringframwork.learn_spring_framework.game.PacMan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;


public class App03GamingSpringBeans {
    public static void main(String[] args) {


        try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
           // context.getBean(GamingConsole.class).up();

            //gameRunner run() method
            context.getBean(GameRunner.class).run();
        }


//        // var game = new SuperContra();
//        // var game = new MarioGame();
//
//        //1. Object creation
//        var game = new PacMan();
//
//        //2. Object creation + Wiring Dependency
//        // game is a dependency of GameRunner
//        // we are injecting game into GameRunner class
//        var gameRunner = new GameRunner(game);
//        gameRunner.run();
    }
}
