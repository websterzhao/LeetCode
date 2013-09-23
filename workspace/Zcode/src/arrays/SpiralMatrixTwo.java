package arrays;


public class SpiralMatrixTwo {
	public int[][] generateMatrix(int n) {	   
	//	   if(n<1) return null;
		   int[][]  matrix= new int[n][n];
		   
	       int x=0;
	       int k=1;
		   while(n>0){
			   if(n==1){
                    matrix[x][x]=k;
                    n--;
				   }
			   else{
				   for(int i =0;i<n-1;i++){
					   matrix[x][x+i]=k++;
				   }
				   for(int i =0;i<n-1;i++){
					   matrix[x+i][x+n-1]=k++;
				   }
				   for(int i =0;i<n-1;i++){
					   matrix[x+n-1][x+n-1-i]=k++;
				   }
				   for(int i =0;i<n-1;i++){
					   matrix[x+n-1-i][x]=k++;
				   }
				   x++;
				   n=n-2;
			   }
		   }
		   return matrix;
	    }
}
