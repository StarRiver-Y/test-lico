package com.example.test.database.model;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName(value = "test",autoResultMap = true)
public class Test {

    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    /**
     * 名称
     */
    @TableField(value = "`name`",insertStrategy = FieldStrategy.IGNORED)
    private String name;

    /**
     * 名称
     */
    @TableField(value = "`age`",insertStrategy = FieldStrategy.IGNORED)
    private Integer age;

    @TableField(exist = false)
    private Date time;
}
