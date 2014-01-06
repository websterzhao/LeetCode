package recursion;

import java.util.ArrayList;
/*
Facing this kind of problem, just consider this is a similar one to the previous(see here), but need some modifications. 
In this problem, what we need it to cut some of the subtrees.  e.g. 122
                     122
         /             |           \
     122          212         X  (here because 2=2, we don't need to swap again)
    /     \          /    \
 122   X     212 221 

So, if there exist same element after current swap, there there is no need to swap again.
Details see code.
 */
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
