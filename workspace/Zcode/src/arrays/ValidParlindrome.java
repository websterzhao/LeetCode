package arrays;

public class ValidParlindrome {
	   public boolean isPalindrome(String s) {
	         if(s.isEmpty()) return true;
	         char[] sc=s.toCharArray();
	         Value val=new Value();
	         return checkPalindrome(sc,val,1);
	        
	    }

	private boolean checkPalindrome(char[] s,Value val,int next) {
	    if(next>=s.length) return true;
	    boolean ret=checkPalindrome(s,val,next+1);
	    if(!ret) return false;
	    if(!Character.isLetterOrDigit(s[next]))
       	 	return true;
	    int i=val.start;
        while(i<s.length&&!Character.isLetterOrDigit(s[i])){
       	 i++;
        }
        val.start=i;
	    if( Character.toLowerCase(s[val.start])!=Character.toLowerCase(s[next])) return false;
	    val.start++;
		return true;
	}
}

class Value {
	int start = 0;
}
