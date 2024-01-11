package com.in28minutes.learnspringframework.App03;

import com.in28minutes.learnspringframework.GameRunner;
import com.in28minutes.learnspringframework.GamingConsole;
import com.in28minutes.learnspringframework.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class App03GamingSpringBeansConfiguration {

    @Bean
    public GamingConsole game(){
        return new PacmanGame();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        var gameRunner=new GameRunner((game));
        return gameRunner;
    }
}
