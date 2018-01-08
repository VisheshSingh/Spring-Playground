package com.springPractice;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "This is a lucky day for you!";
	}

}
