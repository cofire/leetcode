//已知一个长度为 n 的数组，预先按照升序排列，经由 1 到 n 次 旋转 后，得到输入数组。例如，原数组 nums = [0,1,4,4,5,6,7] 在变
//化后可能得到：
// 
// 若旋转 4 次，则可以得到 [4,5,6,7,0,1,4] 
// 若旋转 7 次，则可以得到 [0,1,4,4,5,6,7] 
// 
//
// 注意，数组 [a[0], a[1], a[2], ..., a[n-1]] 旋转一次 的结果为数组 [a[n-1], a[0], a[1], a[2], 
//..., a[n-2]] 。 
//
// 给你一个可能存在 重复 元素值的数组 nums ，它原来是一个升序排列的数组，并按上述情形进行了多次旋转。请你找出并返回数组中的 最小元素 。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,3,5]
//输出：1
// 
//
// 示例 2： 
//
// 
//输入：nums = [2,2,2,0,1]
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// n == nums.length 
// 1 <= n <= 5000 
// -5000 <= nums[i] <= 5000 
// nums 原来是一个升序排序的数组，并进行了 1 至 n 次旋转 
// 
//
// 
//
// 进阶： 
//
// 
// 这道题是 寻找旋转排序数组中的最小值 的延伸题目。 
// 允许重复会影响算法的时间复杂度吗？会如何影响，为什么？ 
// 
// Related Topics 数组 二分查找


package leetcode.editor.cn;

//Java：寻找旋转排序数组中的最小值 II
public class P154FindMinimumInRotatedSortedArrayIi {
    public static void main(String[] args) {
        Solution solution = new P154FindMinimumInRotatedSortedArrayIi().new Solution();
        System.out.println(solution.findMin(new int[]{1, 3, 5}));
        System.out.println(solution.findMin(new int[]{2, 2, 2, 0, 1}));
        System.out.println(solution.findMin(new int[]{2}));
        System.out.println(solution.findMin(new int[]{2, 2}));
        System.out.println(solution.findMin(new int[]{2, 1}));
        System.out.println(solution.findMin(new int[]{10, 1, 10, 10, 10}));

        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findMin(int[] nums) {
            int L = 0, R = nums.length - 1, mid, min = nums[0];
            while (L <= R) {
                mid = (L + R) / 2;
                if (nums[L] < min) {
                    min = nums[L];
                }
                if (nums[mid] > nums[L]) {
                    L = mid + 1;
                } else if (nums[mid] == nums[L]) {
                    L++;
                } else {
                    R = mid;
                }
            }
            return min;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
