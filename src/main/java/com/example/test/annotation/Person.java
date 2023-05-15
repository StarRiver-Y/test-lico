package com.example.test.annotation;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "test.person")
@Data
public class Person {
    private String name;
    private Integer age;
    private List<String> qq;
    private Map<String,String> map;

}
