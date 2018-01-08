package com.springPractice;

public class BaseballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Warm up in the batting cage for at least 30 mins";
	}

	@Override
	public String getProperDiet() {
		return "Baseball Diet Plan: Breakfast: Vegetables, Lunch: Eggs and Dinner: Chicken breasts";
	}

}
