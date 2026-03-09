package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class P78Subsets {
    public static void main(String[] args) {
        System.out.println(new P78Subsets().subsets(new int[]{1, 2, 3}));
        System.out.println(new P78Subsets().subsets(new int[]{0}));

    }

    public List<List<Integer>> subsets(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        List<List<Integer>> subsets = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        subsets(nums, 0, subsets, subset);
        return subsets;
    }

    public void subsets(int[] nums, int index, List<List<Integer>> subsets, List<Integer> subset) {
        if (index == nums.length) {
            subsets.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[index]);
        subsets(nums, index + 1, subsets, subset);
        subset.remove(subset.size() - 1);
        subsets(nums, index + 1, subsets, subset);
    }
}
