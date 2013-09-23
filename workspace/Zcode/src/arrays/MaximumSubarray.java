package arrays;

public class MaximumSubarray {
	  public int maxSubArray(int[] A) {
	        int ret = Integer.MIN_VALUE;
	        int temp = 0;
	        for(int i:A){
	        	temp+=i;	
	        	ret=temp>ret?temp:ret;
	        	if(temp<0){
	        		temp = 0;
	        	}	        	
	        }
	        return ret;
	    }
}
