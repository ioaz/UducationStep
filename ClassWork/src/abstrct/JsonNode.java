package abstrct;

/**
 * Created by ioa on 18.04.17.
 */
public class JsonNode extends Node {

    protected JsonNode(String name) {
        super(name);
    }//jgmhgfn

    @Override
    public void printBegin() {
        System.out.print("{ " + name + ":");
    }
    @Override
    public void printEnd() {
        System.out.print(" }");

    }
}
