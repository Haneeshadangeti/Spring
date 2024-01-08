package com.learn.Spring.AutoWiring.byConstructor.AutoWiring_Project;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ClassPathXmlApplicationContext cpx =new ClassPathXmlApplicationContext("config.xml");
      Car car=(Car)cpx.getBean("c");
      System.out.println(car);
      System.out.println("---------------------------");
      Driver dr1=(Driver)cpx.getBean("d");
      System.out.println(dr1);
      Driver dr2=(Driver)cpx.getBean("d2");
      System.out.println(dr2);
      Driver dr3=(Driver)cpx.getBean("d3");
      System.out.println(dr3);
      System.out.println("---------------------------");
      University uni=(University)cpx.getBean("u");
      System.out.println(uni);
      System.out.println("---------------------------");
      professor pr1=(professor)cpx.getBean("p");
      System.out.println(pr1);
      professor pr2=(professor)cpx.getBean("p2");
      System.out.println(pr2);
      System.out.println("---------------------------");
      
       
       
    }
}
