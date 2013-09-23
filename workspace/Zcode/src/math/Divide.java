package math;

public class Divide {
	 public int divide(int dividend, int divisor) {
          	boolean neg = false;
	        if(dividend>=0&&divisor<0||dividend<=0&&divisor>0)
	        	neg= true;
	        long dd = dividend<0?-(long)dividend:dividend;  //需要先Cast，  把10000。。。00变成  1111.。。11110000。。。00
	        long dr = divisor<0?-(long)divisor:divisor;
	        long ret = 0;
	        while(dd>=dr){
	        	long temp=dr;
	        	long i=-1;
	        	while(dd>=temp){
	        		temp=temp<<1;
	        		i++;
	        	}
	        	ret+=(long)Math.pow(2, i);                 //must force to up cast
                dd-=temp>>1;
	        }        
	       	return neg?(int)-ret:(int)ret;       
	    }
}
