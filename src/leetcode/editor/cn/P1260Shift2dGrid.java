//给你一个 m 行 n 列的二维网格 grid 和一个整数 k。你需要将 grid 迁移 k 次。 
//
// 每次「迁移」操作将会引发下述活动： 
//
// 
// 位于 grid[i][j] 的元素将会移动到 grid[i][j + 1]。 
// 位于 grid[i][n - 1] 的元素将会移动到 grid[i + 1][0]。 
// 位于 grid[m - 1][n - 1] 的元素将会移动到 grid[0][0]。 
// 
//
// 请你返回 k 次迁移操作后最终得到的 二维网格。 
//
// 
//
// 示例 1： 
//
// 
//
// 输入：grid = [[1,2,3],[4,5,6],[7,8,9]], k = 1
//输出：[[9,1,2],[3,4,5],[6,7,8]]
// 
//
// 示例 2： 
//
// 
//
// 输入：grid = [[3,8,1,9],[19,7,2,5],[4,6,11,10],[12,0,21,13]], k = 4
//输出：[[12,0,21,13],[3,8,1,9],[19,7,2,5],[4,6,11,10]]
// 
//
// 示例 3： 
//
// 输入：grid = [[1,2,3],[4,5,6],[7,8,9]], k = 9
//输出：[[1,2,3],[4,5,6],[7,8,9]]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= grid.length <= 50 
// 1 <= grid[i].length <= 50 
// -1000 <= grid[i][j] <= 1000 
// 0 <= k <= 100 
// 
// Related Topics 数组


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

//Java：二维网格迁移
public class P1260Shift2dGrid {
    public static void main(String[] args) {
        Solution solution = new P1260Shift2dGrid().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> shiftGrid(int[][] grid, int k) {

            // Repeat the transform k times.
            for (; k > 0; k--) {
                // We'll write the transform into a new 2D array.
                int[][] newGrid = new int[grid.length][grid[0].length];

                // Case #1: Move everything not in the last column.
                for (int row = 0; row < grid.length; row++) {
                    for (int col = 0; col < grid[0].length - 1; col++) {
                        newGrid[row][col + 1] = grid[row][col];
                    }
                }

                // Case #2: Move everything in last column, but not last row.
                for (int row = 0; row < grid.length - 1; row++) {
                    newGrid[row + 1][0] = grid[row][grid[0].length - 1];
                }

                // Case #3: Move the bottom right.
                newGrid[0][0] = grid[grid.length - 1][grid[0].length - 1];

                // Update grid to be the transformed grid.
                grid = newGrid;
            }

            // Copy the grid into a list for returning.
            List<List<Integer>> result = new ArrayList<>();
            for (int[] row : grid) {
                List<Integer> listRow = new ArrayList<>();
                result.add(listRow);
                for (int v : row) listRow.add(v);
            }

            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
