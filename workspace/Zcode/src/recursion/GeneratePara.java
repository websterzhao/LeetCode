package recursion;

import java.util.ArrayList;

public class GeneratePara {
	   public ArrayList<String> generateParenthesis(int n) {		      
	       if(n<=0) return null;
	       ArrayList<String> ret = new ArrayList<String>();
	       generate(ret, n, 0, 0, "");
	       return ret;	        
	    }


	private void generate(ArrayList<String> ret, int n, int l, int r, String s) {
		if(l==n&&r==n) 
			ret.add(s);
		if(r>l||l>n) return;
		
		generate(ret, n, l+1, r, s+"(");		
		generate(ret, n, l, r+1, s+")");		
	}
}
