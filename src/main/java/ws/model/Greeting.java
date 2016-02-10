package ws.model;

public class Greeting {
	private Person receiver;
	private Person sender;
	private String greetingWord;

	public Greeting(String greetingWord, Person receiver, Person sender) {
		super();
		this.receiver = receiver;
		this.sender = sender;
		this.greetingWord = greetingWord;
	}

	public Person getReceiver() {
		return receiver;
	}

	public void setReceiver(Person receiver) {
		this.receiver = receiver;
	}

	public Person getSender() {
		return sender;
	}

	public void setSender(Person sender) {
		this.sender = sender;
	}

	public String getGreetingWord() {
		return greetingWord;
	}

	public void setGreetingWord(String greetingWord) {
		this.greetingWord = greetingWord;
	}

}
