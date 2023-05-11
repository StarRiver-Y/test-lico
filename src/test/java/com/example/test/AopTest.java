package com.example.test;

import com.example.test.aop.MathTest;
import com.example.test.config.AopConfig;
import com.example.test.database.mapper.TestMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
@MapperScan("com.example.test.database.mapper") //扫描mapper文件夹
public class AopTest {


    @Test
    public void Test01(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AopConfig.class);
        MathTest bean = applicationContext.getBean(MathTest.class);
        bean.div(2,2);
    }
}
