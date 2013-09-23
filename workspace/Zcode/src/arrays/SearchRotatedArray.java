package arrays;

public class SearchRotatedArray {
	   public int search(int[] A, int target) {
            int m=0;
            int n= A.length-1;
            while(m<=n){
            	int mid=m+(n-m)/2;
            	if(A[mid]==target)
            		return mid;
            	else if(A[mid]>=A[m]){
            		if(A[m]<=target&&target<A[mid])
            			n=mid-1;
            		else
            			m=mid+1;
            	}            		
            	else{
            		if(target>A[mid]&&target<=A[n])
            			m=mid+1;
            		else
            			n=mid-1;
            	}            		
            }
            return -1;	        
	    }
}
