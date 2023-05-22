package com.example.test;


import com.example.test.database.mapper.TestMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MapperTest {

    @Autowired
    private TestMapper testMapper;

    @Test
    public void test01(){
//        com.example.test.database.model.Test test = testMapper.selectById(1);
        List<com.example.test.database.model.Test> tests = testMapper.selectAll();
        System.out.println(tests);
    }
}
