package demoOne;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
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

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}
