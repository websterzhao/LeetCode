package DP;

import java.util.Set;

public class WordBreak {
	public boolean wordBreak(String s, Set<String> dict) {
		int length = s.length();
		boolean[] can = new boolean[length + 1];
		can[0] = true;
		for (int i = 1; i <= length; i++) {
			for (int j = 0; j < i; j++) {
				if (can[j] && dict.contains(s.substring(j, i))) {
					can[i] = true;
					break;
				}
			}
		}
		return can[length];
	}

	public boolean wordBreak2(String s, Set<String> dict) {
		if(s==null) return false;
		return wb(s,dict);
	}

	private boolean wb(String s, Set<String> dict) {
		if(s.length()==0){
			return true;
		}
		for(int i=1;i<=s.length();i++){
			String str= s.substring(0, i);
			if(dict.contains(str) && wb(s.substring(i),dict)){
				return true;
			}
		}
		return false;
	}
}
