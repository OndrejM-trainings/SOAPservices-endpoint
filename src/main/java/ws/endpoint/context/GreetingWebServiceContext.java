package ws.endpoint.context;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingWebServiceContext {

    private int numberOfHellos;
    private int numberOfGoodByes;

    public int getNumberOfHellos() {
        return numberOfHellos;
    }

    public void setNumberOfHellos(int numberOfHellos) {
        this.numberOfHellos = numberOfHellos;
    }

    public int getNumberOfGoodByes() {
        return numberOfGoodByes;
    }

    public void setNumberOfGoodByes(int numberOfGoodByes) {
        this.numberOfGoodByes = numberOfGoodByes;
    }

    public void incNumberOfHellos() {
        this.numberOfHellos++;
    }

    public void incNumberOfGoodByes() {
        this.numberOfGoodByes++;
    }

}
