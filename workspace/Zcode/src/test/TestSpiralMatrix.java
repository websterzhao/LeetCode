package test;


import arrays.RotateImage;



public class TestSpiralMatrix {

	public static void main(String[] args) {
		RotateImage sq = new RotateImage();
		int[][]  matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		sq.rotate(matrix);
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix.length;j++){
				 System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
