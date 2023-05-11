package com.example.test.aop;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.example.test.annotation.CheckNum;

public class NumValidator implements ConstraintValidator<CheckNum,Integer>{

    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {
        if (integer == null){
            return false;
        }
        return integer % 2 == 0;
    }
}
