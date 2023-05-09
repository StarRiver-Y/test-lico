package com.example.test.controller;

import com.example.test.annotation.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test01")
public class TestController01 {

    @Autowired
    @Qualifier("person1")
    private Person person1;


    @GetMapping
    public Person test01(){
        System.out.println(person1);
        return person1;
    }
}
