package arrays;

import java.util.ArrayList;

public class GrayCode {
    public ArrayList<Integer> grayCode(int n) {
        if(n<0) return null;
        ArrayList<Integer> ret = new ArrayList<Integer>();
        ret.add(0);
        if(n==0) return ret;
        for(int i=0;i<n;i++){
        	@SuppressWarnings("unchecked")
			ArrayList<Integer> temp = (ArrayList<Integer>) ret.clone();
        	for(int j=temp.size()-1;j>=0;j--){
        		ret.add((int) (temp.get(j)+Math.pow(2, i)));
        	}
        }
        return ret;		       
    }
}
