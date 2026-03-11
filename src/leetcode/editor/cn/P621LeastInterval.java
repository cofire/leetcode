package leetcode.editor.cn;

import java.util.BitSet;

public class P621LeastInterval {
    public static void main(String[] args) {
        System.out.println(new P621LeastInterval().leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 2));
        System.out.println(new P621LeastInterval().leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 3));
        System.out.println(new P621LeastInterval().leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 4));
        System.out.println(new P621LeastInterval().leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 1));
        System.out.println(new P621LeastInterval().leastInterval(new char[]{'A', 'C', 'A', 'B', 'D', 'B'}, 1));
        System.out.println(new P621LeastInterval().leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B', 'C', 'C', 'C', 'D', 'D', 'E'}, 1));

    }

    public int leastInterval(char[] tasks, int n) {
        if (n == 0) {
            return tasks.length;
        }
        int[] taskNums = new int[26];
        int taskCnt = tasks.length;
        for (int i = 0; i < taskCnt; i++) {
            taskNums[tasks[i] - 'A']++;
        }
        BitSet bitSet = new BitSet(26);
        int interval = 0;
        while (taskCnt > 0) {
            bitSet.clear();
            for (int i = 0; i < n + 1 && taskCnt > 0; i++) {
                interval++;
                int index = getMaxCountTask(taskNums, bitSet);
                if (index == -1) {
                    continue;
                }
                bitSet.set(index);
                taskNums[index]--;
                taskCnt--;
            }
        }
        return interval;
    }

    public int getMaxCountTask(int[] taskNums, BitSet bitSet) {
        int max = -1;
        for (int i = 0; i < 26; i++) {
            if (bitSet.get(i)) {
                continue;
            }
            if ((taskNums[i] > 0) && (max == -1 || taskNums[i] > taskNums[max])) {
                max = i;
            }
        }
        return max;
    }
}
