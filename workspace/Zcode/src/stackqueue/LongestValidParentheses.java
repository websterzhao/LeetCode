package stackqueue;

import java.util.Stack;

public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        if(s.length()<2) return 0;
        int beg =0;
        int maxl=0;
        Stack<Integer> stk = new Stack<Integer>();
        for(int i =0;i<s.length();i++){
        	char cur = s.charAt(i);
        	if(cur=='(')
        		stk.push(i);
        	else{
        		if(stk.empty())  //one more ) will reset begin point
        			beg=i+1;
        		else{
        			stk.pop();
        			if(stk.empty())
        				maxl=maxl>(i-beg+1)?maxl:(i-beg+1);
        			else
        				maxl=maxl>(i-stk.peek())?maxl:(i-stk.peek());  ////very important
        		}
        	}
        }
        return maxl;
    }
}
