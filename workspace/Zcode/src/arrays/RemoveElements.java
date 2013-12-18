package arrays;

public class RemoveElements {
	public int removeElement(int[] A, int elem) {
		int i = 0;
		int j = A.length - 1;
		int ret = A.length;
		while (i <= j) {
			while (i < A.length && A[i] != elem) {
				i++;
			}
			while (j >= 0 && A[j] == elem) {
				j--;
				ret--;
			}
			if (i < A.length && j >= 0 && i < j)
				swap(A, i, j);
		}
		return ret;

	}
   public int removeElement1(int[] A, int elem) {
	        int i=0;
	        int j= A.length-1;
	        int ret=A.length;
	        while(i<=j){
	            if(A[i]==elem){
	                swap(A,i,j);
	                j--;
	                ret--;
	            }
	            else
	                i++;
	        }
	        return ret;
	    }
	private void swap(int[] A, int i, int j) {
		int temp = A[j];
		A[j] = A[i];
		A[i] = temp;
	}
}
