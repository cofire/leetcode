package com.cj;

import java.util.Scanner;

/**
 * @Description
 * @ClassName StingArrSwap
 * @Author Ly
 * @date 2020.08.06 21:44
 */
public class StingArrSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        if (A.length() != B.length()) {
            System.out.println("False");
            return;
        }
        if (A.isEmpty() && B.isEmpty()) {
            System.out.println("True");
            return;
        }
        int length = A.length();
        String tmp = A;
        for (int i = 0; i < length - 1; i++) {
            tmp = tmp.substring(1) + tmp.charAt(0);
            if (B.equals(tmp)) {
                System.out.println("True");
                return;
            }
        }
        System.out.println("False");
        return;
    }
}
