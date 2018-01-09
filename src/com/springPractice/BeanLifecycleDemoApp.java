package com.springPractice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {

	public static void main(String[] args) {

		// load the Spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beanLifecycle-applicationContext.xml");

		// retrieve the bean from the Spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		System.out.println(theCoach.getDailyWorkout());

		// close context
		context.close();
	}

}
