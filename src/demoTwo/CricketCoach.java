package demoTwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	@Value("${foo.emailAddress}")
	private String emailAddress;

	@Override
	public void getWorkout() {
		System.out.println("Do batting for 40mins");

	}

	@Override
	public void getDailyFortune() {
		fortuneService.giveFortune();
		fortuneService.giveRandomFortune();
	}

//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
//	
	public String getEmailAddress() {
		return emailAddress;
	}

//	public void setEmailAddress(String emailAddress) {
//		this.emailAddress = emailAddress;
//	}

}
