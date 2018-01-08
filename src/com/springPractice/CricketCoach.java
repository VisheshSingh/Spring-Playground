package com.springPractice;

public class CricketCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Streching for 30 mins";
	}

	@Override
	public String getProperDiet() {
		return "Cricket Diet Plan: Brocolli, scrambled eggs; oats and brown rice; chicken and chick peas";
	}

}
