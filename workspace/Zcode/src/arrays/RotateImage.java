package arrays;

public class RotateImage {
    public void rotate(int[][] matrix) {
        int nStart = 0;
   	 int nDim = matrix.length;
   	    while (nDim > 1)
   	    {
   	        for (int i = 0; i < nDim-1; i++)
   	        {
   	            swap(matrix,nStart,nStart+i, nStart+i,nStart+nDim-1);
   	            swap(matrix,nStart,nStart+i, nStart+nDim-1,nStart+nDim-1-i);
   	            swap(matrix,nStart,nStart+i, nStart+nDim-1-i,nStart);
   	        }
   	 
   	        nStart++;
   	        nDim -= 2;
   	    }    
   }

	private void swap(int[][] matrix, int i, int j, int m, int n) {
		int temp =matrix[i][j];
		matrix[i][j]=matrix[m][n];
		matrix[m][n]=temp;		
	}
}
