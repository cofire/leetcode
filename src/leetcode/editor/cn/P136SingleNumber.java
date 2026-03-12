package leetcode.editor.cn;

public class P136SingleNumber {
    public static void main(String[] args) {
        System.out.println(new P136SingleNumber().singleNumber(new int[]{1}));
        System.out.println(new P136SingleNumber().singleNumber(new int[]{-1}));
        System.out.println(new P136SingleNumber().singleNumber(new int[]{2, 2, 1}));
        System.out.println(new P136SingleNumber().singleNumber(new int[]{4, 1, 2, 1, 2}));
    }

    public int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int num = nums[0];
        for (int i = 1; i < nums.length; i++) {
            num ^= nums[i];
        }

        return num;
    }
}
