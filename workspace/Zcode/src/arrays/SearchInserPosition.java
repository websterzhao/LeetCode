package arrays;

public class SearchInserPosition {
    public int searchInsert(int[] A, int target) {
        if(A[A.length-1] < target) return A.length;
        int beg =0;
        int end=A.length-1;
        while(beg<end){
            int mid= beg+(end-beg)/2;
            if(A[mid]>=target)
                end=mid;
            else
                beg=mid+1;
        }
        return beg;
    }
}
