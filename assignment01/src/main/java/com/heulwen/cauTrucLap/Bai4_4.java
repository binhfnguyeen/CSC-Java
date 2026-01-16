package com.heulwen.cauTrucLap;

import java.util.Scanner;

public class Bai4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Số tiền ban đầu: ");
        double tienBanDau = sc.nextDouble();
        System.out.println("Lãi suất hàng năm: ");
        double laiSuat = sc.nextDouble();

        double tienCoDuoc = tienBanDau;
        int year = 0;
        while(tienCoDuoc < 2* tienBanDau){
            year++;
            tienCoDuoc = tienCoDuoc * (1 + laiSuat/100);

            System.out.printf("Năm %d: %.2f%n", year, tienCoDuoc);
        }
    }
}
