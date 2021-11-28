package cofire.sort;

/**
 * @Description
 * @ClassName QuickSort
 * @Author Ly
 * @date 2021.11.28 19:27
 */
public class QuickSort extends BaseSort {
    public static void quickSort(int[] nums, int L, int R) {
        if (L + 1 >= R) {
            return;
        }
        int first = L, last = R - 1, key = nums[first];
        while (first < last) {
            while (first < last && nums[first] <= nums[last]) {
                last--;
            }
            nums[first] = nums[last];
            while (first < last && nums[first] <= key) {
                ++first;
            }
            nums[last] = nums[first];
        }
        nums[first] = key;
        quickSort(nums, L, first);
        quickSort(nums, first + 1, R);
    }


    public static void main(String[] args) {
        int[] nums1 = {3, 2, 4, 9, 0, 7, 8, 6, 5, 1};
        printNums(nums1);
        quickSort(nums1, 0, nums1.length);
        printNums(nums1);
    }
}
