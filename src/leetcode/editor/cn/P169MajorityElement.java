package leetcode.editor.cn;

public class P169MajorityElement {
    public static void main(String[] args) {
        System.out.println(new P169MajorityElement().majorityElement(new int[]{3, 2, 3}));
        System.out.println(new P169MajorityElement().majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
        System.out.println(new P169MajorityElement().majorityElement(new int[]{2, 2, 1, 1, 1, 2, 1}));
        System.out.println(new P169MajorityElement().majorityElement(new int[]{22, 22}));

    }

    public int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int n = nums.length;
        int majority = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                majority = nums[i];
                cnt++;
                continue;
            }
            if (nums[i] == majority) {
                cnt++;
            } else {
                cnt--;
            }
        }
        if (cnt > 0) {
            return majority;
        }
        return 0;
    }
}
