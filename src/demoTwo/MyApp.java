package demoTwo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author I329450
 *
 */
public class MyApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
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
