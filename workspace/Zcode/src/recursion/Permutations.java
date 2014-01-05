package recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutations {
	 public ArrayList<ArrayList<Integer>> permute(int[] num) {
	        Arrays.sort(num);
	        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
	        do{
	           ArrayList<Integer> temp= new ArrayList<Integer>();
	           for(int n: num){
	               temp.add(n);
	           }
	           ret.add(temp);
	        }while(hasnext(num));
	        
	        return ret;
	    }
	    private boolean hasnext(int[] num){
	        int n=num.length-1;
	        int back=n-1;
	        while(back>=0&&num[back]>num[back+1]){
	            back--;
	        }
	        if(back<0) return false;
	        reverse(num,back+1,n);
	        int index = bsearchfst(num,back+1,n,num[back]);
	        int temp =num[back];
	        num[back]=num[index];
	        num[index]=temp;
	        return true;
	    }
	    private void reverse(int[] num, int st,int n){
	        while(st<n){
	            int temp=num[st];
	            num[st]=num[n];
	            num[n]=temp;
	            n--;
	            st++;
	        }
	    }
	    private int bsearchfst(int[] num, int st, int n, int target){
	        int beg=st;
	        int end=n;
	        while(beg<end){
	            int mid=beg+(end-beg)/2;
	            if(num[mid]>=target)
	                end=mid;
	            else    
	                beg=mid+1;
	        }
	        return beg;
	    }
}
