package arrays;

public class ValidNumber {
    public boolean isNumber(String s) {
        if(s==null||s.length()==0) return false;
		boolean dot =false;
		boolean spa =false;
		boolean exp =false;
		boolean num =false;
		int i=0;
		while(i<s.length()&&s.charAt(i)==' ')
        	i++;
        if(i==s.length()) return false;
		if(s.charAt(i)=='+'||s.charAt(i)=='-')
        	i++;
		 while(i<s.length()){
			 char temp = s.charAt(i);
			 if(temp==' ')              //if had a space, the rest of str must be space
				 spa=true;
		     else if(spa) return false; //space inside of non-space make number invalid
			 else if (temp >= '0' && temp <= '9')
			     num = true;
			 else if(temp == 'e'){
			     if(exp || !num) return false;
			     exp = true;
				 num = false; // need number after exponential sign, so make it false
			 }
			 else if(temp == '.'){
			     if(exp || dot) return false;
			     dot = true;
			 }
			 else if(temp == '-' || temp == '+'){
			     if (s.charAt(i-1) != 'e') return false;
			 }
             else 
			     return false;
			 i++;
		 }		
		return num;
	}
	
	
	   public boolean isNumber1(String s) {
	        if(s==null||s.length()==0) return false;
	            int i=0;
		        boolean isdot = false;
		        boolean ise = false;
		        while(i<s.length()&&s.charAt(i)==' ')
		        	i++;
		        if(i==s.length()) return false;
		        if(s.charAt(i)=='+'||s.charAt(i)=='-')
		        	i++;
		        if(i==s.length()) return false;	
		        if(s.charAt(i)=='.'){
		        	isdot=true;
		        	i++;
		        }
		        if(i==s.length()) return false;	
		        int temp= s.charAt(i)-'0';
		        if(temp<0||temp>9)
		        	return false;
		        i++;
		        if(i==s.length()) return true;	
	            boolean isspace = false;
		        while(i<s.length()){
		          char temp1=s.charAt(i);
	            if(temp1==' '){
	            	isspace=true;
		        	}
	            if(isspace&&temp1!=' ')
	                return false;
	            if(!isspace){
		        	if(temp1=='e'){
		        		if(ise)
		        			return false;
		        		else{
		        			ise=true;
		        			if(i+1==s.length())
		        				return false;
		        			char tt=s.charAt(i+1);	
		        			if(tt=='+'||tt=='-'){
		        				i=i+2;
	                            if(i>=s.length())
		        					return false;
		        				tt=s.charAt(i);
		        			}	        				
		        			if(tt-'0'<0||tt-'0'>9)
		        				return false;
		        		}
		        	}
		        	if(temp1=='.'){
		        		if(isdot)
		        			return false;
		        		else{
		        			isdot=true;
	                        if(ise)
		        				return false;
		        		}
		        	}

		        	if((temp1-'0'<0||temp1-'0'>9)&&temp1!='e'&&temp1!='.')
		        		return false;
	            }
		          i++;
		        }
		        return true;
		    }
}
