package leetcode.editor.cn;

import java.util.HashMap;

public class P3LengthOfLongestSubstring {

    public static void main(String[] args) {
        System.out.println(new P3LengthOfLongestSubstring().lengthOfLongestSubstring("abcabcbb"));
        System.out.println(new P3LengthOfLongestSubstring().lengthOfLongestSubstring("bbbbb"));
        System.out.println(new P3LengthOfLongestSubstring().lengthOfLongestSubstring("pwwkew"));
        System.out.println(new P3LengthOfLongestSubstring().lengthOfLongestSubstring("aab"));

    }

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int n = s.length();
        if (n == 1) {
            return n;
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            HashMap<Character, Integer> charMap = new HashMap<>();
            int count = 0;
            for (int j = i; j < n; j++) {
                if (charMap.containsKey(s.charAt(j))) {
                    if (count > max) {
                        max = count;
                    }
                    i = charMap.get(s.charAt(j));
                    break;
                }
                count++;
                charMap.put(s.charAt(j), j);
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }
}
