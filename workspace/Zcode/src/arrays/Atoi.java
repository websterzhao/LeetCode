package arrays;

public class Atoi {
    public int atoi(String str) {
    	if(str==null||str.length()==0)  return 0;   //"" is empty string, but it still is a string, null is point to nothing
        int i=0;
        while(str.charAt(i)==' ')
        	i++;
        char tmp = str.charAt(i);
        if(tmp=='+')
        	i++;
        boolean neg = false;
        if(tmp=='-'){
        	neg= true;
        	i++;
        }
        int temp = 	str.charAt(i)-'0';
        if(temp>9||temp<0)
        	return 0;
        long ret = 0;
        while(i<str.length()){
        	temp = str.charAt(i)-'0';
            if(temp>9||temp<0)
            	break;
            ret=ret*10+temp;
            i++;
        }
        if(neg)
        	ret=-ret;
        if(ret>Integer.MAX_VALUE)
        	return Integer.MAX_VALUE;
        else if(ret<Integer.MIN_VALUE)
        	return Integer.MIN_VALUE;
        else
        	return (int) ret;     
    }
}
