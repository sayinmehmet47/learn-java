package com.in28minutes.learnspringframework.App03;

import com.in28minutes.learnspringframework.GameRunner;
import com.in28minutes.learnspringframework.GamingConsole;
import com.in28minutes.learnspringframework.PacmanGame;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(App03GamingSpringBeansConfiguration.class);
        context.getBean(GamingConsole.class).up();
        context.getBean(GameRunner.class).run();

    }

}
