package com.test2;

import java.util.Scanner;

/**
 * @Description
 * @ClassName Demo2
 * @Author Ly
 * @date 2020.07.31 15:45
 */
public class Demo2 {
    public static int getFalse(int show) {
        String toStr = String.valueOf(show);
        //        位数
        int ns = toStr.length();
        //        商
        int shang = (int) (show / Math.pow(10, ns - 1));
        int yu = (int) (show % Math.pow(10, ns - 1));
        int sum = 0;
        if (shang > 4) {
            sum += (shang - 1) * calN(ns - 1);
            sum += Math.pow(10, ns - 1);
            if (yu > 4) {
                sum += getFalse(yu);
            }
        } else {
            sum += shang * calN(ns - 1);
            if (yu > 4) {
                sum += getFalse(yu);
            }
        }
        return sum;
    }

    public static double calN(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return calN(n - 1) * 9 + Math.pow(10, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            System.out.println(num - getFalse(num));
        }
    }
}
