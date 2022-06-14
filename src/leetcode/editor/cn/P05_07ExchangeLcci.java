//配对交换。编写程序，交换某个整数的奇数位和偶数位，尽量使用较少的指令（也就是说，位0与位1交换，位2与位3交换，以此类推）。 
//
// 示例1: 
//
// 
// 输入：num = 2（或者0b10）
// 输出 1 (或者 0b01)
// 
//
// 示例2: 
//
// 
// 输入：num = 3
// 输出：3
// 
//
// 提示: 
//
// 
// num的范围在[0, 2^30 - 1]之间，不会发生整数溢出。 
// 
// Related Topics 位运算 
// 👍 62 👎 0


package leetcode.editor.cn;

//Java：配对交换
public class P05_07ExchangeLcci {
    public static void main(String[] args) {
        Solution solution = new P05_07ExchangeLcci().new Solution();
        System.out.println(solution.exchangeBits(0));
        System.out.println(solution.exchangeBits(1));
        System.out.println(solution.exchangeBits(2));
        System.out.println(solution.exchangeBits(3));
        System.out.println(solution.exchangeBits(4));
        System.out.println(solution.exchangeBits(5));
        System.out.println(solution.exchangeBits(6));
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int exchangeBits(int num) {
            return (((num & 0x55555555) << 1) | ((num & 0xaaaaaaaa) >> 1));
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
