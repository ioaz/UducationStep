package test.work0023;

import java.util.Scanner;

/**
 * Created by ioa on 18.03.17.
 *
 * Найти сумму только положительных из трех чисел
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a = ");
        int a = in.nextInt();
        System.out.print("b = ");
        int b = in.nextInt();
        System.out.print("c = ");
        int c = in.nextInt();
        /*
        int res;
        if (a>0)
            res = a;
        else res = 0;
        if (b>0)
            res = res+b;
        else res = res;
        if (c>0)
            res = res+c;
        else res = res;
        System.out.println("Сумма положительных чисел = " + res);
        */
        int result = a > 0 ? a : 0;
        result = b > 0 ? result + b : result;
        result = c > 0 ? result + c : result;
        System.out.println("Сумма положительных чисел = " + result);
    }
}

