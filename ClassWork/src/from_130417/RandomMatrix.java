package from_130417;

import java.util.Random;

public class RandomMatrix {
	private int[][] data;
	private int rows;
	private int columns;

	public RandomMatrix(int n, int m) {
		data = new int[n][m];
		rows = n;
		columns = m;

		Random rnd = new Random();
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				data[i][j] = rnd.nextInt(100);
	}
	
	public RandomMatrix(int[][] data, int n, int m) {
		this.data = data;
		rows = n;
		columns = m;
	}

	public void print() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++)
				System.out.print(String.format("%3d", data[i][j]));
			System.out.println();
		}
	}

	@Override
	public boolean equals(Object obj) {
		if( obj == null)
			return false;
		RandomMatrix rm = (RandomMatrix)obj;

		if (rm.columns != this.columns || rm.rows != this.rows)
		    return false;

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                if (this.data[i][j] != rm.data[i][j]) {
                    return false;
                }
            }
        }
        return true;
	}
}
