package com.springPractice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		// load the Spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		// retrieve the bean from the Spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		Coach alphaCoach = context.getBean("myCoach", Coach.class);

		// check if they are same
		boolean result = (theCoach == alphaCoach);

		// print out the results
		System.out.println("\n Pointing to the same object: " + result);

		System.out.println("\n Memory location for theCoach: " + theCoach);

		System.out.println("\n Memory location for aplhaCoach: " + alphaCoach);

		// close context
		context.close();
	}

}
