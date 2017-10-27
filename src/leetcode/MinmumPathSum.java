package leetcode;
/**
 * 用一个二维数组dp表示所有路径到i,j格子的最短路径和，则可以得到关系式
 * dp[i][j] = Min{dp[i - 1][j], dp[i][j - 1]} + grid[i][j]
 * @author Rail
 */
public class MinmumPathSum {
	public static void main(String[] args){
		int[][] g = new int[2][];
		g[0] = new int[]{1, 2, 5};
		g[1] = new int[]{3, 2, 1};
		int res = new MinmumPathSum().minPathSum(g);
		System.out.println(res);
	}
    public int minPathSum(int[][] grid) {
    	if(grid == null || grid.length == 0)
    		return 0;
    	int row = grid.length;
    	int col = grid[0].length;
    	int[][] dp = new int[row][col];
    	dp[0][0] = grid[0][0];
    	for(int i = 1; i < row; i++){
    		dp[i][0] = dp[i - 1][0] + grid[i][0];  
    	}
    	for(int i = 1; i < col; i++){
    		dp[0][i] = dp[0][i - 1] + grid[0][i];  
    	}
    	
    	int i, j;
    	for(i = 1; i < row; i++){
    		for(j = 1; j < col; j++){
    			dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
    		}
    	}
		return dp[row - 1][col - 1];
        
    }
}
