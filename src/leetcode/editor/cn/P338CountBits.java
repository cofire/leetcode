package leetcode.editor.cn;

public class P338CountBits {
    public static void main(String[] args) {
        P338CountBits p338CountBits = new P338CountBits();
        int[] result = p338CountBits.countBits(0);
        result = p338CountBits.countBits(1);
        result = p338CountBits.countBits(2);
        result = p338CountBits.countBits(3);
        result = p338CountBits.countBits(4);
        result = p338CountBits.countBits(5);

    }

    public int[] countBits(int n) {
        if (n < 0) {
            return null;
        }

        int[] result = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int cur = i;
            int cnt = 0;
            while (cur > 0) {
                if ((cur & 1) == 1) {
                    cnt++;
                }
                cur = cur >> 1;
            }
            result[i] = cnt;
        }
        return result;
    }
}
