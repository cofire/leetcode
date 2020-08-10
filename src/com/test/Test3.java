package com.test;

import java.util.Scanner;

/**
 * @Description
 * @ClassName Test3
 * @Author Ly
 * @date 2020.07.31 09:39
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int min = a > b ? b : a;
        int max = a > b ? a : b;
        if (min == 0 || max == 0) {
            System.out.println(0);
            return;
        }
        int yu = max % min;
        while (yu != 0) {
            max = min;
            min = yu;
            yu = max % min;
        }
//        System.out.println("最大公约数：" + min);
//        System.out.println("最小公倍数：" + a * b / min);
        System.out.println(a * b / min);
    }
}
