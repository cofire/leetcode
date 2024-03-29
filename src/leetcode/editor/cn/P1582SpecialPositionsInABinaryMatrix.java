//给你一个大小为 rows x cols 的矩阵 mat，其中 mat[i][j] 是 0 或 1，请返回 矩阵 mat 中特殊位置的数目 。 
//
// 特殊位置 定义：如果 mat[i][j] == 1 并且第 i 行和第 j 列中的所有其他元素均为 0（行和列的下标均 从 0 开始 ），则位置 (i, 
//j) 被称为特殊位置。 
//
// 
//
// 示例 1： 
//
// 输入：mat = [[1,0,0],
//            [0,0,1],
//            [1,0,0]]
//输出：1
//解释：(1,2) 是一个特殊位置，因为 mat[1][2] == 1 且所处的行和列上所有其他元素都是 0
// 
//
// 示例 2： 
//
// 输入：mat = [[1,0,0],
//            [0,1,0],
//            [0,0,1]]
//输出：3
//解释：(0,0), (1,1) 和 (2,2) 都是特殊位置
// 
//
// 示例 3： 
//
// 输入：mat = [[0,0,0,1],
//            [1,0,0,0],
//            [0,1,1,0],
//            [0,0,0,0]]
//输出：2
// 
//
// 示例 4： 
//
// 输入：mat = [[0,0,0,0,0],
//            [1,0,0,0,0],
//            [0,1,0,0,0],
//            [0,0,1,0,0],
//            [0,0,0,1,1]]
//输出：3
// 
//
// 
//
// 提示： 
//
// 
// rows == mat.length 
// cols == mat[i].length 
// 1 <= rows, cols <= 100 
// mat[i][j] 是 0 或 1 
// 
// Related Topics 数组


package leetcode.editor.cn;

//Java：二进制矩阵中的特殊位置
public class P1582SpecialPositionsInABinaryMatrix {
    public static void main(String[] args) {
        Solution solution = new P1582SpecialPositionsInABinaryMatrix().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        int count = 0;

        public int numSpecial(int[][] mat) {
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    if (mat[i][j] == 1) {
                        // 每次记录传输的原地址 只要所有的没有1则
                        if (temp1(mat, i + 1, i, j) && temp1(mat, i - 1, i, j) && temp2(mat, i, j - 1, j) && temp2(mat, i, j + 1, j)) {
                            count++;
                        }
                    }

                }
            }
            return count;
        }

        public boolean temp1(int[][] mat, int i, int index, int j) {

            if (i < 0 || i > mat.length - 1) return true;
            if (mat[i][j] == 1) return false;
            return index > i ? temp1(mat, i - 1, index, j) : temp1(mat, i + 1, index, j);
        }

        public boolean temp2(int[][] mat, int i, int j, int index) {

            if (j < 0 || j > mat[i].length - 1) return true;
            if (mat[i][j] == 1) return false;
            return index > j ? temp2(mat, i, j - 1, index) : temp2(mat, i, j + 1, index);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
