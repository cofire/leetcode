//在一个 XY 坐标系中有一些点，我们用数组 coordinates 来分别记录它们的坐标，其中 coordinates[i] = [x, y] 表示横坐标为
// x、纵坐标为 y 的点。 
//
// 请你来判断，这些点是否在该坐标系中属于同一条直线上，是则返回 true，否则请返回 false。 
//
// 
//
// 示例 1： 
//
// 
//
// 输入：coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
//输出：true
// 
//
// 示例 2： 
//
// 
//
// 输入：coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 2 <= coordinates.length <= 1000 
// coordinates[i].length == 2 
// -10^4 <= coordinates[i][0], coordinates[i][1] <= 10^4 
// coordinates 中不含重复的点 
// 
// Related Topics 几何 数组 数学


package leetcode.editor.cn;

//Java：缀点成线
public class P1232CheckIfItIsAStraightLine {
    public static void main(String[] args) {
        Solution solution = new P1232CheckIfItIsAStraightLine().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean checkStraightLine(int[][] coordinates) {
            if (coordinates == null || coordinates.length < 3) {
                return true;
            }
            for (int i = 0; i < coordinates.length - 2; i++) {
                if (checkLineThree(coordinates[i], coordinates[i + 1], coordinates[i + 2])) {
                    continue;
                } else {
                    return false;
                }
            }
            return true;
        }

        public boolean checkLineThree(int[] a, int[] b, int[] c) {
            return (c[1] - b[1]) * (b[0] - a[0]) == (b[1] - a[1]) * (c[0] - b[0]);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
