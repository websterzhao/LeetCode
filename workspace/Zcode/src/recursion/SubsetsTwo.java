package recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class SubsetsTwo {
    public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
		 ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
	     if(num.length==0)
		    return ret;
	     Arrays.sort(num);
	     ArrayList<Integer> temp = new ArrayList<Integer>();
	     findSubset(num,ret,0,temp);
	     return ret;
	    }

	  @SuppressWarnings("unchecked")
	private void findSubset(int[] s, ArrayList<ArrayList<Integer>> ret, int index, ArrayList<Integer> temp) {
		if(index==s.length){
			ret.add((ArrayList<Integer>) temp.clone());
			return;
		}
		int cnt=1;
       int i=index;
		while(i+1<s.length&&s[i]==s[i+1]){
			cnt++;
           i++;
		}
		findSubset(s,ret,index+cnt,temp);
		for(i= 0;i<cnt;i++){
			temp.add(s[index]);
			findSubset(s,ret,index+cnt,temp);
		}
		for(;cnt>0;cnt--){
			temp.remove(temp.size()-1);
		}
	}
}
