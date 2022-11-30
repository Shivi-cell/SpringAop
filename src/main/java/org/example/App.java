package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args ) throws MyException {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        // getting student bean
        Student student = context.getBean("student", Student.class);
        //student.studySomething(10,6);
        //student.study(10);
        //student.doOperation();
        // getting employee bean
//        Employee employee = context.getBean("employee",Employee.class);
//        employee.studyAnything();
        //employee.study("ram");



        //around advice
//        int rank = student.videoRank(100, 10);
//        System.out.println("video rank is "+rank);

        // testing only
        student.test();
    }
}
