package test.work0021;

import java.util.Scanner;

/**
 * Created by ioa on 18.03.17.
 *
 * 1.Если а – четное посчитать а*б, иначе а+б
 *
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a % 2 == 0) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("a * b = " + (a * b));
        }
        else {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("a + b = " + (a + b));
        }
    }
}
