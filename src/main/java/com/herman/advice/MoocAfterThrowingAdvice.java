package com.herman.advice;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

public class MoocAfterThrowingAdvice implements ThrowsAdvice {

    public void afterThrowing(Exception ex) throws Throwable {

        System.out.println("MoocAfterThrowingAdvice : afterThrowing 1");
    }

    public void afterThrowing(Method method, Object[] objects, Object target, Exception ex) throws Throwable {

        System.out.println("MoocAfterThrowingAdvice : afterThrowing 2" + method.getName() + "; " + target.getClass().getName());
    }
}
