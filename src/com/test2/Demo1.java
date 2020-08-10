package com.test2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Description
 * @ClassName Demo1
 * @Author Ly
 * @date 2020.07.31 14:46
 */
public class Demo1 {
    public static int deal(int[] xn) {
        if (xn.length == 0) {
            return 0;
        } else if (xn.length == 1) {
            return xn[0];
        } else if (xn.length == 2) {
            if (xn[0] > xn[1]) {
                return xn[0];
            } else {
                return xn[1];
            }
        } else {
            int z = xn[0];
            int y = xn[1];
            int x = xn[2];
            int val = 0;
            if (x == y && y == z) {
                val = 0;
            } else if (x == y && y != z) {
                val = z - y;
            } else if (x != y && y == z) {
                val = y - x;
            } else if (x != y && y != z) {
                val = Math.abs((z - y) - (y - x));
            }
            if (val == 0) {
                int[] tmp = Arrays.copyOfRange(xn, 3, xn.length);
                sort(tmp);
                return deal(tmp);
            } else {
                xn[2] = val;
                int[] tmp = Arrays.copyOfRange(xn, 2, xn.length);
                sort(tmp);
                return deal(tmp);
            }
        }
    }

    public static void sort(int[] xn) {
        for (int i = 0; i < xn.length; i++) {
            for (int j = i + 1; j < xn.length; j++) {
                if (xn[i] < xn[j]) {
                    int tmp = xn[i];
                    xn[i] = xn[j];
                    xn[j] = tmp;
                }
            }
        }
    }

    public static void print(int[] xn) {
        for (int i = 0; i < xn.length; i++) {
            System.out.println(xn[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] xn = new int[n];
        for (int i = 0; i < n; i++) {
            xn[i] = sc.nextInt();
        }
        sort(xn);
        int result = deal(xn);
        System.out.println(result);
        int x = 10;
        System.out.println(Integer.toOctalString(10));
    }
}
