package DP;

public class DecoeWays {
	public int numDecodings(String s) {
		if (s.length() == 0 || s.charAt(0) == '0')
			return 0;
		int ret1 = 1;
		int ret2 = 1;
		for (int i = 1; i < s.length(); i++) {
			int retc = 0;
			int cur = s.charAt(i) - '0';
			int prev= s.charAt(i-1) - '0';
			if (cur == 0) {
				if (prev ==1 || prev == 2)   //10 or 20 only one way,so equals to num(n-2)
					retc = ret2;
			} 
			else if (prev == 0)              //if cur!==0, prev==0
				retc = ret1;
			else {                           //if cur!==0, prev!=0
				int d2 = prev * 10 + cur;
				if (d2 <= 26)
					retc = ret1 + ret2;
				else
					retc = ret1;
			}
			ret2 = ret1;                      //2 1 c
			ret1 = retc;                     
		}
		return ret1;                
	}
}
