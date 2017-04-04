package modul_5_2;

import java.util.Random;

/**
 * Created by ioa on 28.03.17.
 *
 */
public class Solution {
    public static void main(String[] args){

//Задание 1. Заполните двухмерный массив случайными числами и
// построчно перенесите эти числа в одномерный массив.

        Random random = new Random();
        int[][] arr = new int[4][4];
        int[] arr2 = new int[arr.length*4];
        int[] arr3 = new int[arr.length*4];
        int t = 0;

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                arr[i][j] = random.nextInt(100);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr2[t] = arr[i][j];
                t++;
            }
        }
        System.out.println("По строкам: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        t = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr3[t] = arr[j][i];
                t++;
            }
        }
        System.out.println("\nПо столбикам: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
