package com.example.test;


import com.example.test.annotation.BeanConfig;
import com.example.test.annotation.Person;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
