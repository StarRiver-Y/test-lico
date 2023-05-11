package com.example.test.config;

import com.example.test.aop.LogAspects;
import com.example.test.aop.MathTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
public class AopConfig {

    @Bean
    public MathTest mathTest(){
        return new MathTest();
    }

    @Bean
    public LogAspects logAspects(){
        return new LogAspects();
    }
}
