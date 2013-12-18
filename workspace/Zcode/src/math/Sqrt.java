package math;

public class Sqrt {
	public int sqrt(int x) {
		int n = x;
		int cnt = 0;
		long ret = 0;
		while (n != 0) {
			n /= 2;
			cnt++;
		}
		long n1 = x;
		long add = 1 << (cnt / 2);
		while (add > 0) {
			ret |= add;
			if (ret * ret > n1)
				ret -= add;
			add >>= 1;
		}
		return (int) ret;
	}
	
	public int sqrt1(int x) {
        long high=x;
        long low=0;
        if(x==1) return 1;
        while(high-low>1){
            long mid=low+(high-low)/2;
            if(mid*mid<=x)
                low=mid;
            else
                high=mid;
            
        }
		return (int) low;
	}
}
