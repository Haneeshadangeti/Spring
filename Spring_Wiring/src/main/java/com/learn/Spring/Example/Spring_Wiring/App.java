package com.learn.Spring.Example.Spring_Wiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
        Trainer tr= (Trainer)ctx.getBean("t");
        System.out.println(tr);
       Kodnest_Classes k= (Kodnest_Classes)ctx.getBean("kod");
        System.out.println(k);
    }
}
