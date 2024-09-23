package com.learnspringframwork.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraQualifier")
public class SuperContra implements GamingConsole {

    public void up() {
        System.out.println("Up Contra");
    }

    public void down() {
        System.out.println("Down Contra");
    }

    public void left() {
        System.out.println("Left Contra");
    }

    public void right() {
        System.out.println("Right Contra");
    }
}
