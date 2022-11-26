package hello;

import org.joda.time.LocalTime;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;

public class HelloWorld {

	static Logger logger;

	public static void main(String[] args) {
		System.setProperty("log4j2.configurationFile",new File("log4j.properties").toString());
		logger = LogManager.getLogger(HelloWorld.class);
		LocalTime currentTime = new LocalTime();
		String mensaje=String.format("The current local time is: %s",currentTime);
		logger.info(mensaje);
		Greeter greeter = new Greeter();
		String respuesta = greeter.sayHello();
		if(!respuesta.isEmpty())
			logger.info(respuesta);
	}
}
