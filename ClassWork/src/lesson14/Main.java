package lesson14;

import java.util.Scanner;

/**
 * Created by ioa on 18.05.17.
 */
public class Main {
    public static class ExitException extends Exception{

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                try {
                    Integer a = scanner.nextInt();
                    Integer b = scanner.nextInt();
                    System.out.println(a / b);
                } catch (ArithmeticException e) {
                    //e.printStackTrace(System.err);
                    System.out.println("Недопустимая арифметическая операция, Выходим");
                    throw new ExitException();
                }
            }
        }catch (ExitException e){
            System.err.println("Вышли");;
        }
    }
}
