package leetcode.editor.cn;

public class P200NumIslands {
    public static void main(String[] args) {
        P200NumIslands p200NumIslands = new P200NumIslands();
        char[][] grid = new char[][]{{'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};
        char[][] grid2 = new char[][]{{'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}};
        char[][] grid3 = new char[][]{{'1', '0', '1', '0', '1'}};
        System.out.println(p200NumIslands.numIslands(grid));
        System.out.println(p200NumIslands.numIslands(grid2));
        System.out.println(p200NumIslands.numIslands(grid3));
    }

    public int numIslands(char[][] grid) {
        int num = 0;
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return num;
        }
        int m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '0') {
                    continue;
                }
                num++;
                fillZero(grid, i, j);
            }
        }
        return num;
    }

    public void fillZero(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) {
            return;
        }
        if (grid[i][j] == '1') {
            grid[i][j] = '0';
            fillZero(grid, i - 1, j);
            fillZero(grid, i + 1, j);
            fillZero(grid, i, j - 1);
            fillZero(grid, i, j + 1);
        } else {
            return;
        }
    }
}
