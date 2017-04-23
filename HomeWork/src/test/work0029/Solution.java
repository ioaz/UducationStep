package test.work0029;

/**
 * Created by ioa on 20.03.17.
 *
 * Посчитать сумму цифр заданного числа
 *
 */
public class Solution {
    public static void main(String[] args) {
        int num = 111;
        int sum = 0;
        for (sum = 0; num!=0; num/=10){
            sum += num % 10;
            //System.out.println(sum);
        }
        System.out.println(sum);

    }
}
