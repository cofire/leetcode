package leetcode.editor.cn;

public class P221MaximalSquare {
    public static void main(String[] args) {
//        char[][] matrix = new char[][]{{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}};
//        char[][] matrix = new char[][]{{'1', '0'}, {'1', '0'}};
//        char[][] matrix = new char[][]{{'1', '1'}, {'1', '1'}};

        char[][] matrix = new char[][]{{'1', '1', '1', '1', '0'}, {'1', '1', '1', '1', '0'}, {'1', '1', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'0', '0', '1', '1', '1'}};

        System.out.println(new P221MaximalSquare().maximalSquare(matrix));

    }

    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int m = matrix.length, n = matrix[0].length;
        int[][] dfs = new int[m][n];
        int max = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '1') {
                    int len = 0;
                    if (i == 0 || j == 0) {
                        len = 1;
                    } else {
                        len = Math.min(Math.min(dfs[i - 1][j], dfs[i][j - 1]), dfs[i - 1][j - 1]) + 1;
                    }
                    dfs[i][j] = len;
                    if (max < len) {
                        max = len;
                    }
                }
            }
        }
        return max * max;
    }
}
