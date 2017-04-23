package vehicle.work00211;

import java.util.Random;

/**
 * Created by ioa on 21.03.17.;
 * 1.Найти минимальный элемент массива
 * 2.Найти максимальный элемент массива
 * 3.Найти индекс минимального элемента массива
 * 4.Найти индекс максимального элемента массива
 * 5.Посчитать сумму элементов массива с нечетными индексами
 * 6.Сделать реверс массива (массив в обратном направлении)
 * 7.Посчитать количество нечетных элементов массива
 * 8.Поменять местами первую и вторую половину массива, например, для массива 1 2 3  4, результат 3 4 1 2
 * 9.Отсортировать массив (пузырьком (Bubble), выбором (Select), вставками (Insert))
 */
public class Solution {
    public static void main(String[] args){
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        int minvalue = arr[0];
        int maxvalue = arr[9];
        int arrlength = arr.length;
        int maxindex = 0;
        int minindex = 0;
        for (int i = 0; i < arr.length; i++){
            if (minvalue > arr[i])
                minvalue = arr[i];    //минимальный элемент массива
            if (maxvalue < arr[i])
                maxvalue = arr[i];    //максимальный элемент массива
            if (arrlength==0)
                minindex = arrlength; //минимальный индекс массива
            if (arrlength==arr.length)
                maxindex=arrlength;   //максимальный индекс массива
        }
        System.out.println("\nmin value = " + minvalue);
        System.out.println("max value = " + maxvalue);
        System.out.println("min index = " + minindex);
        System.out.println("max index = " + maxindex);

        int sum;
        for (int i = 0; i<arr.length; i++){


            }


        }



    }

