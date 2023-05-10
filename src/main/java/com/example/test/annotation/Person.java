package com.example.test.annotation;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "test.person")
@Data
public class Person {
    private String name;
    private Integer age;
}
