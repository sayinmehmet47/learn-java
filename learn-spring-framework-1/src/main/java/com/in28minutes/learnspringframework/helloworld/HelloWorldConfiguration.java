package com.in28minutes.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


record Person (String name, int age,Address adress){};
 record Address (String firstLine, String city){};
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Range";
    }
    @Bean
    public int age(){
        return 21;
    }

    @Bean
    public Person person(){
        return new Person("Ravi", 20, new Address("Dorfbachweg24", "Aargau"));
    }
    @Bean
    public Person person2Qualifier(String name, int age, @Qualifier("address3qualifier") Address address){
        return new Person("Mehmet", 20, new Address("Hagenholzstrasse", "Zurich"));
    }
    @Bean("address2")
    @Primary   // we need to do that to fix multiple matching candidate or beans
    public Address address(){
        return new Address("Dorbachwer", "Aargau");
    }

    @Bean("address3")
    @Qualifier("address3qualifier") // autowire the object
    public Address address3(){
        return new Address("Basmane", "Turkiye");
    }

    @Bean()
    public Person person2MethodCall(){
        return new Person(name(),age(),address());
    }


    @Bean()
    public Person person3Paramaters(String name, int age, Address address3){
        return new Person(name,age,address3);
    }


}
