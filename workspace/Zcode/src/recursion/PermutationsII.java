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
	     private void perm(int[] num, ArrayList<ArrayList<Integer>> ret, int beg,int end){
	         if(beg==end){
	             ArrayList<Integer> temp=new ArrayList<Integer>();
	             for(int e:num){
	                 temp.add(e);
	             }
	             ret.add(temp);
	             return;
	         }
	         for(int i=beg;i<end;i++){
	             if(needswap(num,beg,i))  continue;
	             swap(num,beg,i);
	             perm(num,ret,beg+1,num.length);
	             swap(num,beg,i);
	         }
	     }
	     private boolean needswap(int[] num, int beg, int end){
	        for (int j=beg;j<end;j++){
	            if (num[j]==num[end]){
	                return true;
	            }
	        }
	        return false;
	     }
	     private void swap(int[] num, int m, int n){
	         int temp=num[m];
	         num[m]=num[n];
	         num[n]= temp;
	     }	     
}
