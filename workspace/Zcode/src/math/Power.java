package math;

public class Power {
	public double pow(double x, int n) {
        if(n<0) 
        	return pow(1/x,-n);             //���ã�ȡ���������,ȡ����1��ȻΪ�������������ѭ��
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
			n = -n;                              //��Ȼȡ���������,ȡ����1��ȻΪ�����������������ѭ��
		}

		double rest = (n % 2 == 0) ? 1 : x;
		double r = pow(x, n / 2);                //��һ����С

		return neg ? 1 / (r * r * rest) : (r * r * rest);
	}
}
