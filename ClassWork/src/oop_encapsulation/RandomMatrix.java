package oop_encapsulation;

import java.util.Random;

/**
 * Created by ioa on 11.04.17.
 */

class Matrix{
    private int[][] matrix;
    private int[][] transposeMatrix;

    public Matrix(int n, int m){
        matrix = new int[n][m];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++){
                matrix[i][j] = random.nextInt(100);
            }
        }
    }

    public Matrix(int[][] matrix){

        this.matrix = matrix;
    }

    public Matrix transpose(){
        transposeMatrix = new int [matrix[0].length][matrix.length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                transposeMatrix[i][j] = matrix[j][i];
            }
        }
        return new Matrix(transposeMatrix);
    }

    public void printMatrix(){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public String getRows(){
        int rows = matrix.length;
        return "Колличество строк: " + rows;
    }

    public String getColumns(){
        int columns = matrix[0].length;
        return "Колличество столбцов: " + columns;
    }

    @Override
    public boolean equals(Object obj) {
        if( obj == null)
            return false;
        Matrix rm = (Matrix) obj;

        if (rm.matrix.length != this.matrix.length || rm.matrix[0].length != this.matrix[0].length)
            return false;

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if (this.matrix[i][j] != rm.matrix[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("%s\n%s\n",
                getColumns(), getRows()));
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                builder.append(matrix[i][j] + " ");
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}