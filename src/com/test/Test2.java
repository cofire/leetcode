package com.test;

import java.util.Scanner;

/**
 * @Description
 * @ClassName Test2
 * @Author Ly
 * @date 2020.07.30 21:52
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = in.nextInt();
        System.out.println("sum=" + sum);
        int num = in.nextInt();
        System.out.println("num=" + num);
        if (sum == 0 || num == 0 || sum < num) {
            System.out.println(-1);
            return;
        }
        if (num % 2 == 1) {
            if (num * (sum / num) != sum) {
                System.out.println(-1);
                return;
            }
            int mid = sum / num;
            for (int i = (0 - num / 2); i <= (num / 2); i++) {
                System.out.print(mid + i + " ");
            }
        }
        if (num % 2 == 0) {
            if (num * ((sum + num / 2) / num) != sum + num / 2) {
                System.out.println(-1);
                return;
            }
            int mid = (sum + num / 2) / num;
            for (int i = (0 - num / 2); i < (num / 2); i++) {
                System.out.print(mid + i + " ");
            }
        }
    }
}
