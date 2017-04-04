package modul_5_2;

import java.util.Scanner;

/**
 * Created by ioa on 03.04.17.
 * Задание 3
 * Заполните n мерный квадратный массив числами, которые увеличиваются на 1 по спирали.
 * Выведите результат на экран с соблюдением ширины столбцов. Размерность должна задаваться c клавиатуры.
 *  1  2  3  4
 *  12 13 14 5
 *  11 16 15 6
 *  10 9  8  7
 *
 */
public class Sulution3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        int t = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                arr[i][j] = t;
                System.out.print(arr[i][j] + " ");
                t++;
            }
            System.out.println();
        }

        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[0][j] == arr.length - 1) {
                   for (int k = 0; k < arr.length; k++){
                       arr[1][k] = arr[2][k];
                       System.out.print(arr[i][k]);
                   }
                    System.out.println();
                }
            }
        }
    }
}
