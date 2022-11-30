package org.example;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    public void studyAnything()
    {
        System.out.println("I am exploring right now ");
    }

    public int study(String x)
    {
        System.out.println("study(String x)");
        return 0;
    }
}
