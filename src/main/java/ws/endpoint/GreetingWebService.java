package ws.endpoint;

import javax.ejb.Stateless;
import javax.inject.Inject;
import ws.endpoint.context.GreetingWebServiceContext;

@Stateless
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

    public int getNumberOfHellosWithoutGoodBye() {
        return Math.max(0, ctx.getNumberOfHellos() - ctx.getNumberOfGoodByes());
    }

}
