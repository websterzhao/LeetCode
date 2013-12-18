package arrays;

public class JumpGameII {	
	 public int jump(int[] A) {
			if(A.length==0||A.length==1) return 0;
			int i =0;
			int j=0;
			int f=0;
			int ret =0;
			while(i<A.length){
				f=0;
				for(int k=i;k<=j;k++){
					if(k+A[k]>f)
						f=k+A[k];
				}
				ret++;
				i=j+1;
				j=f;
				if(j>=A.length-1) break;
			}
			return ret;
		}
}
