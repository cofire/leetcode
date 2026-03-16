package leetcode.editor.cn;

public class P240SearchMatrix {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        P240SearchMatrix p240SearchMatrix = new P240SearchMatrix();
        System.out.println(p240SearchMatrix.searchMatrix(matrix, 0));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int m = matrix.length, n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] > target) {
                return false;
            }
            if (matrix[i][n - 1] < target) {
                continue;
            }
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
