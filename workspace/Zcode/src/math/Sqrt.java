package math;

public class Sqrt {
	public int sqrt(int x) {
		int n = x;
		int cnt = 0;
		int ret = 0;
		while (n != 0) {
			n /= 2;
			cnt++;
		}
		long n1 = x;
		long add = 1 << ((cnt - 1) / 2);
		while (add > 0) {
			ret |= add;
			if (ret * ret > n1)
				ret -= add;
			add >>= 1;
		}
		return ret;
	}
}
