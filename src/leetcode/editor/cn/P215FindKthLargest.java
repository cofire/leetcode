package leetcode.editor.cn;

import java.util.PriorityQueue;

public class P215FindKthLargest {
    public static void main(String[] args) {
        System.out.println(new P215FindKthLargest().findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
        System.out.println(new P215FindKthLargest().findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
        System.out.println(new P215FindKthLargest().findKthLargest(new int[]{5, 5, 6, 4}, 4));

    }

    public int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0 || k > nums.length) {
            return 0;
        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k);
        for (int i = 0; i < nums.length; i++) {
            if (priorityQueue.size() >= k) {
                int min = priorityQueue.peek();
                if (nums[i] > min) {
                    priorityQueue.poll();
                    priorityQueue.add(nums[i]);
                }
            } else {
                priorityQueue.add(nums[i]);
            }
        }

        return priorityQueue.peek();
    }
}
