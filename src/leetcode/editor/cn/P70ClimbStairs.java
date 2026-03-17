package leetcode.editor.cn;

public class P70ClimbStairs {
    public static void main(String[] args) {
        P70ClimbStairs p70ClimbStairs = new P70ClimbStairs();
        System.out.println(p70ClimbStairs.climbStairs(1));
        System.out.println(p70ClimbStairs.climbStairs(2));
        System.out.println(p70ClimbStairs.climbStairs(3));
        System.out.println(p70ClimbStairs.climbStairs(4));
    }

    public int climbStairs(int n) {
        if (n < 0) {
            return 0;
        }
//        int[] dp = new int[n + 1];
//        dp[0] = 1;
//        dp[1] = 1;
//        for (int i = 2; i <= n; i++) {
//            dp[i] = dp[i - 1] + dp[i - 2];
//        }
//        return dp[n];
        int pp = 1, p = 1;
        for (int i = 2; i <= n; i++) {
            int cur = pp + p;
            pp = p;
            p = cur;
        }
        return p;
    }
}
