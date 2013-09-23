package arrays;

public class AddBinary {
    public String addBinary(String a, String b) {
        a=reverse(a);
        b=reverse(b);
        int len=a.length()<b.length()?a.length():b.length();
        int carry=0;
        StringBuilder sb= new StringBuilder();
        int i=0;
        for(; i<len;i++){
        	int temp=a.charAt(i)+b.charAt(i)+carry-'0'-'0';
        	sb.append(temp%2);
        	carry=temp/2;
        }
        if(a.length()<b.length()){
        	while(i<b.length()){
            	int temp=b.charAt(i)+carry-'0';
            	sb.append(temp%2);
            	carry=temp/2;
            	i++;
        	}
        }
        else{
           	while(i<a.length()){
            	int temp=a.charAt(i)+carry-'0';
            	sb.append(temp%2);
            	carry=temp/2;
            	i++;
        	}
        }
        if(carry==1)
        	sb.append(1);
        String ret=sb.toString();
        ret=reverse(ret);
        return ret;
        
    }

	private String reverse(String a) {
		int i=0;
		int j = a.length()-1;
		char[] arr=a.toCharArray();
		while(i<j){
			char temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
			i++;
			j--;
		}
		return new String(arr);
	}
}
