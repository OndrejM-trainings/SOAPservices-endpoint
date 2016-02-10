package ws.endpoint;

import javax.inject.Inject;
import javax.jws.WebService;
import ws.endpoint.context.GreetingWebServiceContext;

import ws.model.Gender;
import ws.model.Greeting;
import ws.model.Person;

@WebService(serviceName = "GreetingWebService")
public class GreetingWebService {

    @Inject
    private GreetingWebServiceContext ctx;

    public String sayHello(String who) {
        return "Hello, " + who + "!";
    }

    public void hello() {
        ctx.incNumberOfHellos();
    }

    public void goodBye() {
        ctx.incNumberOfGoodByes();
    }

    public int getNumberOfGreetings() {
        return ctx.getNumberOfHellos() + ctx.getNumberOfGoodByes();
    }

    public int getNumberOfHellosWithoutGoodBye() throws Exception {
        int result = ctx.getNumberOfHellos() - ctx.getNumberOfGoodByes();
        if (result < 0) {
            throw new Exception("Number of GoodBye more than number of Hello");
        } else {
            return result;
        }
    }

    public String sendGreeting(Greeting greeting) {
        return greeting.getSender().getCompleteName() + ": "
                + greeting.getGreetingWord() + ", "
                + greeting.getReceiver().getCompleteName() + "!";
    }

    public Greeting getSomeGreeting() {
        Greeting greeting = new Greeting("Ahoj",
                new Person("Ján", "Novák", Gender.MALE),
                new Person("Mária", "Dušičková", Gender.FEMALE));
        return greeting;
    }

}
