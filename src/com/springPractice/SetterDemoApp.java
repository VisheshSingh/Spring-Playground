package com.springPractice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		// load the config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve the bean from config file
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

		// call the bean method
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getProperDiet());

		// Call the new FortuneService method
		System.out.println(theCoach.getDailyFortune());

		// call the new methods to get the literal values
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());

		// close context
		context.close();
	}

}
