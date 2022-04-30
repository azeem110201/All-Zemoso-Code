package com.azeem.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyCloudAsync {

    @Before("execution(public void add*(..))")
    public void logToCloudAsync(){

        System.out.println("\n=====>>> Executing @Before advice on log cloud async()");
    }
}
