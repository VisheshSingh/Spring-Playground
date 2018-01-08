package com.springPractice;

public class BaseballCoach implements Coach {

	// define a private field for dependency
	private FortuneService fortuneService;

	// define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Warm up in the batting cage for at least 30 mins";
	}

	@Override
	public String getProperDiet() {
		return "Baseball Diet Plan: Breakfast: Vegetables, Lunch: Eggs and Dinner: Chicken breasts";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a fortune - helper
		return fortuneService.getFortune();
	}

}
