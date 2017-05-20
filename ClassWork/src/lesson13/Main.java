package lesson13;

/**
 * Created by ioa on 16.05.17.
 */
public class Main {

    String name;

    public Main(String name){
        this.name = name;
    }

    private static class NestedWork{
        public void work(){
            System.out.println("I am Nested");
        }
    }
    private class InnerWork{
        public void work(){
            System.out.println("I am Inner of " + name);
        }

    }
    public static void main(String[] args) {
        new Main.NestedWork().work();
        new Main("First Main").new InnerWork().work();
    }
}
