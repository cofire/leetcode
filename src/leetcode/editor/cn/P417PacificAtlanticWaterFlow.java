//给定一个 m x n 的非负整数矩阵来表示一片大陆上各个单元格的高度。“太平洋”处于大陆的左边界和上边界，而“大西洋”处于大陆的右边界和下边界。 
//
// 规定水流只能按照上、下、左、右四个方向流动，且只能从高到低或者在同等高度上流动。 
//
// 请找出那些水流既可以流动到“太平洋”，又能流动到“大西洋”的陆地单元的坐标。 
//
// 
//
// 提示： 
//
// 
// 输出坐标的顺序不重要 
// m 和 n 都小于150 
// 
//
// 
//
// 示例： 
//
// 
//
// 
//给定下面的 5x5 矩阵:
//
//  太平洋 ~   ~   ~   ~   ~ 
//       ~  1   2   2   3  (5) *
//       ~  3   2   3  (4) (4) *
//       ~  2   4  (5)  3   1  *
//       ~ (6) (7)  1   4   5  *
//       ~ (5)  1   1   2   4  *
//          *   *   *   *   * 大西洋
//
//返回:
//
//[[0, 4], [1, 3], [1, 4], [2, 2], [3, 0], [3, 1], [4, 0]] (上图中带括号的单元).
// 
//
// 
// Related Topics 深度优先搜索 广度优先搜索 数组 矩阵 
// 👍 317 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

//Java：太平洋大西洋水流问题
public class P417PacificAtlanticWaterFlow {
    public static void main(String[] args) {
        Solution solution = new P417PacificAtlanticWaterFlow().new Solution();
        int[][] heights = new int[][]{{1, 2, 2, 3, 5}, {3, 2, 3, 4, 4}, {2, 4, 5, 3, 1}, {6, 7, 1, 4, 5}, {5, 1, 1, 2, 4}};
        System.out.println(solution.pacificAtlantic(heights));
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> pacificAtlantic(int[][] heights) {
            if (heights == null || heights.length == 0 || heights[0].length == 0) {
                return null;
            }
            int row = heights.length;
            int col = heights[0].length;
            boolean[][] can_reach_p = new boolean[row][col];
            boolean[][] can_reach_a = new boolean[row][col];
            for (int i = 0; i < row; i++) {
                dfs(heights, can_reach_p, i, 0);
                dfs(heights, can_reach_a, i, col - 1);
            }
            for (int i = 0; i < col; i++) {
                dfs(heights, can_reach_p, 0, i);
                dfs(heights, can_reach_a, row - 1, i);
            }

            List<List<Integer>> ans = new ArrayList<>();
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (can_reach_a[i][j] && can_reach_p[i][j]) {
                        List<Integer> ls = new ArrayList<>();
                        ls.add(i);
                        ls.add(j);
                        ans.add(ls);
                    }
                }
            }
            return ans;
        }

        public void dfs(int[][] heights, boolean[][] can_reach, int r, int c) {
            int[] direction = new int[]{-1, 0, 1, 0, -1};
            if (can_reach[r][c]) {
                return;
            }
            can_reach[r][c] = true;
            int x, y;
            for (int i = 0; i < 4; i++) {
                x = r + direction[i];
                y = c + direction[i + 1];
                if (x >= 0 && x < heights.length && y >= 0 && y < heights[0].length && heights[x][y] >= heights[r][c]) {
                    dfs(heights, can_reach, x, y);
                }
            }
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}
