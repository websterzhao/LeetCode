package arrays;

public class SearchRange {
	   public int[] searchRange(int[] A, int target) {
	        int[] ret = new int[2];
	        ret[0]=findFirst(A, target);
	        if(ret[0]==-1)
	        	ret[1]=-1;
	        else
	        	ret[1]=findLast(A, target);	        
	        return ret;
	    }

	private int findFirst(int[] A, int target) {
        int beg= 0;
        int end= A.length-1;
        while(beg<end){                                 //(1)    use < instead of <=
        	int mid = beg+(end-beg)/2;
        	if(A[mid]>=target)                     
        		end=mid;                                 //(3) include current one 
        	else
        		beg=mid+1;
        }
        if(A[beg]==target)
        	return beg;
        else
        	return -1;
	}

	private int findLast(int[] A, int target) {
        int beg= 0;
        int end= A.length-1;
        while(beg<end){
        	int mid = beg+(end-beg+1)/2;            //(2) step one, otherwise infinite loop. when to use?just remember test with 2 elements
        	if(A[mid]<=target)
        		beg=mid;
        	else
        		end=mid-1;
        }
        if(A[beg]==target)
        	return beg;
        else
        	return -1;
	}
}
