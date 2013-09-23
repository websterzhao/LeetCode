package arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class SubstringConcatenationofAllWords {
	 public ArrayList<Integer> findSubstring(String S, String[] L) {
	        if(S==null|| S.length()==0) return null;
	        ArrayList<Integer> ret = new ArrayList<Integer>();
	        HashMap<Character,ArrayList<String>> map = new HashMap<Character,ArrayList<String>>();
	        for(String s:L){
	        	char c = s.charAt(0);
	        	if(!map.containsKey(c))
	        		map.put(c, new ArrayList<String>());
	        	ArrayList<String> arry = map.get(c);
	        	arry.add(s);
	        }
	        for(int i =0;i<S.length();i++){
	        	char cur = S.charAt(i);
	        	if(map.containsKey(cur)){
	        		int 
	        	}
	        }
	        
	    }
}
