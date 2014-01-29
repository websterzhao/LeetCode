package recursion;

import java.util.ArrayList;

public class PalindromePartitioning {
	public ArrayList<ArrayList<String>> partition(String s) {
        ArrayList<ArrayList<String>> ret = new ArrayList<ArrayList<String>>();
        if(s==null||s.length()==0) return ret;
        ArrayList<String> temp = new ArrayList<String>();
        genpart(s,ret,temp);
        return ret;
    }

	@SuppressWarnings("unchecked")
	private void genpart(String s, ArrayList<ArrayList<String>> ret, ArrayList<String> temp) {
		if(s.length()==0){                 //not null
			ret.add((ArrayList<String>) temp.clone());
			return;
		}
		for(int i=1;i<=s.length();i++){
			String s0= s.substring(0,i);
			if(ispalindorme(s0)){
				temp.add(s0);			
				genpart(s.substring(i),ret,temp);
				temp.remove(temp.size()-1);
			}
		}
	}

	private boolean ispalindorme(String s) {
		if(s==null) return true;
		char[] sc = s.toCharArray();
		int l=0;
		int r=sc.length-1;
		while(l<r){
			if(sc[l]!=sc[r])
				return false;
			l++;
			r--;
		}
		return true;
	}
}
