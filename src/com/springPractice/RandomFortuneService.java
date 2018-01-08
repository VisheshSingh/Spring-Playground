package com.springPractice;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private String data[] = { "Beware of the wolf in sheep's clothing", "Diligence is the mother of good luck",
			"The journey is the reward" };

	private Random myRandomNum = new Random();

	@Override
	public String getFortune() {

		int index = myRandomNum.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
	}

}
