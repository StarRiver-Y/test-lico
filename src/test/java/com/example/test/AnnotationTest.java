package com.example.test;


import com.example.test.annotation.BeanConfig;
import com.example.test.annotation.Person;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AnnotationTest {

    @Test
    public void test01(){

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
        print(applicationContext);
        System.out.println("容器初始化完成...");

        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
    }

    private void print(ApplicationContext applicationContext) {
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }

}
