package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class P448FindDisappearedNumbers {
    public static void main(String[] args) {
        System.out.println(new P448FindDisappearedNumbers().findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
        System.out.println(new P448FindDisappearedNumbers().findDisappearedNumbers(new int[]{1, 1}));

    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        BitSet bitSet = new BitSet(n + 1);
        for (int i = 0; i < n; i++) {
            bitSet.set(nums[i]);
        }
        for (int i = 1; i < n + 1; i++) {
            if (!bitSet.get(i)) {
                result.add(i);
            }
        }

        return result;
    }
}
