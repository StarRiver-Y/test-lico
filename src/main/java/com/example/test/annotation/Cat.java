package com.example.test.annotation;

import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.PostConstruct;

public class Cat {

    public Cat() {
        System.out.println("Cat创建...");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Cat postConstruct...");
    }

    public void init() {
        System.out.println("Cat init...");
    }
}
