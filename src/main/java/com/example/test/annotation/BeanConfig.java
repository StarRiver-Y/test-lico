package com.example.test.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@ComponentScan("com.example.test.annotation")
@Configuration
public class BeanConfig {


    @Bean(initMethod = "init")
    public Cat cat(){
        return new Cat();
    }

    @Bean
    public Person person(){
        Person person = new Person();
//        person.setName(name);
//        person.setAge(age);
        return person;
    }

    @Bean(name = "person1")
    public Person person1(){
        Person person = new Person();
        person.setName("person1");
        person.setAge(20);
        return person;
    }
}
