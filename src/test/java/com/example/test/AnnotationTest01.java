package com.example.test;

import com.example.test.annotation.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
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
