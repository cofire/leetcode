package leetcode.editor.cn;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class P139WordBreak {
    public static void main(String[] args) {
        System.out.println(new P139WordBreak().wordBreak("leetcode", Arrays.asList("leet", "code")));
        System.out.println(new P139WordBreak().wordBreak("applepenapple", Arrays.asList("apple", "pen")));
        System.out.println(new P139WordBreak().wordBreak("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat")));
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        if (s == null || s.length() == 0) {
            return true;
        }
        int n = s.length();
        HashSet<String> wordSet = new HashSet<>(wordDict);
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}
