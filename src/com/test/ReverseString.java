package com.test;

import java.util.Scanner;

/**
 * @Description
 * @ClassName ReverseString
 * @Author Ly
 * @date 2020.07.31 10:11
 */
public class ReverseString {
    public static String getReverseString(String in) {
        if (in == null || in.length() < 2) {
            return in;
        }
        int begin = 0;
        int end = in.length() - 1;
        char[] inList = in.toCharArray();
        while (begin < end) {
            char tmp = inList[begin];
            inList[begin] = inList[end];
            inList[end] = tmp;
            begin++;
            end--;
        }
        return new String(inList);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inStr = in.nextLine();
        System.out.println(getReverseString(inStr));
    }
}
