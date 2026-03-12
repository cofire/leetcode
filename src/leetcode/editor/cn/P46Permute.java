package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class P46Permute {
    public static void main(String[] args) {
        System.out.println(new P46Permute().permute(new int[]{1, 2, 3}));
    }

    public List<List<Integer>> permute(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        List<List<Integer>> result = new ArrayList<>();
        int cnt = nums.length;
        backTrack(nums, 0, result, new ArrayList<>(), new BitSet(cnt));
        return result;
    }

    public void backTrack(int[] nums, int cnt, List<List<Integer>> result, List<Integer> preList, BitSet preSet) {
        if (cnt == nums.length) {
            result.add(new ArrayList<>(preList));
            return;
        }
        int n = nums.length;
        cnt++;
        for (int i = 0; i < n; i++) {
            if (preSet.get(i)) {
                continue;
            }
            List<Integer> tmpList = new ArrayList<>(preList);
            tmpList.add(nums[i]);
            BitSet tmpSet = (BitSet) preSet.clone();
            tmpSet.set(i);
            backTrack(nums, cnt, result, tmpList, tmpSet);
        }
    }
}
