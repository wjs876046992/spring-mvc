package com.herman.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class MoocAfterReturningAdvice implements AfterReturningAdvice {

    public void afterReturning(Object returnValue, Method method, Object[] objects, Object target) throws Throwable {

        System.out.println("MoocAfterReturningAdvice : " + method.getName() + "; " + target.getClass().getName() + "; " + returnValue);
    }
}
