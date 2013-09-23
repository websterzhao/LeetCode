package math;

public class ReverseInteger {
	   public int reverse(int x) { 
		   boolean neg = false;
	       if(x<0){
	    	   neg=true;
	    	   x=-x;
	       }
	       int ret=0;
	       while(x>0){
	    	   ret=ret*10;
	    	   ret= ret + x%10;
	    	   x=x/10;    	   
	       }
	       if(neg)
	    	   return -ret;
	       else 
	    	   return ret;
	        
	    }
}
