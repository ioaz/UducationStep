package from_130417;

public class Main {

	public static void main(String[] args) {
		int[][] array = {{1,2},{3,4}};
        int[][] array1 = {{1,9},{3,4}};

		RandomMatrix matrix1 = new RandomMatrix(array, 2, 2);
		RandomMatrix matrix2 = new RandomMatrix(array1, 2, 2);
		
		matrix1.print();
		System.out.println();
		matrix2.print();
		System.out.println("Matrix 1 equals Matrix 2 " + matrix1.equals(matrix2));
	}

}
