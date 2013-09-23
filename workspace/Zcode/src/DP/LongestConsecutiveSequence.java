package DP;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] num) {
       if(num.length==0) return 0;
       HashSet<Integer> set= new HashSet<Integer>();
       for(int i:num){
    	   set.add(i);
       }
       int ret = 1;
       for(int i:num){
    	   int temp = 1;
    	   int cur=i;
    	   while(set.contains(cur+1)){
    		   temp++;
    		   set.remove(++cur);
    	   }
    	   cur=i;
    	   while(set.contains(cur-1)){
    		   temp++;
    		   set.remove(--cur);
    	   }
    	   set.remove(i);
    	   ret=ret<temp?temp:ret;
       }
       return ret;
    }
}
