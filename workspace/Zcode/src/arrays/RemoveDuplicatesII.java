package arrays;

import java.util.HashMap;


public class RemoveDuplicatesII {
	  public int removeDuplicates(int[] A) {
	        if(A==null||A.length<=2) return A.length;
	        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	        int wt=0;
	        int cnt=0;
	        for(int i=0;i<A.length;i++){
	            if(!map.containsKey(A[i]))
	                map.put(A[i],1);
	            else     
	                map.put(A[i],map.get(A[i])+1);
	            if(map.get(A[i])<=2){
	                A[wt++]=A[i];
	                cnt++;
	            }
	        }
	        return cnt;
	    }
}
