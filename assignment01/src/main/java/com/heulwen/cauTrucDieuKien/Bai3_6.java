package com.heulwen.cauTrucDieuKien;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Bai3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Danh sách loại phòng");
        System.out.println("1 - Standard - 1,260,000 VNĐ");
        System.out.println("2 - Superior Garden View - 1,550,000 VNĐ");
        System.out.println("3 - Superior Ocean View - 1,830,000 VNĐ");
        System.out.println("4 - Garden View Bungalow - 1,830,000 VNĐ");
        System.out.println("5 - Pool View Bungalow - 2,120,000 VNĐ");
        System.out.println("6 - Family Room - 2,120,000 VNĐ");
        System.out.println("7 - Beach Front Bungalow - 2,540,000 VNĐ");
        System.out.println("8 - VIP sea view - 4,800,000 VNĐ");
        System.out.println();
        System.out.println("Nhập mã loại phòng (1-8): ");
        int loai = sc.nextInt();
        System.out.println("Nhập số đêm ở: ");
        int soDem = sc.nextInt();
        double soTien = 0;
        switch (loai) {
            case 1:
                if (soDem < 2){
                    soTien = 1260000;
                } else if (soDem < 4){
                    soTien = 1260000 - 1260000*0.25;
                } else
                    soTien = 1260000 - 1260000*0.3;
                break;
            case 2:
                if (soDem < 2){
                    soTien = 1550000;
                } else if (soDem < 4){
                    soTien = 1550000 - 1550000*0.25;
                } else
                    soTien = 1550000 - 1550000*0.3;
                break;
            case 3:
            case 4:
                if (soDem < 2){
                    soTien = 1830000;
                } else if (soDem < 4){
                    soTien = 1830000 - 1830000*0.25;
                } else
                    soTien = 1830000 - 1830000*0.3;
                break;
            case 5:
            case 6:
                if (soDem < 2){
                    soTien = 2120000;
                } else if (soDem < 4){
                    soTien = 2120000 - 2120000*0.25;
                } else
                    soTien = 2120000 - 2120000*0.3;
                break;
            case 7:
                if (soDem < 2){
                    soTien = 2540000;
                } else if (soDem < 4){
                    soTien = 2540000 - 2540000*0.25;
                } else
                    soTien = 2540000 - 2540000*0.3;
                break;
            case 8:
                if (soDem < 2){
                    soTien = 4800000;
                } else if (soDem < 4){
                    soTien = 4800000 - 4800000*0.25;
                } else
                    soTien = 4800000 - 4800000*0.3;
                break;
            default:
                System.out.println("Loại phòng không hợp lệ!");
        }

        DecimalFormat df = new DecimalFormat("#,###,###.00");
        System.out.println("Tổng tiền thuê phòng: " + df.format(soTien));
    }
}
