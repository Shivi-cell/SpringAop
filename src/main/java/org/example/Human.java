package org.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Human {

    @Before("myPointcut()")
    public void wakeUp()
    {
        System.out.println("Good Morning !");
    }
    /*@Before("myPointcut()")
    public void gatherInfo(JoinPoint j)
    {
        System.out.println(j.getArgs()[0]);
    }*/

    @After("myPointcut()")
    public void sleep()
    {
        System.out.println("Good Night !");
    }

    /*@AfterReturning(pointcut = "execution(public * study*(..))",returning = "value")
    public void afterReturning(int value)
    {
        System.out.println("After Returning "+value);
    }*/

    @AfterThrowing(pointcut = "execution(public * doOperation())", throwing = "value")
    public void afterReturning(MyException value)
    {
        System.out.println("After Throwing "+value);
    }

    // around advice
    @Around("execution(public * videoRank(..))")
    public Object aroundAdvice(ProceedingJoinPoint jp)
    {
        Object[] args = jp.getArgs();
        // changing the arguments in videoRank method
        args[0] = Integer.parseInt(args[0] + "")-50;
        args[1] = Integer.parseInt(args[1] + "") - 5;

        Object proceed = null;
        try{
            proceed = jp.proceed(args);
        }
        catch (Throwable th)
        {
            th.printStackTrace();
        }
        return proceed;
    }

    @Pointcut("execution(public * study*(..))")
    public void myPointcut() {}

    @After("execution(public * test(..))")
    public void testingAdvice(){
        System.out.println("advice called");
    }
}
