package demoThree;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	public RandomFortuneService() {
	}

	@Override
	public void giveFortune() {
		System.out.println("Be productive today");
	}

	@Override
	public void giveRandomFortune() {
       System.out.println("No I don't provide this service");
	}

}
