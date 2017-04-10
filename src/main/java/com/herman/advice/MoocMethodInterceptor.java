package com.herman.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MoocMethodInterceptor implements MethodInterceptor {

    public Object invoke(MethodInvocation methodInvocation) throws Throwable {

        System.out.println("MoocMethodInterceptor 1 : " + methodInvocation.getMethod().getName());
        Object result = methodInvocation.proceed();
        System.out.println("MoocMethodInterceptor 2 : " + result);
        return result;
    }
}
