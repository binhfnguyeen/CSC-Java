package com.heulwen.cauTrucDieuKien;

import java.util.Scanner;

public class Bai3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[] {1, 3, 5, 7, 8, 10, 12};
        int[] arr2 = new int[] {4, 6, 9, 11};

        System.out.println("Nhập tháng: ");
        int thang = sc.nextInt();
        System.out.println("Nhập năm: ");
        int nam = sc.nextInt();

        int ngay = 0;

        if (thang == 2){
            if ((nam % 4 == 0 && nam % 100 != 0) || nam % 400 == 0){
                ngay = 28;
            } else {
                ngay = 29;
            }
            System.out.println("Tháng " + thang + " năm " + nam + " có " + ngay + " ngày!");
        }

        for (int i = 0; i < arr1.length; i++) {
            if (thang == arr1[i]) {
                ngay = 31;
                System.out.println("Tháng " + thang + " năm " + nam + " có " + ngay + " ngày!");
                return;
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            if (thang == arr2[i]) {
                ngay = 30;
                System.out.println("Tháng " + thang + " năm " + nam + " có " + ngay + " ngày!");
                return;
            }
        }
    }
}
