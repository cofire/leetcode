package com.ebay;

import java.util.Stack;

/**
 * @Description
 * @ClassName Demo2
 * @Author Ly
 * @date 2020.08.07 14:59
 */
public class Demo2 {

    public static int getStackLast(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return -1;
        }
        int tmp = stack.pop();
        if (stack.isEmpty()) {
            return tmp;
        }
        int last = getStackLast(stack);
        stack.push(tmp);
        return last;
    }

    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int last = getStackLast(stack);
        reverseStack(stack);
        stack.push(last);
    }


    public static void main(String[] args) {
        Stack<Integer> stackA = new Stack<Integer>();
        stackA.push(4);
        stackA.push(5);
        stackA.push(1);
        stackA.push(3);
        stackA.push(2);
        reverseStack(stackA);
        System.out.println(stackA);
    }
}
