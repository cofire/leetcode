package com.test;

import java.util.Scanner;

/**
 * @Description
 * @ClassName Test4
 * @Author Ly
 * @date 2020.07.31 10:24
 */
public class Test4 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String[] nums = scanner.nextLine().split(" ");
        int negativeNum = 0;
        int positiveNum = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = Integer.parseInt(nums[i]);
            if (num < 0) {
                negativeNum++;
            } else {
                sum += num;
                positiveNum++;
            }
        }
        System.out.println(negativeNum);
        System.out.println(Math.round(sum * 10.0 / positiveNum) / 10.0);
    }
}
