//已知函数 signFunc(x) 将会根据 x 的正负返回特定值： 
//
// 
// 如果 x 是正数，返回 1 。 
// 如果 x 是负数，返回 -1 。 
// 如果 x 是等于 0 ，返回 0 。 
// 
//
// 给你一个整数数组 nums 。令 product 为数组 nums 中所有元素值的乘积。 
//
// 返回 signFunc(product) 。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [-1,-2,-3,-4,3,2,1]
//输出：1
//解释：数组中所有值的乘积是 144 ，且 signFunc(144) = 1
// 
//
// 示例 2： 
//
// 
//输入：nums = [1,5,0,2,-3]
//输出：0
//解释：数组中所有值的乘积是 0 ，且 signFunc(0) = 0
// 
//
// 示例 3： 
//
// 
//输入：nums = [-1,1,-1,1,-1]
//输出：-1
//解释：数组中所有值的乘积是 -1 ，且 signFunc(-1) = -1
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 1000 
// -100 <= nums[i] <= 100 
// 
// Related Topics 数学


package leetcode.editor.cn;

//Java：数组元素积的符号
public class P1822SignOfTheProductOfAnArray {
    public static void main(String[] args) {
        Solution solution = new P1822SignOfTheProductOfAnArray().new Solution();
        System.out.println(solution.arraySign(new int[]{-1, -2, -3, -4, 3, 2, 1}));
        System.out.println(solution.arraySign(new int[]{1, 5, 0, 2, -3}));
        System.out.println(solution.arraySign(new int[]{-1, 1, -1, 1, -1}));
        System.out.println(solution.arraySign(new int[]{-1, 1, -1, 1}));
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int arraySign(int[] nums) {
            int coun0 = 0;
            int count1 = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    coun0++;
                } else if (nums[i] < 1) {
                    count1++;
                }
            }
            if (coun0 > 0) {
                return 0;
            }
            if (count1 > 0) {
                if (count1 % 2 == 0) {
                    return 1;
                } else {
                    return -1;
                }
            }
            return 1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
