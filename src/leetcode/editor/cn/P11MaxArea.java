package leetcode.editor.cn;

public class P11MaxArea {
    public static void main(String[] args) {
        System.out.println(new P11MaxArea().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    public int maxArea(int[] height) {
        int max = 0;
        if (height == null || height.length < 2) {
            return max;
        }

        int n = height.length;
        int left = 0, right = n - 1;
        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
}
