package DP;

public class MaximalRectangle {
	  public int maximalRectangle(char[][] matrix) {
	        int m = matrix.length;
	        int n = matrix[0].length;
	        int[][] rec= new int[m][n];
	        rec[0][0]=matrix[0][0];
	        int ret = 0;
	        for(int i =1;i<n;i++){
	        	rec[0][i]=matrix[0][i]==0?0:rec[0][i-1]+1;
	        	ret = ret<rec[0][i]?rec[0][i]:ret;
	        }
	        for(int i =1;i<m;i++){
	        	rec[i][0]=matrix[i][0]==0?0:rec[i-1][0]+1;
	        	ret = ret<rec[i][0]?rec[i][0]:ret;
	        }
	        for(int i =1;i<m;i++){
	        	for(int j =1;j<n;j++){
	        		if(matrix[i][j]==0) 
	        			rec[i][j]=0;
	        		else if(rec[i-1][j]==0||rec[i][j-1]==0||rec[i-1][j-1]==0)
	        			rec[i][j]=0;
	        		else{
	        			
	        		}	        		
	        		ret = ret<rec[i][j]?rec[i][j]:ret;
	        	}
	        }
	        
	        
	    }
}
