package arrays;

public class LengthofLastWord {
	   public int lengthOfLastWord(String s) {
		   int i = s.length()-1;
		   int cnt=0;
           while(i>=0&&s.charAt(i)==' ')   //i >=0
    		   i--;
	       while(i>=0){
	        	if(s.charAt(i)==' '){
	        		return cnt;
	        	}
	        	cnt++;
	        	i--;	    	   
	        }
	        return cnt;
	    }
}
