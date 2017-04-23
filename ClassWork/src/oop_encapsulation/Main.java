package oop_encapsulation;

/**
 * Created by ioa on 11.04.17.
 */

public class Main {
    public static void main(String[] args) {

        /* int[][] array = {{1,1},{3,4}};
        int[][] array1 = {{1,2},{3,4}};

        Matrix matrix1 = new Matrix(array);
        Matrix matrix2 = new Matrix(array1);

        matrix1.printMatrix();
        System.out.println();
        matrix2.printMatrix();
        */
        System.out.println("Создадим два массива matrix и matrix1:");

        Matrix matrix = new Matrix(5,4);
        Matrix matrix1 = new Matrix(4,3);

        System.out.println(matrix.getRows());
        System.out.println(matrix.getColumns() + "\n");
        matrix.printMatrix();
        System.out.println();

        System.out.println(matrix1.getRows());
        System.out.println(matrix1.getColumns() + "\n");
        matrix1.printMatrix();

        System.out.println("\nСравним объекты matrix и matrix1: " + matrix.equals(matrix1) + "\n");

        System.out.println("Транспонируем массив matrix: \n");
        Matrix transposeMatrix = matrix.transpose();
        transposeMatrix.printMatrix();
        System.out.println();


        System.out.println(transposeMatrix); // @override toString


    }
}
