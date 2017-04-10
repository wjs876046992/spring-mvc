package com.herman.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class MoocBeforeAdvice implements MethodBeforeAdvice {

    public void before(Method method, Object[] objects, Object o) throws Throwable {

        System.out.println("MoocBeforeAdvice : " + method.getName() + " ;objects : " + objects + " ;o : " + o);
    }
}
