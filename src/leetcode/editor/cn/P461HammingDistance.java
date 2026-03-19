package leetcode.editor.cn;
//The Hamming distance between two integers is the number of positions at which 
//the corresponding bits are different. 
//
// Given two integers x and y, return the Hamming distance between them. 
//
// 
// Example 1: 
//
// 
//Input: x = 1, y = 4
//Output: 2
//Explanation:
//1   (0 0 0 1)
//4   (0 1 0 0)
//       ↑   ↑
//The above arrows point to positions where the corresponding bits are 
//different.
// 
//
// Example 2: 
//
// 
//Input: x = 3, y = 1
//Output: 1
// 
//
// 
// Constraints: 
//
// 
// 0 <= x, y <= 2³¹ - 1 
// 
//
// 
// Note: This question is the same as 2220: Minimum Bit Flips to Convert Number.
// 
//
// 👍 778 👎 0


public class P461HammingDistance {
    public static void main(String[] args) {
        Solution solution = new P461HammingDistance().new Solution();
        System.out.println(solution.hammingDistance(1, 4));
        System.out.println(solution.hammingDistance(3, 1));
        System.out.println(solution.hammingDistance(2, 1));
        System.out.println(solution.hammingDistance(1, 1));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int hammingDistance(int x, int y) {
            int z = x ^ y;
            int cnt = 0;
            while (z != 0) {
                if ((z & 1) == 1) {
                    cnt++;
                }
                z >>= 1;
            }
            return cnt;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}