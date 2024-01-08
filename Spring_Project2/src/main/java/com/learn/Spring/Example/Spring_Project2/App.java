package com.learn.Spring.Example.Spring_Project2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	 ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("config.xml");
    	 Laptop lap1=(Laptop)ctx.getBean("l1");
    	 System.out.println(lap1);
    	 Laptop lap2=(Laptop)ctx.getBean("l2");
    	 System.out.println(lap2);
    	 Laptop lap3=(Laptop)ctx.getBean("l3");
    	 System.out.println(lap3);
    	 ctx.close();
    }
}
