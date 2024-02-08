import  jade.core.Agent;
public class Main extends Agent {

    protected void setup() {
        // Printout a welcome message
        System.out.println("Hello Buyer agent "+getName());
    }
    protected void takeDown(){
        System.out.println("C'est fini");
    }
}