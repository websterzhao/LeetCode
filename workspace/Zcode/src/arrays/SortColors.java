package arrays;

public class SortColors {
	public void sortColors(int[] A) {
		int beg = 0;
		int end = A.length - 1;
		while (beg < end) {
			while (beg < end && A[beg] == 0)
				beg++;
			while (beg < end && A[end] == 2)
				end--;
			if (beg < end) {                                 //--------------------------------
				if (A[beg] == 2 && A[end] == 0) {
					swap(A, beg, end);
					beg++;
					end--;
				} else if (A[beg] == 1 && A[end] == 0) {
					swap(A, beg, end);
					beg++;
				} else if (A[beg] == 2 && A[end] == 1) {
					swap(A, beg, end);
					end--;
				} else if (A[beg] == 1 && A[end] == 1) { 
					int m = beg + 1;
					while (m < end && A[m] == 1)
						m++;
					if (m == end)                        //------------------------------------------
						break;
					swap(A, beg, m);
				}
			}
		}

	}

	private void swap(int[] a, int beg, int end) {
		int temp = a[beg];
		a[beg] = a[end];
		a[end] = temp;
	}
}
