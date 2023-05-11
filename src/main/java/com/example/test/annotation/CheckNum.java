package com.example.test.annotation;


import com.example.test.aop.NumValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NumValidator.class)
public @interface CheckNum {

    String message() default "必须为偶数";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
