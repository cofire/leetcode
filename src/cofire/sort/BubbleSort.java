package cofire.sort;

/**
 * @Description
 * @ClassName MergeSort
 * @Author Ly
 * @date 2021.11.28 20:01
 */
public class BubbleSort extends BaseSort {

    public static void bubbleSort(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int n = nums.length;
        boolean swapped;
        for (int i = 1; i < n; i++) {
            swapped = false;
            for (int j = 1; j < n - i + 1; j++) {
                if (nums[j - 1] > nums[j]) {
                    int tmp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = tmp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }


    public static void main(String[] args) {
        int[] nums1 = {3, 2, 4, 9, 6, 0, 7, 8, 5, 1};
        printNums(nums1);
        bubbleSort(nums1);
        printNums(nums1);
    }

}
