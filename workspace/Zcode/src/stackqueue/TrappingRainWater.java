package stackqueue;

import java.util.Stack;

public class TrappingRainWater {
	  public int trap(int[] A) {
	        int n = A.length;
	        int ret=0;
	        Stack<Integer> stk = new Stack<Integer>();
	        for(int i =0;i<n;i++){	     	        		
	        	if(!stk.empty()&&A[i]>A[stk.peek()]){
	        		int base = stk.pop();	        
	        		while(!stk.empty()&&A[i]>A[stk.peek()]){
	        			ret+=(A[stk.peek()]-A[base])*(i-stk.peek()-1);	        
	        			base = stk.pop();
	        		}
	        		if(!stk.empty())
	        			ret+=(A[i]-A[base])*(i-stk.peek()-1);
	        	}
	        	stk.push(i);	   
	        }
	        return ret;	        
	    }
}
