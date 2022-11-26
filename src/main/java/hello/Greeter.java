package hello;

public class Greeter {
	public String sayHello() {
		return String.format("Hello world %s!", System.getProperty("user.name"));
	}
}
