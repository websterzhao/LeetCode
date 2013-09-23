package math;

public class PalindromeNumber {
	   public boolean isPalindrome(int x) {
	     if(x<0) 
	    	 return false;
	     int y=x;
	     int count=-1;
	     while(y!=0){
	    	 y=y/10;
//	    	 max=max*10;             overflowed
	    	 count++;
	     }
	     y=x;
	     int max=(int) Math.pow(10,count);
	     while(y>0){
	    	int first = y/max;
	    	int last =y%10;
	    	if(first!=last) return false;
	    	y=y-first*max;
	    	y=(y-last)/10;
	    	max/=100;
	     }
	    	 
	     return true;	 
	  }
}
