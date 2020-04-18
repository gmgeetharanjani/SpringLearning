package demoOne;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
	 this.fortuneService = fortuneService;
	}

	@Override
	public void getWorkout() {
		System.out.println("Run for 30mins");

	}
	
	@Override
	public void getDailyFortune() {
		fortuneService.giveFortune();
	}

}
