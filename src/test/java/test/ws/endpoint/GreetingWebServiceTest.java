package test.ws.endpoint;

import com.google.inject.*;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.Application;
import static org.junit.Assert.*;

import org.junit.Test;

import ws.endpoint.GreetingWebService;

public class GreetingWebServiceTest {

    @Test
    public void sayHelloWorks() {
        GreetingWebService ws = greetingWebService();
        assertEquals("Saying hello as expected", "Hello, people!", ws.sayHello("people"));
    }

    @Test
    public void goodByeWorks() {
        GreetingWebService ws = greetingWebService();
        final int numberOfHellos = 10;
        int counter = numberOfHellos;
        while (counter > 0) {
            counter--;
            ws.hello();
        }
        counter = numberOfHellos - 1;
        while (counter > 0) {
            counter--;
            ws.goodBye();
        }
        assertEquals("Number of greetings", 2 * numberOfHellos - 1, ws.getNumberOfGreetings());
        assertEquals("Number of hellos without goodBye", 1, ws.getNumberOfHellosWithoutGoodBye());
    }

    private static GreetingWebService greetingWebService() {
        Injector injector = Guice.createInjector(new GuiceModule());
        return injector.getInstance(GreetingWebService.class);
    }

    private static class GuiceModule extends AbstractModule {

        @Override
        protected void configure() {
        }
    }

}
