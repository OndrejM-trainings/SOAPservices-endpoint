package ws.endpoint;

public class GreetingWebService {
	
	private int numberOfHellos;
	private int numberOfGoodByes;
	
	public String sayHello(String who) {
		return "Hello, " + who + "!";
	}

	public void hello() {
		numberOfHellos++;
	}
	
	public void goodBye() {
		numberOfGoodByes++;
	}

	public int getNumberOfGreetings() {
		return numberOfHellos + numberOfGoodByes;
	}

	public int getNumberOfHellosWithoutGoodBye() {
		return Math.max(0, numberOfHellos - numberOfGoodByes);
	}

}
