package leetcode.editor.cn;

public class P48Rotate {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2}, {3, 4}};
//        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int[][] matrix = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        P48Rotate p48Rotate = new P48Rotate();
        System.out.println("before===============================");
        p48Rotate.printMatrix(matrix);
        p48Rotate.rotate(matrix);
        System.out.println("after===============================");
        p48Rotate.printMatrix(matrix);

    }

    public void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf(matrix[i][j] + " , ");
            }
            System.out.println();
        }
    }

    public void rotate(int[][] matrix) {
        if (matrix == null || matrix.length < 2) {
            return;
        }
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                int up = matrix[i][j];
                int right = matrix[j][n - i - 1];
                int down = matrix[n - i - 1][n - j - 1];
                int left = matrix[n - j - 1][i];
//                int tmp = up;
//                up = left;
//                left = down;
//                down = right;
//                right = tmp;
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = tmp;
                System.out.println("=================================");
                printMatrix(matrix);
            }
        }
    }
}
