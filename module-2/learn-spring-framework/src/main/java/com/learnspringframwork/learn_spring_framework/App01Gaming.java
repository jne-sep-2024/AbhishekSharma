package com.learnspringframwork.learn_spring_framework;

import com.learnspringframwork.learn_spring_framework.game.GameRunner;
import com.learnspringframwork.learn_spring_framework.game.SuperContra;
import com.learnspringframwork.learn_spring_framework.game.PacMan;

public class App01Gaming {
    public static void main(String[] args) {

        // var game = new SuperContra();
        // var game = new MarioGame();

        //1. Object creation
        var game = new PacMan();

        //2. Object creation + Wiring Dependency
        // game is a dependency of GameRunner
        // we are injecting game into GameRunner class
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
