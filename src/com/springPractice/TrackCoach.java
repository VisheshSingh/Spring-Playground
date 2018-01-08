package com.springPractice;

public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5K";
	}

	@Override
	public String getProperDiet() {
		return "Include Milk, eggs, oats, vegetables and chicken in you diet";
	}

}
