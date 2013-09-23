package DP;

public class UniquePathTwo {
	  public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;
		if(obstacleGrid[m - 1][n - 1]==1) return 0;
		obstacleGrid[m - 1][n - 1] = 1;
		for (int i = n-2; i >=0; i--) {
			obstacleGrid[m - 1][i] = (~obstacleGrid[m - 1][i])&obstacleGrid[m - 1][i+1];
		}
		for (int i = m-2; i >=0; i--) {
			obstacleGrid[i][n-1] = (~obstacleGrid[i][n-1])&obstacleGrid[i+1][n-1];
		}
		for (int i = m - 2; i >= 0; i--) {
			for (int j = n - 2; j >= 0; j--) {
				obstacleGrid[i][j] = obstacleGrid[i][j]==1?0:obstacleGrid[i + 1][j] + obstacleGrid[i][j + 1];
			}
		}
		return obstacleGrid[0][0];
	}
}
