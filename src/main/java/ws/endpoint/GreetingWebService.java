package ws.endpoint;

import javax.inject.Inject;
import javax.jws.WebService;
import ws.endpoint.context.GreetingWebServiceContext;

@WebService
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
