package com.heulwen.kieuDuLieuCoSo;

import java.util.Scanner;

public class Bai2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền muốn đổi: ");
        int tienDoi = sc.nextInt();

        int to500k = tienDoi / 500000;
        int du1 = tienDoi % 500000;
        int to200k = du1 / 200000;
        int du2 = du1 % 200000;
        int to100k = du2 / 100000;
        int du3 = du2 % 100000;
        int to50k = du3 / 50000;
        int du4 = du3 % 50000;

        System.out.println("Số tờ mệnh giá 500k: " + to500k);
        System.out.println("Số tờ mệnh giá 200k: " + to200k);
        System.out.println("Số tờ mệnh giá 100k: " + to100k);
        System.out.println("Số tờ mệnh giá 50k: " + to50k);
        System.out.println("Số tiền còn dư: " + du4);
    }
}
