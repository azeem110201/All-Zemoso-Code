package com.azeem.aop.aspects;

import com.azeem.aop.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyLoggingAspect {

    @Before("execution(public void add*(..))")
    public void beforeAddAccountAdvice(JoinPoint jointPoint){

        System.out.println("\n=====>>> Executing @Before advice on addAccount()");
        MethodSignature methodSig = (MethodSignature) jointPoint.getSignature();

        System.out.println("Method: " + methodSig);

        Object[] args = jointPoint.getArgs();

        for (Object tempArg : args) {
            System.out.println(tempArg);

            if (tempArg instanceof Account) {

                // downcast and print Account specific stuff
                Account theAccount = (Account) tempArg;

                System.out.println("account name: " + theAccount.getLastName());
                System.out.println("account id: " + theAccount.getAccountID());

            }
        }
    }
}
