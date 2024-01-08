package com.learn.Spring.AutoWiring.byName.AutoWiring_Spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext cfx=new ClassPathXmlApplicationContext("config.xml");
    	Mobile1 m=(Mobile1)cfx.getBean("m1");
    	System.out.println(m);
    	person1 per=(person1)cfx.getBean("p");
    	System.out.println(per);
    	
    	
  	 
    }
}
