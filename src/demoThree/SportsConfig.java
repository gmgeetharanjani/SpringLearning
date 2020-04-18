package demoThree;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("demoThree")
@PropertySource("classpath:sports.properties")
public class SportsConfig {

}
