package com.test;

import java.util.Scanner;

/**
 * @Description
 * @ClassName CubeRoot
 * @Author Ly
 * @date 2020.07.31 09:55
 */
public class CubeRoot {
    public static double getCubeRoot(double input) {
        double min = 0;
        double max = input;
        double mid = 0;
        while (max - min > 0.001) {
            mid = (max + min) / 2;
            if (mid * mid * mid > input) {
                max = mid;
            } else if (mid * mid * mid < input) {
                min = mid;
            } else {
                return mid;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double input = in.nextDouble();
        System.out.printf("%.1f\n", getCubeRoot(input));
    }
}
