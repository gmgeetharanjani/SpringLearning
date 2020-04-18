package demoOne;

import java.util.Random;

public class HappyFortune implements FortuneService {
	
	String[] array;
	
	HappyFortune() {
		array = new String[3];
		array[0] = "Never give up";
		array[1] = "You can acheive anything if you set your mind to it";
		array[2] = "Read, learn, excel, repeat";
	}

	@Override
	public void giveFortune() {
		System.out.println("Have a happy day!");
	}

	@Override
	public void giveRandomFortune() {
		Random randomNumber = new Random();
		int number = randomNumber.nextInt(3);
		System.out.println(array[number]);
	}
}
