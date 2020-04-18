package demoTwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
	

	private FortuneService fortuneService;
	
	@Autowired
	public BaseballCoach(@Qualifier("happyFortune") FortuneService fortuneService) {
		 this.fortuneService = fortuneService;
	}


	@Override
	public void getWorkout() {
		System.out.println("Push up for 15mins");
	}
	
	@Override
	public void getDailyFortune() {
		fortuneService.giveFortune();
	}

}
