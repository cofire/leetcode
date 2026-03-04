package leetcode.editor.cn;

public class P34SearchRange {
    public static void main(String[] args) {
        System.out.println(new P34SearchRange().searchRange(new int[]{}, 0));
        System.out.println(new P34SearchRange().searchRange(new int[]{0}, 0));
        System.out.println(new P34SearchRange().searchRange(new int[]{1}, 0));
        System.out.println(new P34SearchRange().searchRange(new int[]{1}, 0));
        System.out.println(new P34SearchRange().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8));
        System.out.println(new P34SearchRange().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6));

    }

    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[]{-1, -1};
        }
        int n = nums.length;
        int left = searchLeft(nums, target, 0, n - 1);
        if (left == -1) {
            return new int[]{-1, -1};
        }
        int right = searchRight(nums, target, 0, n - 1);
        return new int[]{left, right};
    }

    public int searchLeft(int[] nums, int target, int left, int right) {
        if (nums[left] == target) {
            return left;
        }
        int mid = (left + right) / 2;
        if (mid == left) {
            if (nums[right] != target) {
                return -1;
            } else {
                return right;
            }

        }
        if (nums[mid] == target) {
            if (nums[mid - 1] < target) {
                return mid;
            }
            if (nums[mid - 1] == target) {
                return searchLeft(nums, target, left, mid - 1);
            }
        }
        if (nums[mid] > target) {
            return searchLeft(nums, target, left, mid - 1);
        }

        if (nums[mid] < target) {
            return searchLeft(nums, target, mid + 1, right);
        }
        return -1;
    }

    public int searchRight(int[] nums, int target, int left, int right) {
        if (nums[right] == target) {
            return right;
        }
        int mid = (left + right) / 2;
        if (mid == left) {
            if (nums[left] != target) {
                return -1;
            } else {
                return left;
            }

        }
        if (nums[mid] == target) {
            if (nums[mid + 1] > target) {
                return mid;
            }
            if (nums[mid + 1] == target) {
                return searchRight(nums, target, mid + 1, right);
            }
        }
        if (nums[mid] > target) {
            return searchRight(nums, target, left, mid - 1);
        }

        if (nums[mid] < target) {
            return searchRight(nums, target, mid + 1, right);
        }
        return -1;
    }
}
