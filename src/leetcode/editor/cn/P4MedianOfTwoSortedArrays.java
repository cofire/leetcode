//给定两个大小为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。 
//
// 请你找出这两个正序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。 
//
// 你可以假设 nums1 和 nums2 不会同时为空。 
//
// 
//
// 示例 1: 
//
// nums1 = [1, 3]
//nums2 = [2]
//
//则中位数是 2.0
// 
//
// 示例 2: 
//
// nums1 = [1, 2]
//nums2 = [3, 4]
//
//则中位数是 (2 + 3)/2 = 2.5
// 
// Related Topics 数组 二分查找 分治算法


package leetcode.editor.cn;

//Java：寻找两个正序数组的中位数
public class P4MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        Solution solution = new P4MedianOfTwoSortedArrays().new Solution();
//        int[] nums1 = new int[]{1, 2};
//        int[] nums2 = new int[]{3, 4};
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{2};
        System.out.println(solution.findMedianSortedArrays(nums1, nums2));
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int length1 = nums1.length;
            int length2 = nums2.length;
            int length = length1 + length2;
            if (length < 1) {
                return 0;
            }
            int[] merge = new int[length];
            int p1 = 0;
            int p2 = 0;
            for (int i = 0; i < length; i++) {
                if (p1 < length1 && p2 < length2) {
                    if (nums1[p1] < nums2[p2]) {
                        merge[i] = nums1[p1];
                        p1++;
                    } else {
                        merge[i] = nums2[p2];
                        p2++;
                    }
                } else if (p1 < length1 && !(p2 < length2)) {
                    merge[i] = nums1[p1];
                    p1++;
                } else if (!(p1 < length1) && p2 < length2) {
                    merge[i] = nums2[p2];
                    p2++;
                }
            }
            if (length % 2 == 1) {
                return merge[(length - 1) / 2];
            } else {
                return (merge[length / 2] + merge[(length - 2) / 2]) * 1.0 / 2;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
