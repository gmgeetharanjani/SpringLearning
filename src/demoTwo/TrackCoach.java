package demoTwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;

	@Autowired
	@Qualifier("happyFortune")
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public void getWorkout() {
		System.out.println("Run for 30mins");

	}
	
	@Override
	public void getDailyFortune() {
		fortuneService.giveFortune();
		fortuneService.giveRandomFortune();
	}

}
