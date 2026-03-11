package leetcode.editor.cn;

import java.util.BitSet;

public class P278FindDuplicate {
    public static void main(String[] args) {
        System.out.println(new P278FindDuplicate().findDuplicate(new int[]{1, 3, 4, 2, 2}));
        System.out.println(new P278FindDuplicate().findDuplicate(new int[]{3, 1, 3, 4, 2}));
        System.out.println(new P278FindDuplicate().findDuplicate(new int[]{3, 3, 3, 3, 3}));
        System.out.println(new P278FindDuplicate().findDuplicate(new int[]{3, 3}));
    }

    public int findDuplicate(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return -1;
        }
        int n = nums.length;
        BitSet bitSet = new BitSet(n + 1);
        for (int i = 0; i < n; i++) {
            if (bitSet.get(nums[i])) {
                return nums[i];
            }
            bitSet.set(nums[i]);
        }
        return 0;
    }
}
