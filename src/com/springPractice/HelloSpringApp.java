package com.springPractice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the Spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Retrieve the bean from Spring Container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		// Call methods on the bean
		System.out.println(theCoach.getDailyWorkout());

		// Close the context
		context.close();
	}

}
