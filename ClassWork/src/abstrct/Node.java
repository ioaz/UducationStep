package abstrct;

/**
 * Created by ioa on 18.04.17.
 */
public abstract class Node {
    protected String name;

    protected Node(String name){
        this.name = name;
    }

    public abstract void printEnd();
    public abstract void printBegin();

    public void print(Integer value){
        printBegin();
        System.out.print(value);
        printEnd();
    }
}
