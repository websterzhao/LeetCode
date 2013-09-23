package math;

public class PlusOne {
    public int[] plusOne(int[] digits) {
    	int n = digits.length-1;
    	int carry=0;
    	for(;n>=0;n--){
    		int a=(n==(digits.length-1))?1:0;
    		int temp= digits[n]+ carry+a;    		
    		carry = temp/10;
    		temp%=10;
    		digits[n]=temp;
    	}
    	if(carry==1){
    		int ret[]= new int[digits.length+1];
    		ret[0]=1;
    		for(int i=1;i<ret.length;i++){
    			ret[i]=digits[i-1];
    		}
    		return ret;
    	}
    	else
    		return digits;
        
    }
}
