package com.example.test.controller;

import com.example.test.annotation.CheckNum;
import com.example.test.annotation.Loggable;
import com.example.test.annotation.Person;
import com.example.test.database.mapper.TestMapper;
import com.example.test.database.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@Validated
@RestController
@RequestMapping("/test01")
public class TestController01 {

    @Autowired
    @Qualifier("person")
    private Person person1;

    @Autowired
    private TestMapper testMapper;


    @Loggable
    @GetMapping
    public Test test01(@CheckNum Integer num){
        System.out.println(num);
        Test test = testMapper.selectById(1);
        test.setTime(new Date());
        return test;
    }

    @GetMapping("/insert")
    @Transactional
    public void test02(){
        Test test = new Test();
//        test.setName("小红");
        testMapper.insert(test);
        int i = 10/0;
    }

    @GetMapping("/all")
    public void test03(){

        List<Test> tests = testMapper.selectAll();
        System.out.println(tests);
    }
}
