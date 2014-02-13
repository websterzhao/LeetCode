package arrays;

public class GasStation {
	 public int canCompleteCircuit(int[] gas, int[] cost) {
	        int leftgas = 0, start = 0;
	        int n=gas.length;
	        for (int i = 0; i < 2*n; ++i) {
	        leftgas += gas[i%n] - cost[i%n];
	        if (leftgas < 0) {
	            leftgas = 0;
	            start = i + 1;
	        }
	    }
	    if (start >= n)
	        return -1;
	    return start;
	    }
}
