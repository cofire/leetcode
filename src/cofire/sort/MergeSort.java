package cofire.sort;

/**
 * @Description
 * @ClassName MergeSort
 * @Author Ly
 * @date 2021.11.28 20:01
 */
public class MergeSort extends BaseSort {

    public static void mergeSort(int[] nums, int L, int R, int[] tmp) {
        if (L + 1 >= R) {
            return;
        }
        int m = L + (R - L) / 2;
        mergeSort(nums, L, m, tmp);
        mergeSort(nums, m, R, tmp);
        int p = L, q = m, i = L;
        while (p < m || q < R) {
            if (q >= R || (p < m && nums[p] <= nums[q])) {
                tmp[i++] = nums[p++];
            } else {
                tmp[i++] = nums[q++];
            }
        }
        for (i = L; i < R; i++) {
            nums[i] = tmp[i];
        }
    }

    public static void merge(int[] nums, int L, int m, int R, int[] tmp) {
        int p = L, q = m, i = L;
        while (p < m || q < R) {
            if (q >= R || (p < m && nums[p] <= nums[q])) {
                tmp[i++] = nums[p++];
            } else {
                tmp[i++] = nums[q++];
            }
        }
        for (i = L; i < R; i++) {
            nums[i] = tmp[i];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 4, 9, 6, 0, 7, 8, 5, 1};
        int[] tmp = new int[nums1.length];
        printNums(nums1);
        mergeSort(nums1, 0, nums1.length, tmp);
        printNums(nums1);
    }

}
