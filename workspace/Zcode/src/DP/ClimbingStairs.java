package DP;

public class ClimbingStairs {
	   public int climbStairs(int n) {
		   int s1=1;
		   int s2=2;
	       int i=3;
	       int s = 0;
	       for(;i<=n;i++){
	    	   s=s1+s2;
	    	   s1=s2;
	    	   s2=s;	
	       }
	       if(n==1) return 1;
	       if(n==2) return 2;
	       return s;		   
	    }
}
