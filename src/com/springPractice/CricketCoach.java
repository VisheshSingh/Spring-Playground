package com.springPractice;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	// create a no-args constructor
	public CricketCoach() {
		System.out.println("This is from no-args constructor...");
	}

	public CricketCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	// Setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setter method...");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Streching for 30 mins";
	}

	@Override
	public String getProperDiet() {
		return "Cricket Diet Plan: Brocolli, scrambled eggs; oats and brown rice; chicken and chick peas";
	}

	@Override
	public String getDailyFortune() {

		return "Never give up! " + fortuneService.getFortune();
	}

}
