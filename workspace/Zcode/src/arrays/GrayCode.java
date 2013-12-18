package arrays;

import java.util.ArrayList;

public class GrayCode {
	   public ArrayList<Integer> grayCode(int n) {
	        ArrayList<Integer> arry= new ArrayList<Integer>();
	        arry.add(0);
	        for(int i=0;i<n;i++){
	            int k=arry.size()-1;
	            for(;k>=0;k--){
	                arry.add((int) (arry.get(k)+Math.pow(2, i)));
	            }
	        }
	        return arry;
	    }
}
