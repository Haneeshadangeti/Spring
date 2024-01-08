package com.learn.Spring.AutoWiring.byType.AutoWiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main( String[] args )
	{
	  ClassPathXmlApplicationContext cfx=new ClassPathXmlApplicationContext("config.xml");
	  Mobile mob1=(Mobile)cfx.getBean("m1");
	  System.out.println(mob1);
	  Person p1=(Person)cfx.getBean("p");
	  System.out.println(p1);

	}
}
