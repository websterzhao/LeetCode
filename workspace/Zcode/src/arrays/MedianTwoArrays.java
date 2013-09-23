package arrays;

public class MedianTwoArrays {
	public double findMedianSortedArrays(int A[], int B[]) {
		int m = A.length;
		int n = B.length;		
		int total = m + n;
		if (total % 2 == 1) {
			return fms(A, m, 0, B, n, 0, total / 2 + 1);
		} else {
			return (fms(A, m, 0, B, n, 0, total / 2) + fms(A, m, 0, B, n, 0, total / 2 + 1)) / 2;
		}
	}

	private double fms(int[] A, int m, int s1, int[] B, int n, int s2, int i) {
		if(m>n) return fms(B,n,s2,A,m,s1,i);
		if(m==0) return B[s2+i-1];
		if(i==1) return (A[s1]>B[s2])?B[s2]:A[s1];
		int pa = i/2>m?m:i/2;
		int pb = i-pa;
		if(A[pa-1+s1]<B[pb-1+s2]) 
			return fms(A,m-pa,s1+pa, B,n,s2, i-pa);
		else
		    return fms(A,m,s1, B,n-pb,s2+pb,i-pb);
	}
}
