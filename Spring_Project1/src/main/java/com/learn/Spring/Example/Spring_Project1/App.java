package com.learn.Spring.Example.Spring_Project1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("config.xml");
        Student_Spring s=(Student_Spring)ctx.getBean("st");
        System.out.println(s);
        
    }
}
