package test.work0026;

import java.util.Scanner;

/**
 * Created by ioa on 18.03.17.
 *
 * Проверить простое ли число?
 *
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(n==1) // 1 - не простое число
            System.out.println("составное");
        if (n==2 || n==3)
            System.out.println("простое");

            // перебираем возможные делители от 2 до sqrt(n)
            for (int d = 2; d * d <= n; d++) {
                // если разделилось нацело, то составное
                if (n % d == 0)
                    System.out.println("составное");
                else System.out.println("простое");
            }
    }
}
