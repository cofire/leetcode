package leetcode.editor.cn;

public class P121MaxProfit {
    public static void main(String[] args) {
        System.out.println(new P121MaxProfit().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(new P121MaxProfit().maxProfit(new int[]{7, 6, 4, 3, 1}));

    }

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int n = prices.length;
        int max = 0;
        int min = prices[0];
        for (int i = 1; i < n; i++) {
            if (prices[i] > min) {
                if (prices[i] - min > max) {
                    max = prices[i] - min;
                }
            } else {
                min = prices[i];
            }
        }
        return max;
    }
}
