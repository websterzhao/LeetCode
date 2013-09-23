package arrays;

import java.util.HashMap;

public class LongestSubstring {

	public int longestSubstring(String s) {
		if (s == null)
			return 0;
		int ret = 0;
		int counter = 0;
		int start = 0;
		boolean[] map = new boolean[256];
		for(int i=0;i<s.length();i++){
			int c = s.charAt(i);
			if(map[c]==false){
				map[c]=true;
				counter++;
				ret=(counter>ret)?counter:ret;
			}			   
			else{
				while(s.charAt(start)!=c){
					map[s.charAt(start++)]=false;
					counter--;
				}	
				start++;
			}
			
		}       
		return ret;
	}
	
	   public int lengthOfLongestSubstring(String s) {
	        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
	        int ret=0;
	        int cnt=0;
	        int st=0;
	        for(int i=0;i<s.length();i++){
	            char c=s.charAt(i);
	            if(map.containsKey(c)){
	                int cur = map.get(c);
	                for(;st<=cur;st++){
	                    map.remove(s.charAt(st));
	                    cnt--;
	                }
	                map.put(c,i);
	                cnt++;
	            }
	            else{
	                map.put(c,i);
	                cnt++;
	                ret=cnt>ret?cnt:ret;
	                }
	        }
	        return ret;
	    }

}
