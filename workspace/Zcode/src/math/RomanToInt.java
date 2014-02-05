package math;

public class RomanToInt {
	public int romanToInt(String s) {
        // Start typing your C/C++ solution below
       // DO NOT write int main() function
        
       // 4:IV, 9:IX, 40:XL, 90:XC, 400:CD, 900:CM,
       // 1:I, 10:X, 100:C, 1000:M
       char[] sc = s.toCharArray();
       int res=0;
       char pre = ' ';
       for(int i=0;i<s.length();i++){
           if (sc[i]=='M' && pre!='C') {res+=1000;}
           if (sc[i]=='C' && pre!='X') {res+=100;}
           if (sc[i]=='X' && pre!='I') {res+=10;}
            
           if (sc[i]=='M' && pre=='C') {res+=800;}
           if (sc[i]=='C' && pre=='X') {res+=80;}
           if (sc[i]=='X' && pre=='I') {res+=8;}
            
           if (sc[i]=='I' ) {res+=1;}
            
           if (sc[i]=='V' && pre!='I'){res+=5;}
           if (sc[i]=='L' && pre!='X'){res+=50;}
           if (sc[i]=='D' && pre!='C'){res+=500;}
            
           if (sc[i]=='V' && pre=='I'){res+=3;}
           if (sc[i]=='L' && pre=='X'){res+=30;}
           if (sc[i]=='D' && pre=='C'){res+=300;}
            
           pre = sc[i];
            
       }
        
       return res;
   }
}
