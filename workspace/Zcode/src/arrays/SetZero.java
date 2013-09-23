package arrays;

public class SetZero {
    public void setZeroes(int[][] matrix) {
    	int x = matrix.length;
		int y = matrix[0].length;
		boolean firstcolzero = false;
		boolean firstrowzero = false;
		for (int i = 0; i < x; i++) {
			if (matrix[i][0] == 0)
				firstcolzero = true;
		}
		for (int i = 0; i < y; i++) {
			if (matrix[0][i] == 0)
				firstrowzero = true;
		}
		for (int i = 1; i < x; i++) {
			for (int j = 1; j < y; j++) {
				if (matrix[i][j] == 0) {
					matrix[0][j] = 0;
					matrix[i][0] = 0;
				}
			}
		}
		for (int i = 1; i < x; i++) {
			for (int j = 1; j < y; j++) {
				if (matrix[0][j] == 0||matrix[i][0] == 0) {
					matrix[i][j] = 0;
				}
			}
		}
		if (firstcolzero == true) {
			for (int i = 0; i < x; i++) {
				matrix[i][0] = 0;
			}
		}
		
		if (firstrowzero == true) {
			for (int i = 0; i < y; i++) {
				matrix[0][i] = 0;
			}
		}
	}
}
