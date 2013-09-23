package recursion;

import java.util.ArrayList;

public class CombinationsofPhoneNumber {
	public ArrayList<String> letterCombinations(String digits) {
		ArrayList<String> index = new ArrayList<String>();
		index.add("abc");
		index.add("def");
		index.add("ghi");
		index.add("jkl");
		index.add("mno");
		index.add("pqrs");
		index.add("tuv");
		index.add("wxyz");
		ArrayList<String> ret = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		combin(index,ret,digits,0,sb);
		return ret;
	}

	private void combin(ArrayList<String> index, ArrayList<String> ret,
			String digits, int i, StringBuilder sb) {
		if(i==digits.length()){
			ret.add(sb.toString());
			return;
		}
		String temp = index.get(digits.charAt(i)-'0'-2);
		for(int k =0;k<temp.length();k++){
			sb.append(temp.charAt(k));
			combin(index,ret,digits,i+1,sb);
			sb.deleteCharAt(sb.length()-1);
		}		
	}
}
