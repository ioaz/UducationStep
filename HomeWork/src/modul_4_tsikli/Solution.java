package modul_4_tsikli;

/**
 * Created by ioa on 03.04.17.
 * Задание 1
 * Написать программу которая выводит на экран первые 23 члена последовательности Фибоначчи.
 */
public class Solution {
    public static void main(String[] args) {
        int sum;
        int a = 1;
        int b = 0;
        int n = 23;
        for(int i = 0; i < n; i++){
            sum = a + b;
            a = b;
            b = sum;
            System.out.println(sum);
        }
    }
}
