package com.heulwen.cauTrucLap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Bai4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int so1 = 0, so2 = 0, so3 = 0;
        int tongTien = 0;
        do {
            System.out.println("1. Vé người lớn - 100,000 VND");
            System.out.println("2. Vé trẻ em - 50,000 VND");
            System.out.println("3. Vé sinh viên - 70,000 VND");
            System.out.println("0. Thoát chương trình!");
            System.out.println("Chọn loại vé");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Số lượng");
                    int soLuong1 = sc.nextInt();
                    so1 += soLuong1;
                    tongTien += 100000*soLuong1;
                    break;
                case 2:
                    System.out.println("Số lượng");
                    int soLuong2 = sc.nextInt();
                    so2 += soLuong2;
                    tongTien += 50000*soLuong2;
                    break;
                case 3:
                    System.out.println("Số lượng");
                    int soLuong3 = sc.nextInt();
                    so3 += soLuong3;
                    tongTien += 70000*soLuong3;
                    break;
                case 0:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);

        System.out.printf("Vé người lớn: %d, Vé trẻ em: %d, Vé sinh viên: %d%n", so1, so2, so3);
        DecimalFormat df = new DecimalFormat("#,###.00");
        System.out.println("Tổng tiền: " + df.format(tongTien));
    }
}
