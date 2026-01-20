package com.heulwen.thucHanh;

import java.util.Scanner;

public class Vd4 {
    private static boolean namNhuan(int n){
        return n % 400 == 0 || (n % 4 == 0 && n % 100 != 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, n;
        System.out.println("Nhập tháng: ");
        t = sc.nextInt();
        System.out.println("Nhập năm: ");
        n = sc.nextInt();
        int[] nd = { 31, namNhuan(n) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.printf("Số ngày của tháng %d năm %d là %d%n", t, n, nd[t-1]);
    }
}
