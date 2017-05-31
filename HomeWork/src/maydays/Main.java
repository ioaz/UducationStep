package maydays;

import java.io.IOException;

/**
 * Created by ioa on 17.05.17.
 */
public class Main {

//    public static class ArrayIndexOutOfBoundsException extends Exception {
//
//    }
    
    public static void main(String[] args) throws IOException {

        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.addLast("1");
        linkedList.addLast("2");
        linkedList.addFirst("first");
        linkedList.addLast("3");
        linkedList.addLast("4");
        linkedList.addLast("5");

        for (String s : linkedList) {
            System.out.println(s);
        }

//        System.out.println(linkedList.getItemByIndex(0));
//        System.out.println(linkedList.getItemByIndex(1));
//        System.out.println(linkedList.getItemByIndex(2));
//        System.out.println(linkedList.getItemByIndex(3));
//        System.out.println(linkedList.getItemByIndex(4));
//        System.out.println(linkedList.getItemByIndex(5));
//        for (String s : linkedList) {
//            System.out.println(s);
//        }
//
//        Iterator iterator = linkedList.descendingIterator();
//        while (iterator.hasNext())
//            System.out.println(iterator.next());

//        System.out.println("size: " + linkedList.size());
//
//        for (int i = 0; i < linkedList.size(); i++) {
//            System.out.println(linkedList.getItemByIndex(i));
//        }
        //        Scanner scanner = new Scanner(System.in);
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
////        List<String> listString = new ArrayList();
//        List<Integer> listInteger = new ArrayList();
////        List<Object> list2 = new ArrayList();
//
//        /* listString of Integer */
//
//        for (int i = 0; i < 10; i++) {
//            listInteger.add(i);
        }
        //try {
        //    try {
        //        listInteger.get(55);
        //    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        //        throw new ArrayIndexOutOfBoundsException();
        //    }
        //} catch (ArrayIndexOutOfBoundsException e) {
        //    System.out.println("exception");
        //}
//
//        while (true){
//            System.out.println("1. size();");
//            System.out.println("2. get(int index);");
//            System.out.println("3. set(int index, T item);");
//            System.out.println("4. add(T item);");
//            System.out.println("5. insert(int index, T item);");
//            System.out.println("6. remove(int index);");
//            System.out.println("7. print list.");
//
//            int index = 0;
//            int item = 0;
//            int choice = 0;
////            int choice = scanner.nextInt();
//
//            try {
//                choice = Integer.parseInt(reader.readLine());
//            }catch (NumberFormatException e){
//                System.out.println("You need to choose, try again.");
//            }
//            if (choice > 7)
//                System.out.println("wrong choice, try again");
////                throw new Throwable();
//            switch (choice){
//                case 1:
//                    System.out.println("size = " + listInteger.size());
//                    break;
//                case 2:
//                    try {
//                        System.out.println("index: ");
//                        index = Integer.parseInt(reader.readLine());
//                        System.out.println("items["+index+"]: "+ listInteger.get(index));
//                    }catch (ArrayIndexOutOfBoundsException e){
//                        System.out.println("Index: "+index+", Length: "+
//                                + listInteger.size());
//                    }catch (NumberFormatException e){
//                        System.out.println("You must enter an integer.");
//                    }
//                    break;
//                case 3:
//                    try {
//                        System.out.println("index: ");
//                        index = Integer.parseInt(reader.readLine());
//                        System.out.println("new item: ");
//                        item = Integer.parseInt(reader.readLine());
//                        System.out.println("old value: " +
//                                listInteger.set(item, index) + "\nnewValue: " + item);
//                    }catch (NumberFormatException e) {
//                        System.out.println("index or item must be an integer.");
//                    }catch (ArrayIndexOutOfBoundsException e) {
//                        System.out.println("Index: "+index+", Length: "+
//                                + listInteger.size());
//                    }
//                    break;
//                case 4:
//                    try {
//                        System.out.println("new item: ");
//                        item = Integer.parseInt(reader.readLine());
//                        listInteger.add(item);
//                    }catch (ArrayIndexOutOfBoundsException e){
//                        System.out.println("Index: "+index+", Length: "+
//                                + listInteger.size());
//                    }catch (NumberFormatException e) {
//                        System.out.println("item must be an integer.");
//                    }
//                    break;
//                case 5:
//                    try {
//                        System.out.println("index: ");
//                        index = Integer.parseInt(reader.readLine());
//                        System.out.println("new item: ");
//                        item = Integer.parseInt(reader.readLine());
//                        listInteger.insert(index, item);
//                    }catch (ArrayIndexOutOfBoundsException e){
//                        System.out.println("Index: "+index+", Length: "+
//                                + listInteger.size());
//                    }catch (NumberFormatException e){
//                        System.out.println("item must be an integer.");
//                    }
//                    break;
//                case 6:
//                    try {
//                        System.out.println("index: ");
//                        index = Integer.parseInt(reader.readLine());
//                        System.out.println("removed value: " +
//                                listInteger.remove(index));
//                    }catch (ArrayIndexOutOfBoundsException e){
//                        System.out.println("Index: "+index+", Length: "+
//                                + listInteger.size());
//                    }catch (NumberFormatException e){
//                        System.out.println("index must be an integer.");
//                    }
//                    break;
//                case 7:
//                    System.out.print("List <Integer>: ");
//                    for(int i = 0; i<listInteger.size(); i++){
//                        System.out.print(listInteger.get(i) + ", ");
//                    }
//                    System.out.println();
//                default:
//                    break;
//            }
//        }


        /* listString of String */
//
//
//        listString.add("2");
//        listString.add("bla");
//        listString.add("blabla");
//        listString.add("blablabla");
//        listString.set(1,"5");
//
//
//        list2.add(listString);
//        list2.add(listInteger);
//        list2.add("blabla");
//        list2.add(0);
//
//
//        listInteger.remove(0);
//        listInteger.add(0);
//        listInteger.add(6);
//        listInteger.insert(3,0);
//        listInteger.insert(6,0);
//        listInteger.remove(6);
//
//
//
//        listString.insert(1,"zero");
//        listString.insert(4,"*");
//


//        System.out.print("\nList <String>: ");
//        for(int i = 0; i<listString.size(); i++){
//            System.out.print(listString.get(i) + " ");
//        }

//        System.out.print("\nList <Object>: ");
//        for(int i = 0; i<list2.size(); i++){
//            System.out.print(list2.get(i) + " ");
//        }
    }

