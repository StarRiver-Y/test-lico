package com.example.test;

import com.example.test.annotation.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AnnotationTest01 {


    @Autowired
//    @Qualifier("person1")
    private Person person;

    @Test
    public void test01(){
        System.out.println(person);
    }
}
