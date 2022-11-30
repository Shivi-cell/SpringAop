package com.sequence;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class MyAspect1 {

    @Before("execution(* *(..))")
    public void advice1()
    {
        System.out.println("MyAspect1 advice1");
    }

    @Before("execution(* *(..))")
    public void advice2()
    {
        System.out.println("MyAspect1 advice2");
    }

}
