package arrays;

public class JumpGame {
    public boolean canJump(int[] A) {
        int i =0;
        while(i<A.length-1){
            if(A[i]==0) return false;
            int jump = A[i];
            i+=jump;
        }
        return true;
    }
}
