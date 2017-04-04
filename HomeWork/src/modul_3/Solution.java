package modul_3;

/**
 * Created by ioa on 22.03.17.
 */

public class Solution {
    public static void main(String[] args) {

        /**
         * /**
         * 1. Прямоугольные треугольники.
         *
         * *
         * **
         * ***
         * ****
         * *****
         */
        System.out.println("1. Прямоугольные треугольники.");
        int triangle = 5;
        for (int i = 0; i <= triangle; i++) {
            for (int j = 0; j <= triangle; j++) {
                if (j < i)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        /**
         * *
         * **
         * * *
         * *  *
         * *****
         */

        for (int i = 0; i < triangle; i++) {
            for (int j = 0; j < triangle; j++) {
                if (j == i || j == 0 || i == triangle-1)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        /**
         * *****
         *  *  *
         *   * *
         *    **
         *     *
         */

        for (int i = 0; i < triangle; i++) {
            for (int j = 0; j < triangle; j++) {
                if (i == j || i == 0 || j == triangle - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        /**
         * *****
         *  ****
         *   ***
         *    **
         *     *
         */
        System.out.println();
        for (int i = 0; i < triangle; i++) {
            for (int j = 0; j < triangle; j++) {
                if (j > i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        /**
         * *****
         * ****
         * ***
         * **
         * *
         */
        for (int i = 0; i < triangle; i++) {
            for (int j = 0; j < triangle; j++) {
                if (j > i - 1)
                    System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        /**
         * *****
         * *  *
         * * *
         * **
         * *
         */
        for (int i = 0; i < triangle; i++) {
            for (int j = 0; j < triangle; j++) {
                if (j == 0 || j == triangle-i-1 || i == 0)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        /**
         *     *
         *    **
         *   ***
         *  ****
         * *****
         */
        for ( int i = 0; i < triangle; i++){
            for (int j = 0; j < triangle; j++){
                if (i >= triangle-j-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        /**
         *     *
         *    **
         *   * *
         *  *  *
         * *****
         */
        for ( int i = 0; i < triangle; i++){
            for (int j = 0; j < triangle; j++){
                if (j == triangle-i-1 || i == triangle -1 || j == triangle-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        /**
         * 3. Равнобедренный прямоугольный треугольник, прямым углом вверх заполненный и пустой.*
         */

        System.out.println("\n3. Равнобедренный прямоугольный треугольник, " +
                "прямым углом вверх заполненный и пустой.\n");
        /**
         *     *
         *    * *
         *   *   *
         *  *     *
         * *********
         */
        int isostri = 9;
        for (int i = 0; i < isostri / 2 + 1; i++) {
            for (int j = 0; j < isostri; j++) {
                if (i == (isostri/2) || i == j-(isostri/2) || i == (isostri/2)-j)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        /**
         *     *
         *    ***
         *   *****
         *  *******
         * *********
         */
        System.out.println();
        for (int i = 0; i < isostri/2+1; i++) {
            for (int j = 0; j < isostri; j++) {
                if ((i >= (isostri/2)-j) && (i > j-(isostri/2)-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        /**
         * 4.Ромб заполненный и пустой.
         */
        System.out.println("\n4.Ромб заполненный и пустой.\n");
        int rhombus = 9;
        for (int i = 0; i < rhombus; i++) {
            for (int j = 0; j < rhombus; j++) {
                if (    i == (j-rhombus/2)
                        || i == (rhombus/2)-j
                        || (i-3) == (rhombus-j)
                        || (i-rhombus/2) == j) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < rhombus; i++){
            for (int j = 0; j < rhombus; j++){
                if (       (i >= (rhombus/2)-j)
                        && (j-4 < i+1)
                        && (i-(rhombus/2)-1 < j)
                        && (i <= (rhombus+(rhombus/2))-j-1))
                System.out.print("*");
                else System.out.print(" ");
            }


            System.out.println();
        }

        /** 5. Параллелограмм заполненный и пустой.
         *     *************************
         *    *                       *
         *   *                       *
         *  *                       *
         * *************************
         */
        System.out.println("\n5. Параллелограмм заполненный и пустой.\n");

        int parall = 25;
        for (int i = 0; i < (parall/5); i++){
            for (int j = 0; j < parall; j++){
                if ((i >= (parall/5)-j-1) && (i < (parall-j))) {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < (parall/5); i++){
            for (int j = 0; j < parall; j++){
                if (j == (parall/5)-i-1
                        || ((i == 0) && (j > 4))
                        || j == parall-i-1
                        || ((i == (parall/5)-1) && (j < (parall-4)))) {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
        /**
        * 6. Каркас куба.
        */
        System.out.println("\n6. Каркас куба.\n");

        int cube = 10;
        for (int i = 1; i < cube; i++){
            for (int j = 1; j < (cube*2); j++){
                if (       j == (cube/2)-i//левый верхний угол
                        || j == (cube*2)-i+5//нижний правый угол
                        ||(i == 1 && j > 3)//верх
                        ||(i == (cube-1) && j <= (cube*2-4))//низ
                        ||(j == 1 && i > 3) //левая
                        ||(j == (cube*2-1) && i <= (cube-4))//правая
                        ||(j == (cube*2)-i && j >= (cube*2)-4)//правый верхний угол
                        ||(j == cube-i && i >= (cube-4))//нижний левый угол
                        ||(i == 4 && j < (cube*2)-4)
                        ||(i == (cube-4) && (j+6) > cube)
                        ||(j == 4 && i<cube/2+2)
                        ||(j == (cube*2)-4 && i >= (cube/2)))
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        /**
         * 7.Трапеция
         */
        System.out.println("\n7. Трапеция\n");
        int trap = 10;
        for (int i = 1; i <= (trap/2); i++){
            for (int j = 1; j <= (trap*2); j++){
                if (       j == (trap/2)-i+1
                        || j == (i*2)+trap
                        ||(i == 1) && (j >= (cube/2)) && (j <= (cube+1))
                        || i == cube/2) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        /**
         * 8. Гексагон
         */
        System.out.println("\n8. Шестиугольник\n");

        int gek = 14;
        for (int i = 1; i < gek-3; i++){
            for (int j = 1; j <= gek; j++){
                if (       j == ((gek/2)+2)-(i*2)
                        || j == (gek*2-1)-(i*2)
                        ||(i > 3) && (j == 1) && (i <= (gek/2))
                        || j == (i*2)-((gek/2)+6)
                        || j == (i*2)+(gek/2-2)
                        ||(j == gek-1 && i>4 && i<8) ) {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
        /**
         * 9.Круг
         *
         *            * * *
         *         *         *
         *        *           *
         *        *           *
         *         *         *
         *            * * *
         *
         */
        System.out.println("\n9.Круг\n");
        int circle = 13;
        for (int i = 1; i <= circle/2; i++){
            for (int j = 1; j <= circle; j++){
                if (      (i == 1) && ((j == 5) || (j == 7) || (j == 9))
                        ||(i == circle/2) && ((j == 5) || (j == 7) || (j == 9))
                        ||(j == 1) && ((i == 3) || (i == 4))
                        ||(i == 2) && (j == 2)
                        ||(i == 5) && (j == 2)
                        ||(j == circle) && ((i == 3) || (i == 4))
                        ||(i == 2) && (j == (circle-1))
                        ||(i == 5) && (j == (circle-1))){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}

