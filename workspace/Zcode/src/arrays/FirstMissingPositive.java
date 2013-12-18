package arrays;

public class FirstMissingPositive {
	public int firstMissingPositive(int[] A) {
		int n = A.length;
		if (n == 0)
			return 1;
		int i = 0;
		while (i < n) {
			int ai = A[i];
			if (0 <= ai && ai < n)
				if (A[ai] != ai)// prevent from infinit swap
				{
					A[i] = A[ai];
					A[ai] = ai;
					continue;
				}

			++i;
		}

		i = 1;
		while (i < n && A[i] == i)
			i++;

		// fisrt element maybe n, if so, the largest missed positive number
		// should be n+1
		if (A[0] == i)
			++i;

		return i;
	}
	
	  public int firstMissingPositive1(int[] A) {
	        int n = A.length;
	        if(n==0) return 1;
	        for(int i=0;i<n;i++){
	            if(A[i]>=0&&A[i]<=n-1){
	                while(A[i]!=i){
	                    int temp=A[i];
	                    A[i]=A[temp];
	                    A[temp]=temp;
	                    if(A[i]<0||A[i]>n-1)
	                        break;
	                    if(A[i]==A[A[i]]) //prevent from infinite looping
	                        break;
	                }
	            }
	        }
	        int i=1;
	        for(;i<n;i++){
	            if(i!=A[i])
	                return i;
	        }
	        
	        if (A[0] == i)  //make sure at 0 position has i
				++i;

			return i;
	    }
}
