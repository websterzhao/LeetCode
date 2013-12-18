package arrays;

public class SearchRotatedArrayII {
	   public boolean search(int[] A, int target){
	   	    int l = 0, r = A.length - 1;
	        while (l <= r) {
	            int m= l+(r-l)/2;
	            if(A[m]==target)
	                return true;
	            else if(A[l]<A[m]){
	                if(target>=A[l]&&target<A[m])
	                    r=m-1;
	                else
	                    l=m+1;
	            }   
	            else if(A[l]>A[m]){
	                if(target>A[m]&&target<=A[r])
	                    l=m+1;
	                else
	                    r=m-1;
	            }
	            else
	                l++;
	        }
	      return false;
		}
}
