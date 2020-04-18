package demoThree;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements FortuneService {
	
	String[] array = {
			"Never give up",
			"You can acheive anything if you set your mind to it",
			"Read, learn, excel, repeat"
	};
	
	HappyFortune() {
		
	}

	@Override
	public void giveFortune() {
		System.out.println("Have a happy day!");
	}

	@Override
	public void giveRandomFortune() {
		Random randomNumber = new Random();
		int number = randomNumber.nextInt(array.length);
		System.out.println(array[number]);
	}
}
