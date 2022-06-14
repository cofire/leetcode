//三步问题。有个小孩正在上楼梯，楼梯有n阶台阶，小孩一次可以上1阶、2阶或3阶。实现一种方法，计算小孩有多少种上楼梯的方式。结果可能很大，你需要对结果模100
//0000007。 
//
// 示例1: 
//
// 
// 输入：n = 3 
// 输出：4
// 说明: 有四种走法
// 
//
// 示例2: 
//
// 
// 输入：n = 5
// 输出：13
// 
//
// 提示: 
//
// 
// n范围在[1, 1000000]之间 
// 
// Related Topics 记忆化搜索 数学 动态规划 
// 👍 75 👎 0


package leetcode.editor.cn;

//Java：三步问题
// 面试题 08.01
public class PThreeStepsProblemLcci {
  public static void main(String[] args) {
    Solution solution = new PThreeStepsProblemLcci().new Solution();
    System.out.println(solution.waysToStep(1000000));
    System.out.println(solution.waysToStep(1));
    System.out.println(solution.waysToStep(2));
    System.out.println(solution.waysToStep(3));
    System.out.println(solution.waysToStep(4));
    System.out.println(solution.waysToStep(5));
    // TO TEST
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    private int[] fn = new int[1000001];

    public int waysToStep(int n) {
      if (fn[n] != 0) {
        return fn[n] % 1000000007;
      }
      fn[0] = 1;
      fn[1] = 1;
      fn[2] = 2;
      for (int i = 3; i <= n; i++) {
        fn[i] = ((fn[i - 1] + fn[i - 2]) % 1000000007 + fn[i - 3]) % 1000000007;
      }
      return fn[n] % 1000000007;
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
