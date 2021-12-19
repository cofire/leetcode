//给定一个 m x n 二维字符网格 board 和一个字符串单词 word 。如果 word 存在于网格中，返回 true ；否则，返回 false 。 
//
// 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。 
//
// 
//
// 示例 1： 
//
// 
//输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "AB
//CCED"
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SE
//E"
//输出：true
// 
//
// 示例 3： 
//
// 
//输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "AB
//CB"
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// m == board.length 
// n = board[i].length 
// 1 <= m, n <= 6 
// 1 <= word.length <= 15 
// board 和 word 仅由大小写英文字母组成 
// 
//
// 
//
// 进阶：你可以使用搜索剪枝的技术来优化解决方案，使其在 board 更大的情况下可以更快解决问题？ 
// Related Topics 数组 回溯 矩阵 
// 👍 1116 👎 0


package leetcode.editor.cn;

import java.util.HashMap;

//Java：单词搜索
public class P79WordSearch {
    public static void main(String[] args) {
        Solution solution = new P79WordSearch().new Solution();
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        System.out.println(solution.exist(board, "ABCCED"));
        System.out.println(solution.exist(board, "SEE"));
        System.out.println(solution.exist(board, "ABCB"));
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean exist(char[][] board, String word) {
            if (board == null || board.length == 0 || board[0].length == 0 || word == null || word.length() == 0) {
                return false;
            }
            int m = board.length;
            int n = board[0].length;
            HashMap<String, Boolean> result = new HashMap<>();
            result.put("find", false);
            boolean[][] visited = new boolean[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    backtracking(i, j, board, word, visited, 0, result);
                }
            }

            return result.getOrDefault("find", false);
        }

        public void backtracking(int i, int j, char[][] board, String word, boolean[][] visited, int position, HashMap<String, Boolean> result) {
            if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) {
                return;
            }
            if (visited[i][j] || result.getOrDefault("find", false) || board[i][j] != word.charAt(position)) {
                return;
            }
            if (position == word.length() - 1) {
                result.put("find", true);
                return;
            }
            visited[i][j] = true;
            backtracking(i - 1, j, board, word, visited, position + 1, result);
            backtracking(i, j - 1, board, word, visited, position + 1, result);
            backtracking(i + 1, j, board, word, visited, position + 1, result);
            backtracking(i, j + 1, board, word, visited, position + 1, result);
            visited[i][j] = false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
