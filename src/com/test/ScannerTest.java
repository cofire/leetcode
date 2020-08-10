package com.test;

import java.util.Scanner;

/**
 * @Description
 * @ClassName ScannerTest
 * @Author Ly
 * @date 2020.07.30 21:35
 */
public class ScannerTest {
    public static void main(String[] args) {
        demo1();
    }

    public static void demo1() {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println("str>>>:" + str);
        String str2 = in.next();
        System.out.println("str2>>>:" + str2);
    }

    public static void demo2() {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            System.out.println(">>>:" + in.next());
        }
    }

    public static void demo3() {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            System.out.println(">>>:" + in.nextLine());
        }
    }

    public static void demo4() {
        StringBuilder stringbuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String text = scanner.nextLine().trim();
            if ("".equals(text)) {
                break;
            }
            stringbuilder.append(text);
        }

        System.out.println(stringbuilder.toString());
    }

    public static void inputIntInLine() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] numstr = str.split(" ");
        int[] nums = new int[numstr.length];
        for (int i = 0; i < numstr.length; i++) {
            nums[i] = Integer.parseInt(numstr[i]);
        }
        for (int n : nums) {
            System.out.println(n);
        }
        System.out.println("end of input int in a line");
    }


}
