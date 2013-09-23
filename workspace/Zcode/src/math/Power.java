package math;

public class Power {
	public double pow(double x, int n) {
        if(n<0) 
        	return pow(1/x,-n);             //不好，取负数会溢出,取反加1仍然为最大负数，会无限循环
        if(n==0) return 1;
        if(n==1) return x;

        
        double rest = (n%2==0)?1:x;
        
        double temp=pow(x,n/2);
        return temp*temp*rest;
	}
	public double pow1(double x, int n) {
		if (n == 0)
			return 1;
		if (n == 1)
			return x;
		boolean neg = false;
		if (n < 0) {
			neg = true;
			n = -n;                              //虽然取负数会溢出,取反加1仍然为最大负数，但不会无限循环
		}

		double rest = (n % 2 == 0) ? 1 : x;
		double r = pow(x, n / 2);                //下一步变小

		return neg ? 1 / (r * r * rest) : (r * r * rest);
	}
}
