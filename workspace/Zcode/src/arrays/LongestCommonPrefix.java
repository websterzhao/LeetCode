package arrays;

import java.util.Arrays;

public class LongestCommonPrefix {
	   public String longestCommonPrefix(String[] strs) {
           if(strs==null||strs.length==0) return "";
	        Arrays.sort(strs);
	        String temp = strs[0];
	        StringBuilder sb = new StringBuilder();
	        for(int i =0;i<temp.length();i++){
	        	char c = temp.charAt(i);
	        	boolean checkall = true;
	        	for(String str:strs){
	        		if(str.charAt(i)!=c){
	        			checkall = false;
	        			break;
	        		}	        		
	        	}
	        	if(checkall)
	        		sb.append(c);
	        	else
	        		break;
	        }
	        return sb.toString();
	    }
}
