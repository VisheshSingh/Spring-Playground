package com.springPractice;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach() {

	}

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5K";
	}

	@Override
	public String getProperDiet() {
		return "Include Milk, eggs, oats, vegetables and chicken in you diet";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it! " + fortuneService.getFortune();
	}

	// Define init and destroy method
	public void doMyStartupStuff() {
		System.out.println("This is the init method...");
	}

	public void doMyCleanupStuff() {
		System.out.println("This is the destroy method...");
	}

}
