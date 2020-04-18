package demoThree;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author I329450
 *
 */
public class MyApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);
        Coach anyCoach = context.getBean("baseballCoach", Coach.class);
        anyCoach.getWorkout();
        anyCoach.getDailyFortune();
        anyCoach = context.getBean("trackCoach", Coach.class);
        anyCoach.getWorkout();
        anyCoach.getDailyFortune();
        CricketCoach differentCoach;
        differentCoach = context.getBean("cricketCoach", CricketCoach.class);
        differentCoach.getWorkout();
        differentCoach.getDailyFortune();
        String mailAddress = differentCoach.getEmailAddress();
        System.out.println("Coach's mail address: " + mailAddress);
        context.close();
	}

}
