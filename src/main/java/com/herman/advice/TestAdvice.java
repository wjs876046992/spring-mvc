package com.herman.advice;

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
}
