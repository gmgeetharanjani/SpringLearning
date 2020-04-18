package demoOne;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
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
