package test;


import arrays.SpiralMatrix;


public class TestRotateImage {

	public static void main(String[] args) {
		SpiralMatrix sq = new SpiralMatrix();
		int[][]  matrix={{1,2,3},{4,5,6}};
        System.out.println(sq.spiralOrder(matrix));


	}

}
