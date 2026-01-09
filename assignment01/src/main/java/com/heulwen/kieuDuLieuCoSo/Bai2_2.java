package com.heulwen.kieuDuLieuCoSo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Bai2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");
        System.out.println("Nhập lãi suất năm (%): ");
        float laiSuat = sc.nextFloat();
        System.out.println("Nhập số tiền gửi: ");
        int tienGui = sc.nextInt();
        System.out.println("Nhập số tháng gửi: ");
        int soThang = sc.nextInt();

        float tienLai = ( tienGui * soThang ) * ( laiSuat / 100 / 12);
        float tongSoTien = tienGui + tienLai;
        System.out.println("Tiền lãi: " + df.format(tienLai));
        System.out.println("Tổng số tiền nhận được: " + df.format(tongSoTien));
    }
}
