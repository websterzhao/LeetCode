package arrays;


import java.util.HashMap;

public class TwoSum {
	  public int[] twoSum(int[] numbers, int target) {
          int[] ret = new int[2];
          HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
          int i=0;
          for(;i<numbers.length;i++){
        	  if(hashmap.containsKey(numbers[i]))
        		  break;
        	  else
        		  hashmap.put((target-numbers[i]), i);
          }
          
          ret[0]=hashmap.get(numbers[i])+1;
          ret[1]=i+1;
          return ret;
    }
}
