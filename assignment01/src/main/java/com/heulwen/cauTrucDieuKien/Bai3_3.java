package com.heulwen.cauTrucDieuKien;

import java.util.Scanner;

public class Bai3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số điện thoại: ");
        String sdt = sc.nextLine();

        if (sdt.length() < 10){
            System.out.println("Định dạng số điện thoại không hợp lệ!");
            return;
        }

        StringBuilder sb = new StringBuilder(sdt);
        sb.insert(3, '-');
        sb.insert(7, '-');
        System.out.println("Số điện thoại chuẩn hóa: " + sb);
    }
}
