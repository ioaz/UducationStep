package vehicle.work0024;

import java.util.Scanner;

/**
 * Created by ioa on 18.03.17.
 *
 * Посчитать выражение макс(а*б*с, а+б+с)+3
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
        int max;
        if ((a+b+c) > (a*b*c))
            max = a+b+c+3;
        else max = a*b*c+3;
        System.out.println("max = " + max);

    }
}
