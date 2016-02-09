package test.ws.endpoint;

import static org.junit.Assert.*;

import org.junit.Test;

import ws.endpoint.GreetingWebService;

public class GreetingWebServiceTest {

	@Test
	public void sayHelloWorks() {
		GreetingWebService ws = new GreetingWebService();
		assertEquals("Saying hello as expected", "Hello, people!", ws.sayHello("people"));
	}

	@Test
	public void goodByeWorks() {
		GreetingWebService ws = new GreetingWebService();
		final int numberOfHellos = 10;
		int counter = numberOfHellos;
		while (counter > 0) {
			counter--;
			ws.hello();
		}
		counter = numberOfHellos -1;
		while (counter > 0) {
			counter--;
			ws.goodBye();
		}
		assertEquals("Number of greetings", 2 * numberOfHellos - 1, ws.getNumberOfGreetings());
		assertEquals("Number of hellos without goodBye", 1, ws.getNumberOfHellosWithoutGoodBye());
	}

}
