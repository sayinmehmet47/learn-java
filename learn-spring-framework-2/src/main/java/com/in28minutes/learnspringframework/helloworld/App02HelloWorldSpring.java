package com.in28minutes.learnspringframework.helloworld;

import com.in28minutes.learnspringframework.helloworld.Address;
import com.in28minutes.learnspringframework.helloworld.HelloWorldConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        var context= new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3Paramaters"));
        System.out.println(context.getBean("person"));
       System.out.println(context.getBean(Address.class));
       System.out.println(context.getBean("person2Qualifier"));

        Arrays.stream(context.getBeanDefinitionNames()).forEach(
                System.out::println
        );

    }
}
