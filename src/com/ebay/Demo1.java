package com.ebay;

import java.util.Stack;

/**
 * @Description
 * @ClassName Demo1
 * @Author Ly
 * @date 2020.08.07 14:07
 */
public class Demo1 {
    // 打印 调试时用
    public static void printStack(Stack s) {

    }

    public static void sort(Stack<Integer> stackA) {
        Stack<Integer> stackB = new Stack<Integer>();
        while (!stackA.empty()) {
            int tmpA = stackA.pop();
//            B栈为空时，直接压入
            if (stackB.empty()) {
                stackB.push(tmpA);
                continue;
            }
            int tmpB = stackB.pop();
//            A>=B时直接压入
            if (tmpA >= tmpB) {
                stackB.push(tmpB);
                stackB.push(tmpA);
                continue;
            }
            while (tmpA < tmpB && (!stackB.isEmpty())) {
                stackA.push(tmpB);
                tmpB = stackB.pop();
                if (tmpA >= tmpB) {
                    stackB.push(tmpB);
                    stackB.push(tmpA);
                    continue;
                } else {
                    stackA.push(tmpB);
                    stackA.push(tmpA);
                    continue;
                }
            }

        }
//        将排好序的转到stackA
        while (!stackB.isEmpty()) {
            stackA.push(stackB.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stackA = new Stack<Integer>();
        stackA.push(4);
        stackA.push(5);
        stackA.push(1);
        stackA.push(3);
        stackA.push(2);
        sort(stackA);
    }
}
