package arrays;

import java.util.ArrayList;

public class SpiralMatrix {
	   public ArrayList<Integer> spiralOrder(int[][] matrix) {		   
		   ArrayList<Integer> ret = new ArrayList<Integer>();
		   if(matrix.length==0) return ret;  
	       int m = matrix.length;
	       int n = matrix[0].length;
	       int x=0;
	       int y=0;
		   while(m>0&&n>0){
			   if(m==1){
				   for(int i =0;i<n;i++){
					   ret.add(matrix[x][y+i]);
				   }
				   m--;
			   }
			   else if(n==1){
				   for(int i =0;i<m;i++){
					   ret.add(matrix[x+i][y]);
				   }
				   n--;
			   }
			   else{
				   for(int i =0;i<n-1;i++){
					   ret.add(matrix[x][y+i]);
				   }
				   for(int i =0;i<m-1;i++){
					   ret.add(matrix[x+i][y+n-1]);
				   }
				   for(int i =0;i<n-1;i++){
					   ret.add(matrix[x+m-1][y+n-1-i]);
				   }
				   for(int i =0;i<m-1;i++){
					   ret.add(matrix[x+m-1-i][y]);
				   }
				   x++;
				   y++;
				   m=m-2;
				   n=n-2;
			   }
		   }
		   return ret;
	    }
}
