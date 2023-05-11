package com.example.test.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Arrays;

@Aspect
public class LogAspects {

    @Pointcut("execution(public int com.example.test.aop.MathTest.*(..))")
    public void pointCut(){

    }

    @Before("pointCut()")
    public void start(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println(joinPoint.getSignature().getName()+"---"+ Arrays.asList(args));
        System.out.println("除法开始");
    }

    @After("pointCut()")
    public void end(){
        System.out.println("除法结束");
    }

    @AfterReturning("pointCut()")
    public void res(){
        System.out.println("除法结果");
    }

    @AfterThrowing("pointCut()")
    public void ex(){
        System.out.println("除法异常");
    }

//    @Around("pointCut()")
//    public void round(){
//        System.out.println("除法环绕");
//    }

}
