package test.work0025;

/**
 * Created by ioa on 18.03.17.
 *
 * Найти сумму четных чисел и их количество в диапазоне от 1 до 99
 *
 */
public class Main {
    public static void main(String[] args) {
        int summ = 0;
        int kol = 0;
        for (int i = 0; i<=99; i++){
            if (i%2==0){
                 summ = summ + i;
                 kol = kol+1;
            }
        }
        System.out.println("Сумма четных чисел в диапозоне от 1 до 99 = " + summ);
        System.out.println("Кол-во четных чисел в диапозоне от 1 до 99 = " + kol);

    }
}
