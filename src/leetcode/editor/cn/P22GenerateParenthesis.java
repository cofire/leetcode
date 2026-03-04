package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class P22GenerateParenthesis {
    public static void main(String[] args) {
        System.out.println(new P22GenerateParenthesis().generateParenthesis(1));
        System.out.println(new P22GenerateParenthesis().generateParenthesis(2));
        System.out.println(new P22GenerateParenthesis().generateParenthesis(3));
        System.out.println(new P22GenerateParenthesis().generateParenthesis(4));
    }

    public List<String> generateParenthesis(int n) {
        if (n <= 0) {
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        generateParenthesis(result, n, 0, 0, "");
        return result;
    }

    public void generateParenthesis(List<String> result, int n, int left, int right, String prefix) {
        if (left > n || right > n) {
            return;
        }

        if (left == right && left == n) {
            result.add(prefix);
            return;
        }
        if (left == right && left < n) {
            generateParenthesis(result, n, left + 1, right, prefix + "(");
        }

        if (left > right) {
            if (left < n) {
                generateParenthesis(result, n, left + 1, right, prefix + "(");
                generateParenthesis(result, n, left, right + 1, prefix + ")");
            } else {
                generateParenthesis(result, n, left, right + 1, prefix + ")");
            }
        }
    }
}
