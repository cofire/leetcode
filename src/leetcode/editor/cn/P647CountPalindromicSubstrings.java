package leetcode.editor.cn;

public class P647CountPalindromicSubstrings {
    public static void main(String[] args) {
        System.out.println(new P647CountPalindromicSubstrings().countSubstrings("abc"));
        System.out.println(new P647CountPalindromicSubstrings().countSubstrings("aaa"));
        System.out.println(new P647CountPalindromicSubstrings().countSubstrings("aa"));
        System.out.println(new P647CountPalindromicSubstrings().countSubstrings("a"));
        System.out.println(new P647CountPalindromicSubstrings().countSubstrings("ab"));

    }

    public boolean isPalindromic(String s, int left, int right) {
        int n = s.length();
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public int countSubstrings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int n = s.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isPalindromic(s, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }
}
