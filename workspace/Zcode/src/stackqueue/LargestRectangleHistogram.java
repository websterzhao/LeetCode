package stackqueue;

import java.util.Stack;

public class LargestRectangleHistogram {
    public int largestRectangleArea(int[] height) {
        if(height.length==0)
            return 0;
        int nmax=0;
        int n=height.length;
        Stack<Integer> stk = new Stack<Integer>();
        for(int i=0;i<=n;i++){
        	int cur = i==n?Integer.MIN_VALUE:height[i];
        	while(!stk.empty()&&cur<height[stk.peek()]){
        		int h= height[stk.peek()];
        		stk.pop();
        		int w= stk.empty()?i:(i-stk.peek()-1);
        		nmax=nmax<w*h?w*h:nmax;
        	}
        	stk.push(i);
        }
        return nmax;
    }
}
