package com.learnspringframwork.learn_spring_framework.game;

import org.springframework.stereotype.Component;

@Component
public class PacMan implements GamingConsole {

    public void up() {
        System.out.println("Up pacman");
    }

    public void down() {
        System.out.println("Down pacman");
    }

    public void left() {
        System.out.println("Left PacMan");
    }

    public void right() {
        System.out.println("Right PacMan");
    }
}
