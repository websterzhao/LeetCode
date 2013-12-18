package recursion;

import java.util.ArrayList;

public class PermutationsII {
	   public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
	        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
	        perm(num,ret,0,num.length);
	        return ret;
	     }
	     private void perm(int[] num, ArrayList<ArrayList<Integer>> ret, int i,int n){
	         if(i==n){
	             ArrayList<Integer> temp=new ArrayList<Integer>();
	             for(int e:num){
	                 temp.add(e);
	             }
	             ret.add(temp);
	             return;
	         }
	         for(int k=i;k<n;k++){
	             if(needswap(num,i,k))  continue;
	             swap(num,i,k);
	             perm(num,ret,i+1,num.length);
	             swap(num,i,k);
	         }
	     }
	     private boolean needswap(int[] num, int i, int k){
	        for (int j=i;j<k;j++){
	            if (num[j]==num[k]){
	                return true;
	            }
	        }
	        return false;
	     }
	     private void swap(int[] num, int i, int k){
	         int temp=num[k];
	         num[k]=num[i];
	         num[i]= temp;
	     }	     
}
