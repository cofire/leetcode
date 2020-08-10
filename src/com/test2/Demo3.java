package com.test2;

import java.util.Scanner;

/**
 * @Description
 * @ClassName Demo3
 * @Author Ly
 * @date 2020.07.31 16:41
 */
public class Demo3 {
    public static void setArr(int a[], int index, int n) {
        for (int i = index; i < index + n; i++) {
            a[i] = 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];
        int size = sc.nextInt();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String text = scanner.nextLine().trim();
            if ("".equals(text)) {
                break;
            }
            String[] numTmp = text.split(" ");
            int index = Integer.valueOf(numTmp[0]);
            int value = Integer.valueOf(numTmp[1]);
            setArr(a, index, value);
        }
        for (int i = 0; i < a.length - size; i++) {
            if (a[i] == 1) {
                continue;
            }
            int count = 0;
            for (int j = i; j < a.length; j++) {
                if (a[j] == 0) {
                    count++;
                    if (count == size) {
                        System.out.println(i);
                        return;
                    }
                } else {
                    break;
                }
            }
        }
        System.out.println(-1);
        return;
    }
}
