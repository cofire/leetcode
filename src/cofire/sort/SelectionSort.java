package cofire.sort;

/**
 * @Description
 * @ClassName InsertionSort
 * @Author Ly
 * @date 2021.11.29 21:14
 */
public class SelectionSort extends BaseSort {
    public static void selectionSort(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int n = nums.length;
        int min;
        for (int i = 0; i < n; i++) {
            min = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int tmp = nums[min];
                nums[min] = nums[i];
                nums[i] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 4, 9, 6, 0, 7, 8, 5, 1};
        int[] tmp = new int[nums1.length];
        printNums(nums1);
        selectionSort(nums1);
        printNums(nums1);
    }
}
