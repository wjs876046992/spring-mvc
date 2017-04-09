package com.herman.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class TestAdvice {

    /**
     * 切面，方法执行前，具体看spring-mybatis.xml <aop:config />
     */
    public void beforeMethod() {

        System.out.println("before method!");
    }

    public void afterReturning() {

        System.out.println("after returning method");
    }

    public void afterThrowing() {

        System.out.println("after throwing method");
    }

    public void alwaysAfter() {

        System.out.println("always after");
    }

    public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {

        System.out.println("around advice 1");
        Object result = pjp.proceed();
        System.out.println("around advice 2");
        return result;
    }

    /**
     * 通知里面使用参数的demo
     * @param pjp 环绕时必穿第一个参数
     * @param name 姓名
     * @param times 次数
     * @return 返回值
     * @throws Throwable 异常
     */
    public Object aroundAdviceParams(ProceedingJoinPoint pjp, String name, int times) throws Throwable {

        System.out.println("aroundAdviceParams: " + name + "  " + times);
        System.out.println("aroundAdviceParams 1");
        Object result = pjp.proceed();
        System.out.println("aroundAdviceParams 2");
        return result;
    }
}
