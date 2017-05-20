package list;

/**
 * Created by ioa on 02.05.17.
 */
public class Main {

    public static void main(String[] args) {
        List<Integer> list = new DynamicArray();
        for (int i = 0; i<10; i++){
            list.add(i);
        }
        list.remove(6);

        list.get(5);
        for (int i =0 ; i<list.size(); i++){
            System.out.print(list.get(i));
            System.out.print(" ");
        }
    }
}