package DP;

public class UniquePath {
	  public int uniquePaths(int m, int n) {
	        int[][] ret = new int[m][n];
	        for(int i = 0; i<n;i++){
	        	ret[m-1][i]=1;
	        }
	        for(int i = 0; i<m;i++){
	        	ret[i][n-1]=1;
	        }
	        for(int i=m-2;i>=0;i--){
	        	for(int j=n-2;j>=0;j--){
	        		ret[i][j]=ret[i+1][j]+ret[i][j+1];
	        	}
	        }
	        return ret[0][0];
	    }
}
