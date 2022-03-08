package com.azeem.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyAPIAnalytics {
    @Before("execution(public void add*(..))")
    public void performAPIAnalytics(){

        System.out.println("\n=====>>> Executing @Before advice on API Analytics()");
    }
}
