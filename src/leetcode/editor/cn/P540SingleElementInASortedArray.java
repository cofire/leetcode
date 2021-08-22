//给定一个只包含整数的有序数组，每个元素都会出现两次，唯有一个数只会出现一次，找出这个数。 
//
// 示例 1: 
//
// 
//输入: [1,1,2,3,3,4,4,8,8]
//输出: 2
// 
//
// 示例 2: 
//
// 
//输入: [3,3,7,7,10,11,11]
//输出: 10
// 
//
// 注意: 您的方案应该在 O(log n)时间复杂度和 O(1)空间复杂度中运行。 
// Related Topics 数组 二分查找


package leetcode.editor.cn;

//Java：有序数组中的单一元素
public class P540SingleElementInASortedArray {
    public static void main(String[] args) {
        Solution solution = new P540SingleElementInASortedArray().new Solution();
        System.out.println(solution.singleNonDuplicate(new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8}));
        System.out.println(solution.singleNonDuplicate(new int[]{3, 3, 7, 7, 10, 11, 11}));
        System.out.println(solution.singleNonDuplicate(new int[]{3, 3, 7, 7, 8, 8, 9, 11, 11}));
        System.out.println(solution.singleNonDuplicate(new int[]{3, 3, 4, 7, 7, 8, 8, 11, 11}));
        System.out.println(solution.singleNonDuplicate(new int[]{1, 3, 3, 7, 7, 8, 8, 11, 11}));
        System.out.println(solution.singleNonDuplicate(new int[]{3, 3, 7, 7, 8, 8, 11, 11, 12}));
        System.out.println(solution.singleNonDuplicate(new int[]{3}));
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int singleNonDuplicate(int[] nums) {
            int L = 0, R = nums.length - 1, mid = 0;
            while (L < R) {
                mid = (L + R) / 2;
                if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                    return nums[mid];
                }
                if (nums[mid] == nums[mid - 1]) {
                    if ((mid - L + 1) % 2 == 0) {
                        L = mid + 1;
                    } else {
                        R = mid - 2;
                    }
                } else if (nums[mid] == nums[mid + 1]) {
                    if ((R - mid + 1) % 2 == 0) {
                        R = mid - 1;
                    } else {
                        L = mid + 2;
                    }
                }
            }
            return nums[L];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
