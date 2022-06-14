//整数转换。编写一个函数，确定需要改变几个位才能将整数A转成整数B。 
//
// 示例1: 
//
// 
// 输入：A = 29 （或者0b11101）, B = 15（或者0b01111）
// 输出：2
// 
//
// 示例2: 
//
// 
// 输入：A = 1，B = 2
// 输出：2
// 
//
// 提示: 
//
// 
// A，B范围在[-2147483648, 2147483647]之间 
// 
// Related Topics 位运算 
// 👍 36 👎 0


package leetcode.editor.cn;

//Java：整数转换
public class P05_06ConvertIntegerLcci {
    public static void main(String[] args) {
        Solution solution = new P05_06ConvertIntegerLcci().new Solution();
//        System.out.println(Integer.toBinaryString(-1 >> 1));
//        System.out.println(Integer.toBinaryString(-1 ^ -3));
//        System.out.println(Integer.toBinaryString(-1 ^ 3));
//        System.out.println(Integer.toBinaryString(-1 << 1 ^ -1));
//        System.out.println(Integer.toBinaryString(1 << 31));

        System.out.println(solution.convertInteger(29, 15));
        System.out.println(solution.convertInteger(1, 2));
        System.out.println(solution.convertInteger(0, 1));
        System.out.println(solution.convertInteger(-1, 1));
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int convertInteger(int A, int B) {
            int ans = 0;
            int res = A ^ B;
            int c = 1;
            for (int i = 0; i < 32; i++) {
                if ((res & c) == (1 << i)) {
                    ans++;
                }
                c = c << 1;
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
