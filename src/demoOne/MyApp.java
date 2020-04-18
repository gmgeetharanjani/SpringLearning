package demoOne;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author I329450
 *
 */
public class MyApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach anyCoach = context.getBean("myBaseBallCoach", Coach.class);
        anyCoach.getWorkout();
        anyCoach.getDailyFortune();
        anyCoach = context.getBean("myTrackCoach", Coach.class);
        anyCoach.getWorkout();
        CricketCoach differentCoach;
        differentCoach = context.getBean("myCricketCoach", CricketCoach.class);
        differentCoach.getWorkout();
        differentCoach.getDailyFortune();
        System.out.println(differentCoach.getEmailAddress());
        context.close();
	}

}
