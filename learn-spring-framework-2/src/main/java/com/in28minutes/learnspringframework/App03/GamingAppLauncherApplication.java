package com.in28minutes.learnspringframework.App03;

import com.in28minutes.learnspringframework.GameRunner;
import com.in28minutes.learnspringframework.GamingConsole;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com/in28minutes/learnspringframework")
public class GamingAppLauncherApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class);
        context.getBean(GamingConsole.class).up();
        context.getBean(GameRunner.class).run();
    }
}
