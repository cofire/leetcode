//给你一个 m * n 的矩阵 grid，矩阵中的元素无论是按行还是按列，都以非递增顺序排列。 
//
// 请你统计并返回 grid 中 负数 的数目。 
//
// 
//
// 示例 1： 
//
// 输入：grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
//输出：8
//解释：矩阵中共有 8 个负数。
// 
//
// 示例 2： 
//
// 输入：grid = [[3,2],[1,0]]
//输出：0
// 
//
// 示例 3： 
//
// 输入：grid = [[1,-1],[-1,-1]]
//输出：3
// 
//
// 示例 4： 
//
// 输入：grid = [[-1]]
//输出：1
// 
//
// 
//
// 提示： 
//
// 
// m == grid.length 
// n == grid[i].length 
// 1 <= m, n <= 100 
// -100 <= grid[i][j] <= 100 
// 
// Related Topics 数组 二分查找


package leetcode.editor.cn;

//Java：统计有序矩阵中的负数
public class P1351CountNegativeNumbersInASortedMatrix {
    public static void main(String[] args) {
        Solution solution = new P1351CountNegativeNumbersInASortedMatrix().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int countNegatives(int[][] grid) {
            if (grid.length == 0 || grid[0].length == 0) {
                return 0;
            }
            int count = 0;
            for (int i = 0, j = grid[0].length - 1; i < grid.length && j >= 0; ) {
                if (grid[i][j] >= 0) {
                    i++;
                } else {
                    count += grid.length - i;
                    j--;
                }
            }
            return count;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
