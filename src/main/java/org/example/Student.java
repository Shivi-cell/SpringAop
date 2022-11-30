package org.example;

import org.springframework.stereotype.Component;

@Component
public class Student {
    public int studySomething(int x, int y)
    {
        System.out.println("I am studying right now ");
        return x+y;
    }

    public int study(int x)
    {
        System.out.println("study(int x)");
        return 0;
    }

    public String doOperation() throws MyException {
        throw new MyException("This is my custom exception.");
    }

    public int videoRank(int watchTime, int noOfViews)
    {
        System.out.println("videoRank method : watchTime "+watchTime+", noOfViews "+noOfViews);
        return (watchTime*noOfViews)-(watchTime+noOfViews);
    }

    public void test() throws MyException{
        System.out.println("Testing this");
        System.out.println("Testing this");
        System.out.println("Testing this");
        System.out.println("Testing this");
        throw new MyException("custom exception");
    }
}
