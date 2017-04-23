package vehicle.work0028;

/**
 * Created by ioa on 20.03.17.
 *
 * Вычислить факториал числа n. n! = 1*2*...*n-1*n;!
 *
 */
public class Solution {
    public static void main(String[] args) {
        int n = 5;
        long f = 1;
        for (int i=1; i<=n; i++){
            f *= i;
            System.out.println(f);
        }
        System.out.print("5! = " + f);

    }
}
