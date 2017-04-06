package modul_5_2_Massivy;

import java.util.Random;

/**
 * Created by ioa on 03.04.17.
 * Задание 2
 Создать квадратный массив размерности n заполненный случайными числами,
 найти наименьший и наибольший элемент массива и вывести их на экран
 (если это несколько одинкаовых элементов — вывести индексы где есть повторения).
 Вывести на экран время выполнения поиска, в милисикундах. Размерность массива
 должна задаваться переменной n.
 */
public class Solution2 {
    public static void main(String[] args) {
        //long startTime = System.currentTimeMillis();
        Random random = new Random();
        int n = 4;
        int[][] arr = new int[n][n];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                arr[i][j] = random.nextInt(100);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int min = arr[0][0], max = arr[0][0];
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("min = " + min );
        System.out.println("max = " + max);
        System.out.println();
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (min == arr[i][j]) {
                    System.out.println("min indexes: " + "["+i+"]" + "["+j+"]");
                }
            }
        }
        System.out.println();
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (max == arr[i][j]) {
                    System.out.println("max indexes: " + "[" + i + "]" + "[" + j + "]");
                }
            }
        }
    }
}
