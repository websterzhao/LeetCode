package arrays;

public class NextPermutation {
	   public void nextPermutation(int[] num) {
	        int len=num.length-1;
	        int i=len;
	        if(i==0) return;
	        while(i>0&&num[i-1]>=num[i]){
	            i--;
	        }
	        reverse(num,i,len);
	        if(i>0){
	            int first=findfirst(num,i,len,num[i-1]);
	            swap(num,first,i-1);
	        }
	    }
	    private void swap(int[] num, int l, int r){
	        int temp= num[l];
	        num[l]=num[r];
	        num[r]=temp;
	    }
	    private void reverse(int[] num, int l, int r){
	        while(l<r){
	            swap(num,l,r);
	            l++;
	            r--;
	        }
	    }
	    private int findfirst(int[] num, int l, int r,int target){
	        while(l<r){
	            int mid=(l+r)/2;
	            if(num[mid]<=target)
	                l=mid+1;
	            else
	                r=mid;
	        }
	        return l;
	    }
}
