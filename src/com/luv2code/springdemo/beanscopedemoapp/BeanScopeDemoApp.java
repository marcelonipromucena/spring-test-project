package com.luv2code.springdemo.beanscopedemoapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.Coach;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		// retrieve bean from spring container

		Coach coach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);

		// Check if they are the same
		
		boolean result = (coach == alphaCoach);
		
		// print out the results
		
		System.out.println("Pointing to the same object "+result);
		
		System.out.println("Memory location for theCoach "+coach);
		System.out.println("Memory location for theCoach "+alphaCoach);
		
		context.close(); 

	}

}
