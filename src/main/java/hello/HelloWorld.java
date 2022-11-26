package hello;

import org.joda.time.LocalTime;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class HelloWorld {

	static Logger logger;

	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		logger =  Logger.getLogger(HelloWorld.class);
		LocalTime currentTime = new LocalTime();
		logger.info("The current local time is: " + currentTime);
		Greeter greeter = new Greeter();
		logger.info(greeter.sayHello());
	}
}
