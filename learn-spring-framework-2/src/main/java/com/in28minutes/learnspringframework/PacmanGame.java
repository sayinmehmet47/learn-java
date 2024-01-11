package com.in28minutes.learnspringframework;


import org.springframework.stereotype.Component;


@Component
public class PacmanGame implements GamingConsole {
    @Override
    public void up() {
        System.out.println("Jump upside");
    }

    @Override
    public void down() {
        System.out.println("Hide");
    }

    @Override
    public void left() {
        System.out.println("Go left!!!");
    }

    @Override
    public void right() {
        System.out.println("Go right faster!!!");
    }
}
