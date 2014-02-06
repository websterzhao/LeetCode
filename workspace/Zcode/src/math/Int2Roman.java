package math;

import org.apache.commons.lang3.StringUtils;

public class Int2Roman {
	public String intToRoman(int num) {
		String res="";
        int n_M = (int)(num/1000);
        res += StringUtils.repeat('M', n_M);
        num = num%1000;
        int n_C = (int)(num/100);
        if (n_C!=0){
        if (n_C<=3){res += StringUtils.repeat('C', n_C);}
        if (n_C==4){res += "CD";}
        if (n_C>=5 && n_C<=8){ res+="D";res += StringUtils.repeat('C', n_C-5);}
        if (n_C==9){res += "CM";}
        }
        num = num%100;
        int n_X = (int)(num/10);
        if (n_X!=0){
        if (n_X<=3){res += StringUtils.repeat('X', n_X);}
        if (n_X==4){res += "XL";}
        if (n_X>=5 && n_X<=8){res+="L"; res += StringUtils.repeat('X', n_X-5); }
        if (n_X==9){res += "XC";}
        }
        num = num%10;
        int n_I = (int)(num/1);
        if (n_I!=0){
            if (n_I<=3){res += StringUtils.repeat('I', n_I);}
            if (n_I==4){res += "IV";}
            if (n_I>=5 && n_I<=8){res+="V"; res += StringUtils.repeat('I', n_I-5); }
            if (n_I==9){res += "IX";}
        }
        return res; 
    }
}
