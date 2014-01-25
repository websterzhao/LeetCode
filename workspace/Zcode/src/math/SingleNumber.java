package math;

public class SingleNumber {
	public int singleNumber(int[] A) {
        int ret=0;
        for(int i:A){
            ret^=i;
        }
        return ret;
    }
}
