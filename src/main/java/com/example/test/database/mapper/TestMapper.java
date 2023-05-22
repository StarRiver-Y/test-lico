package com.example.test.database.mapper;


import com.example.test.database.model.Test;

/**
* @author bengda
* @description 针对表【test】的数据库操作Mapper
* @createDate 2023-05-22 15:27:19
* @Entity com.example.test.Test
*/
public interface TestMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Test record);

    int insertSelective(Test record);

    Test selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);

}
