package leetcode.editor.cn;

public class P64MinPathSum {
    public static void main(String[] args) {
        System.out.println(new P64MinPathSum().minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
        System.out.println(new P64MinPathSum().minPathSum(new int[][]{{1, 3, 1}, {1, 5, 6}, {4, 2, 1}}));
        System.out.println(new P64MinPathSum().minPathSum(new int[][]{{1, 2, 3}, {4, 5, 6}}));

    }

    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int m = grid.length, n = grid[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    if (j == 0) {
                        dp[i][j] = grid[i][j];
                    } else {
                        dp[i][j] = dp[i][j - 1] + grid[i][j];
                    }
                    continue;
                }
                if (j == 0) {
                    if (i != 0) {
                        dp[i][j] = dp[i - 1][j] + grid[i][j];
                    }
                    continue;
                }
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        return dp[m - 1][n - 1];
    }
}
