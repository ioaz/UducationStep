package abstrct;

/**
 * Created by ioa on 18.04.17.
 */
public class Main {

    public static void main(String[] args) {
        new XmlNode("tag").print(5);
        System.out.println();
        new JsonNode("tag").print(5);
    }

}
