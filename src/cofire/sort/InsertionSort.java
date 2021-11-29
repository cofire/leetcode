package cofire.sort;

/**
 * @Description
 * @ClassName InsertionSort
 * @Author Ly
 * @date 2021.11.29 21:14
 */
public class InsertionSort extends BaseSort {
    public static void insertionSort(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0 && nums[j] < nums[j - 1]; j--) {
                int tmp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 4, 9, 6, 0, 7, 8, 5, 1};
        int[] tmp = new int[nums1.length];
        printNums(nums1);
        insertionSort(nums1);
        printNums(nums1);
    }
}
