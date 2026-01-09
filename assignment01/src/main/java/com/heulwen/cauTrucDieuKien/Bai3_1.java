package com.heulwen.cauTrucDieuKien;

import java.util.Scanner;

public class Bai3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập năm: ");
        int nam = sc.nextInt();

        if ((nam % 4 == 0 && nam % 100 != 0 ) || nam % 400 == 0 ) {
            System.out.println("Năm " + nam + " là năm nhuận");
            return;
        }

        System.out.println("Năm " + nam + " không nhuận");
    }
}
