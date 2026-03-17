package leetcode.editor.cn;

public class P62UniquePaths {
    public static void main(String[] args) {
        P62UniquePaths p62UniquePaths = new P62UniquePaths();
        System.out.println(p62UniquePaths.uniquePaths(3, 7));
        System.out.println(p62UniquePaths.uniquePaths(3, 2));
        System.out.println(p62UniquePaths.uniquePaths(7, 3));
        System.out.println(p62UniquePaths.uniquePaths(3, 3));
    }

    public int uniquePaths(int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
            for (int j = 1; j < n; j++) {
                if (i == 0) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }

        return dp[m - 1][n - 1];
    }
}
