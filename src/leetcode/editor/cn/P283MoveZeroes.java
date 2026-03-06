package leetcode.editor.cn;

public class P283MoveZeroes {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 0};
        P283MoveZeroes p283MoveZeroes = new P283MoveZeroes();
        p283MoveZeroes.printNums(nums);
        p283MoveZeroes.moveZeroes(nums);
        p283MoveZeroes.printNums(nums);
    }

    public void printNums(int[] nums) {
        for (int num : nums) {
            System.out.printf(num + ",");
        }
        System.out.println("===================");
    }

    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }

        int left = 0;
        int right = 0;
        int n = nums.length;
        while (left < n && right < n) {
            while (left < n && nums[left] != 0) {
                left++;
            }
            while (right < n && nums[right] == 0) {
                right++;
            }
            if (left < n && right < n) {
                if (left < right) {
                    int tmp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = tmp;
                } else {
                    int tmp = left;
                    left = right;
                    right = tmp;
                }
            }
        }
    }
}
