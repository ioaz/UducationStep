package modul_5_2_Massivy;

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
        //Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();
        int[][] arr = new int[4][4];
        int t = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = t;
                System.out.print(arr[i][j] + " ");
                t++;
            }
            System.out.println();
        }


       /* for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                System.out.print(arr[i][arr.length-1] + " " );
            }
            System.out.println();
        }*/

        int x = 0, y = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == arr.length - arr.length && j == arr.length - 1) {
                    y = i;
                    x = j;
                   System.out.println(y + " " + x);
                }
                //System.out.print(arr[i][arr.length-1] + " " );

            }
            //System.out.println();
        }
        for (int i = y ; i < arr.length; ) {
            for (int j = x; i < arr.length;i++ ) {
                arr[0][arr.length - 1] = 5;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("dvdv");
    }
}

