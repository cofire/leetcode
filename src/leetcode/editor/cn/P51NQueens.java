//n 皇后问题 研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。 
//
// 给你一个整数 n ，返回所有不同的 n 皇后问题 的解决方案。 
//
// 
// 
// 每一种解法包含一个不同的 n 皇后问题 的棋子放置方案，该方案中 'Q' 和 '.' 分别代表了皇后和空位。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 4
//输出：[[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
//解释：如上图所示，4 皇后问题存在两个不同的解法。
// 
//
// 示例 2： 
//
// 
//输入：n = 1
//输出：[["Q"]]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 9 
// 
// 
// 
// Related Topics 数组 回溯 
// 👍 1125 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

//Java：N 皇后
public class P51NQueens {
    public static void main(String[] args) {
        Solution solution = new P51NQueens().new Solution();
        System.out.println(solution.solveNQueens(1));
        System.out.println(solution.solveNQueens(4));
        System.out.println(solution.solveNQueens(8));
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<String>> solveNQueens(int n) {
            List<List<String>> ans = new ArrayList<>();
            if (n <= 0) {
                return ans;
            }
            boolean[][] board = new boolean[n][n];
            boolean[] column = new boolean[n];
            boolean[] Ldiag = new boolean[2 * n + 1];
            boolean[] Rdiag = new boolean[2 * n + 1];
            backtracking(ans, board, column, Ldiag, Rdiag, 0, n);
            return ans;
        }

        public void backtracking(List<List<String>> ans, boolean[][] board, boolean column[], boolean[] Ldiag, boolean[] Rdiag, int row, int n) {
            if (row == n) {
                ans.add(numsToList(board, n));
                return;
            }
            for (int i = 0; i < n; ++i) {
                if (column[i] || Ldiag[n - row + i - 1] || Rdiag[row + i + 1]) {
                    continue;
                }
                board[row][i] = true;
                column[i] = Ldiag[n - row + i - 1] = Rdiag[row + i + 1] = true;
                backtracking(ans, board, column, Ldiag, Rdiag, row + 1, n);
                board[row][i] = false;
                column[i] = Ldiag[n - row + i - 1] = Rdiag[row + i + 1] = false;
            }
        }

        public List<String> numsToList(boolean[][] board, int n) {
            List<String> ls = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    if (board[i][j]) {
                        sb.append("Q");
                    } else {
                        sb.append(".");
                    }
                }
                ls.add(sb.toString());
            }
            return ls;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
