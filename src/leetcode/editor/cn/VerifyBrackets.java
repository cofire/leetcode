package leetcode.editor.cn;

import java.util.Stack;

/**
 * @Description
 * @ClassName VerifyBrackets
 * @Author Ly
 * @date 2020.08.05 20:43
 */
public class VerifyBrackets {
    public static Boolean isValidBrackets(String brackets) {
        if (brackets.isEmpty()) {
            return true;
        }
        Stack<Character> stack = new Stack();
        for (int i = 0; i < brackets.length(); i++) {
            Character bracket = brackets.charAt(i);

            if (stack.isEmpty()) {
                stack.push(bracket);
                continue;
            }
            Character tmp = stack.pop();
            if (tmp == '(' && bracket == ')') {
                continue;
            } else {
                stack.push(tmp);
                stack.push(bracket);
            }

        }
        return stack.empty();
    }

    public static String generateValidBrackets(String brackets) {
        if (brackets.isEmpty()) {
            return "";
        }
        Stack<BracketNode> stack = new Stack();
        for (int i = 0; i < brackets.length(); i++) {
            Character bracket = brackets.charAt(i);
            if (stack.isEmpty()) {
                BracketNode node = new BracketNode(bracket, i);
                stack.push(node);
                continue;
            }
            BracketNode tmp = stack.pop();
            if (tmp.type == '(' && bracket == ')') {
                continue;
            } else {
                stack.push(tmp);
                BracketNode node = new BracketNode(bracket, i);
                stack.push(node);
            }

        }
        if (stack.isEmpty()) {
            return brackets;
        }
        StringBuilder sbBrackets = new StringBuilder(brackets);
        while (!stack.isEmpty()) {
            BracketNode tmp = stack.pop();
            if (tmp.type == '(') {
                sbBrackets.insert(tmp.index + 1, ")");
            } else {
                sbBrackets.insert(tmp.index - 1, "(");
            }
        }
        return sbBrackets.toString();
    }


    public static void main(String[] args) {
        System.out.println(generateValidBrackets("(()()"));
    }
}

class BracketNode {
    int index;
    Character type;

    BracketNode() {

    }

    BracketNode(Character type, int index) {
        this.index = index;
        this.type = type;
    }
}
