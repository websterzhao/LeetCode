package arrays;

public class ZigzagConversion {
	public String convert(String s, int nRows) {
		if (nRows < 1)
			return null;
		if (s.length() < 2 || nRows == 1)
			return s;
		boolean topdown = true;
		int index = 0;
		StringBuilder[] arry = new StringBuilder[nRows];
		for (int i = 0; i < nRows; i++) {
			arry[i] = new StringBuilder(); // SB is not primitive type ,must use constructor											
		}
		for (int i = 0; i < s.length(); i++) {
			char cur = s.charAt(i);
			if (topdown)
				arry[index++].append(cur);
			else
				arry[index--].append(cur);
			if (index == nRows) {
				topdown = false;
				index = index - 2;    //step back
			}
			if (index < 0) {
				topdown = true;
				index = index + 2;
			}
		}
		StringBuilder ret = new StringBuilder();
		for (StringBuilder sb : arry) {
			ret.append(sb.toString());
		}
		return ret.toString();
	}
}
