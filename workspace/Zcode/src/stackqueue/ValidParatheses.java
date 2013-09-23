package stackqueue;

import java.util.Stack;

public class ValidParatheses {
    public boolean isValid(String s) {
        if(s==null) return true;             
        Stack<Character> stack= new Stack<Character>();
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
        	if(isleft(c))
        		stack.push(c);
        	else{
                if(stack.empty()) return false;
        		char t = stack.pop();
        		if(!isMatch(t,c))
        			return false;
        	}
        }
        if(!stack.empty()) return false;
        return true;        
    }

	private boolean isMatch(char t, char c) {
		if((t=='{'&&c=='}')||
		  (t=='['&&c==']')||
		  (t=='('&&c==')'))
			return true;
		else
			return false;
	}

	private boolean isleft(char c) {
		if(c=='{'||c=='['||c=='(')
			return true;
		else
			return false;
	}
}
