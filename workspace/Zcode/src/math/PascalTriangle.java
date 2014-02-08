package math;

import java.util.ArrayList;

public class PascalTriangle {
    @SuppressWarnings("unchecked")
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        if(numRows<=0) return ret;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(1);
        ret.add((ArrayList<Integer>) temp.clone());
        if(numRows == 1)
        	return ret;
        temp.add(1);
        ret.add((ArrayList<Integer>) temp.clone());
        if(numRows == 2)
        	return ret;
        for(int i=2;i<numRows;i++){
        	ArrayList<Integer> t = new ArrayList<Integer>();
        	for(int j=0;j<=i;j++){
        		t.add(1);
        	}
        	for(int j=1;j<i;j++){
        		ArrayList<Integer> t2= ret.get(i-1); 
        		t.set(j, t2.get(j)+t2.get(j-1));
        	}
        	ret.add(t);
        }    
        return ret;
    }
}
