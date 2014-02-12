package DP;

public class EditDistance {
	public int minDistance(String word1, String word2) {
        int l1= word1.length();
		int l2= word2.length();
		if (l1==0){return l2;}
	    if (l2==0){return l1;}
		int[][] dp= new int[l1+1][l2+1];
		for(int i=0;i<=l1;i++){
			dp[i][0]=i;
		}
		for(int i=0;i<=l2;i++){
			dp[0][i]=i;
		}
		for(int i=1;i<=l1;i++){		
			for(int j=1;j<=l2;j++){
				dp[i][j]=(dp[i-1][j]<dp[i][j-1]?dp[i-1][j]:dp[i][j-1])+1;
				if(word1.charAt(i-1)==word2.charAt(j-1))
  					dp[i][j]=dp[i-1][j-1]<dp[i][j]?dp[i-1][j-1]:dp[i][j];
				else
					dp[i][j]=dp[i-1][j-1]+1<dp[i][j]?dp[i-1][j-1]+1:dp[i][j];
			}
		}
		return dp[l1][l2];
    }
}
