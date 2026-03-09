package leetcode.editor.cn;

public class P279NumSquares {

    public static void main(String[] args) {
        System.out.println(new P279NumSquares().numSquares(12));
        System.out.println(new P279NumSquares().numSquares(13));

    }

    public int numSquares(int n) {
        int[] nums = new int[10001];
        for (int i = 0; i <= 100; i++) {
            nums[i * i] = 1;
        }

        for (int i = 0; i <= n; i++) {
            if (nums[i] > 0) {
                continue;
            }
            int min = Integer.MAX_VALUE;
            int left = 1, right = i - 1;
            while (left <= right) {
                min = Math.min(min, nums[left] + nums[right]);
                left++;
                right--;
            }
            nums[i] = min;
        }
        return nums[n];
    }
}
