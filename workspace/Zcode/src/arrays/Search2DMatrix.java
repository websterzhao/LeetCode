package arrays;

public class Search2DMatrix {
	 public boolean searchMatrix(int[][] matrix, int target) {
	        int m = matrix.length;
	        int n = matrix[0].length;
		    int beg = 0;
	        int end = m*n-1;
	        while(beg<=end){
	        	int mid = beg + (end-beg)/2;
	        	int temp = matrix[mid/n][mid%n];
	        	if(temp==target)
	        		return true;
	        	else if(temp>target)
	        		end=mid-1;
	        	else
	        		beg=mid+1;
	        }
	        return false;
	    }
}
