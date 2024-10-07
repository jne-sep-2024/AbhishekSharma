package com.learnspringframwork.learn_spring_framework;

import com.learnspringframwork.learn_spring_framework.game.GameRunner;
import com.learnspringframwork.learn_spring_framework.game.GamingConsole;
import com.learnspringframwork.learn_spring_framework.game.MarioGame;
import com.learnspringframwork.learn_spring_framework.game.PacMan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GamingConfiguration {

    @Bean
    @Primary
    public GamingConsole game() {
        var game = new PacMan();
        return game;
    }

//    @Bean
//    public GamingConsole gameMario() {
//        var game = new MarioGame();
//        return game;
//    }

    //Creating a pacman game and wiring in gameRunner.
    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }

    // var game = new SuperContra();
    // var game = new MarioGame();

    //1. Object creation
//    var game = new PacMan();
//
//    //2. Object creation + Wiring Dependency
//    // game is a dependency of GameRunner
//    // we are injecting game into GameRunner class
//    var gameRunner = new GameRunner(game);
//        gameRunner.run();
}

