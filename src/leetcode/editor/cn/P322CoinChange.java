package leetcode.editor.cn;

public class P322CoinChange {
    public static void main(String[] args) {
        System.out.println(new P322CoinChange().coinChange(new int[]{1, 2, 5}, 11));
        System.out.println(new P322CoinChange().coinChange(new int[]{1, 2, 5}, 5));
        System.out.println(new P322CoinChange().coinChange(new int[]{2}, 3));
        System.out.println(new P322CoinChange().coinChange(new int[]{2}, 2));
        System.out.println(new P322CoinChange().coinChange(new int[]{1}, 0));

    }

    public int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        if (coins == null || coins.length == 0 || amount < 0) {
            return -1;
        }

        int[] dp = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            dp[i] = -1;
        }
        int n = coins.length;
        for (int i = 1; i <= amount; i++) {
            int min = -1;
            for (int j = 0; j < n; j++) {
                if (coins[j] > i) {
                    continue;
                } else {
                    if (dp[i - coins[j]] >= 0) {
                        if (min == -1) {
                            min = dp[i - coins[j]];
                        } else {
                            min = Math.min(min, dp[i - coins[j]]);
                        }
                    }
                }
            }

            if (min != -1) {
                dp[i] = min + 1;
            }
        }

        return dp[amount];
    }
}
