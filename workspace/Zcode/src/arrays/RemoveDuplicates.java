package arrays;

import java.util.HashSet;


public class RemoveDuplicates {
    public int removeDuplicates0(int[] A) {
          int len = A.length;
          int cur = 0;
          HashSet<Integer> set = new HashSet<Integer>();
          for(int i = 0; i <len;i++){
        	  if(!set.contains(A[i])){
        		  set.add(A[i]);
        		  A[cur] = A[i];
        		  cur++;
        	  }
          }
          return cur;
    }
    
    public int removeDuplicates(int[] A) {
        int len = A.length;
        int prev = Integer.MAX_VALUE;
        int counter = 0;
        for(int i= 0;i<len;i++){
            if(A[i]!=prev){
                A[counter]=A[i];
                counter++;
                prev=A[i];
            }
        }
        return counter;
    }
    
    
	public int removeDuplicates2(int[] A) {
		int len = A.length;
		int prev = Integer.MAX_VALUE;
		int counter = 0;
		int cnt = 0;
		for (int i = 0; i < len; i++) {
			if (A[i] != prev) {
				A[counter] = A[i];
				counter++;
				prev = A[i];
				cnt = 1;
			} else if (cnt < 2) {
				A[counter] = A[i];
				counter++;
				cnt++;
			} else
				cnt++;
		}
		return counter;
	}
	   public int removeDuplicates3(int[] A) {
	        if(A==null||A.length==0) return 0;
	        int wr=0;
	        int cnt=1;
	        for(int i=1;i<A.length;i++){
	            if(A[i]!=A[wr]){
	                cnt++;
	                A[++wr]=A[i];
	            }
	        }
	        return cnt;
	    }   
}
