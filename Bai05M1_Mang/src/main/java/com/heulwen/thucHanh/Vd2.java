package com.heulwen.thucHanh;

import java.util.Arrays;
import java.util.Scanner;

public class Vd2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a;
        int spt;

        System.out.println("Nhập số phần tử mảng a: ");
        spt = sc.nextInt();
        a = new int[spt];

        System.out.println("Nhập giá trị cho từng phần tử mảng a");
        for (int i = 0; i < a.length; i++){
            System.out.printf("Nhập phần tử a[%d]: ", i);
            a[i] = sc.nextInt();
        }

        System.out.println("Giá trị các phần tử mảng a đã nhập là");
        System.out.println(Arrays.toString(a));
    }
}
