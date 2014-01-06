package recursion;

import java.util.ArrayList;

public class PermutationSequence {
	   public String getPermutation(int n, int k) {
	        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
	        int[] num= new int[n];
	        for(int i=1;i<=n;i++){
	            num[i-1]=i;
	        }
	        perm(num,ret,0,n);
	        ArrayList<Integer> arry=ret.get(k-1);
	        StringBuilder kkk=new StringBuilder();
	        for(int i:arry){
	            kkk.append((char)('0'+i));
	        }
	        return kkk.toString();
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
