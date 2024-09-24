package com.learnspringframwork.learn_spring_framework.game;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole {

    public void up() {
        System.out.println("Jump Mario");
    }

    public void down() {
        System.out.println("Down Mario");
    }

    public void left() {
        System.out.println("Left Mario");
    }

    public void right() {
        System.out.println("Accelerate Mario");
    }
}
