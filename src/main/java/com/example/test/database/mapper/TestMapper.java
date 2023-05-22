package com.example.test.database.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.test.database.model.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper extends BaseMapper<Test> {
    List<Test> selectAll();
}
