package leetcode.editor.cn;

import java.util.Arrays;

public class P581FindUnsortedSubarray {
    public static void main(String[] args) {
        System.out.println(new P581FindUnsortedSubarray().findUnsortedSubarray(new int[]{2, 6, 4, 8, 10, 9, 15}));
        System.out.println(new P581FindUnsortedSubarray().findUnsortedSubarray(new int[]{2, 6, 4, 8, 10, 15}));
        System.out.println(new P581FindUnsortedSubarray().findUnsortedSubarray(new int[]{1, 2, 3, 4}));
        System.out.println(new P581FindUnsortedSubarray().findUnsortedSubarray(new int[]{1}));
        System.out.println(new P581FindUnsortedSubarray().findUnsortedSubarray(new int[]{1, 2}));
        System.out.println(new P581FindUnsortedSubarray().findUnsortedSubarray(new int[]{2, 1}));

    }

    public int findUnsortedSubarray(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return 0;
        }
        int n = nums.length;
        int[] newNums = Arrays.copyOf(nums, n);
        Arrays.sort(newNums);
        int left = n - 1, right = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != newNums[i]) {
                left = i;
                break;
            }
        }
        for (int i = n - 1; i > 0; i--) {
            if (nums[i] != newNums[i]) {
                right = i;
                break;
            }
        }
        if (left < right) {
            return right - left + 1;
        }
        return 0;
    }
}
