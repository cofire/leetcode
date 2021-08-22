//给定整数数组 nums 和整数 k，请返回数组中第 k 个最大的元素。 
//
// 请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。 
//
// 
//
// 示例 1: 
//
// 
//输入: [3,2,1,5,6,4] 和 k = 2
//输出: 5
// 
//
// 示例 2: 
//
// 
//输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
//输出: 4 
//
// 
//
// 提示： 
//
// 
// 1 <= k <= nums.length <= 104 
// -104 <= nums[i] <= 104 
// 
// Related Topics 数组 分治 快速选择 排序 堆（优先队列）


package leetcode.editor.cn;

//Java：数组中的第K个最大元素
public class P215KthLargestElementInAnArray {
    public static void main(String[] args) {
        Solution solution = new P215KthLargestElementInAnArray().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            int L = 0, R = nums.length - 1, mid, target = nums.length - k;
            while (L < R) {
                mid = quickSelection(nums, L, R);
                if (mid == target) {
                    return nums[mid];
                }
                if (mid < target) {
                    L = mid + 1;
                } else {
                    R = mid - 1;
                }
            }
            return nums[L];
        }

        public int quickSelection(int[] num, int L, int R) {
            int i = L + 1, j = R;
            while (true) {
                while (i < R && num[i] <= num[L]) {
                    i++;
                }
                while (j > L && num[j] >= num[L]) {
                    j--;
                }
                if (i >= j) {
                    break;
                }
                int tmp = num[i];
                num[i] = num[j];
                num[j] = tmp;
            }
            int tmp = num[L];
            num[L] = num[j];
            num[j] = tmp;
            return j;
        }


    }
//leetcode submit region end(Prohibit modification and deletion)

}
