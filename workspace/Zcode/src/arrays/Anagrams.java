package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Anagrams {
    public ArrayList<String> anagrams(String[] strs) {
        if(strs==null) return null;
        ArrayList<String> ret = new ArrayList<String>();
    	HashMap<String,ArrayList<String>> mymap = new HashMap<String,ArrayList<String>>();
        for(String s:strs){
        	String ss= sortChars(s);
        	if(!mymap.containsKey(ss))
        		mymap.put(ss, new ArrayList<String>());
        	ArrayList<String> arry=mymap.get(ss);
        	arry.add(s);
        }
        
        for(String s: mymap.keySet()){
			if (mymap.get(s).size()>1) {           //////////////////////
				for (String ss : mymap.get(s)) {
					ret.add(ss);
				}
			}
        }
        return ret;        
    }

	private String sortChars(String s) {
		char[]  chars= s.toCharArray();
		Arrays.sort(chars);
		StringBuilder sb = new StringBuilder();
		for(char c:chars){
			sb.append(c);
		}
		return sb.toString();
	}
}
