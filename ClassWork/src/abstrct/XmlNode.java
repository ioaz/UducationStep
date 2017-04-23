package abstrct;

/**
 * Created by ioa on 18.04.17.
 */
public class XmlNode extends Node {

    XmlNode(String name) {
        super(name); // вызывает конструктор родителя
    }
    @Override
    public void printBegin() {
        System.out.print("<" + name + "> ");

    }
    @Override
    public void printEnd() {
        System.out.println(" </" + name + ">");
    }
}
