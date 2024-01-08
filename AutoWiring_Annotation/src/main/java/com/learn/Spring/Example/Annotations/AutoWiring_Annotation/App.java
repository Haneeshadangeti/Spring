package com.learn.Spring.Example.Annotations.AutoWiring_Annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext cpx=new ClassPathXmlApplicationContext("config.xml");
    	Car car=(Car)cpx.getBean("c");
    	System.out.println(car);
    	Driver dr=(Driver)cpx.getBean("d");
    	System.out.println(dr);
    	
    	
       
    }
}
