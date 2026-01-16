package com.heulwen.cauTrucLap;

import java.util.Scanner;

public class Bai4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Sữa tươi (7.000 đ/sp)");
        System.out.println("2. Bánh ngọt (10.000 đ/ cái)");
        System.out.println("3. Nước ngọt (10.000 đ/chai)");
        System.out.println("4. Bánh mặn (15.000 đ/cái)");
        System.out.println("5. Trái cây (20.000 đ/hộp)");
        System.out.println("0. Thoát chương trình!");

        int choice;
        int soSuaTuoi = 0, soBanhNgot = 0, soNuocNgot = 0, soBanhMan = 0, soTraiCay = 0;
        double thanhTienSuaTuoi = 0, thanhTienBanhNgot = 0, thanhTienNuocNgot = 0, thanhTienBanhMan = 0, thanhTienTraiCay = 0;
        do {
            System.out.println("Chọn mã sản phẩm (1-5) hoặc 0 để kết thúc mua hàng:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhập số lượng sữa tươi");
                    int sl1 = sc.nextInt();
                    soSuaTuoi += sl1;
                    thanhTienSuaTuoi += sl1*7000;
                    break;
                case 2:
                    System.out.println("Nhập số lượng bánh ngọt");
                    int sl2 = sc.nextInt();
                    soBanhNgot += sl2;
                    thanhTienBanhNgot += sl2*10000;
                    break;
                case 3:
                    System.out.println("Nhập số lượng nước ngọt");
                    int sl3 = sc.nextInt();
                    soNuocNgot += sl3;
                    thanhTienNuocNgot += sl3*10000;
                    break;
                case 4:
                    System.out.println("Nhập số lượng bánh mặn");
                    int sl4 = sc.nextInt();
                    soBanhMan += sl4;
                    thanhTienBanhMan += soBanhMan*15000;
                    break;
                case 5:
                    System.out.println("Nhập số lượng trái cây");
                    int sl5 = sc.nextInt();
                    soTraiCay += sl5;
                    thanhTienTraiCay += sl5*20000;
                    break;
                case 0:
                    System.out.println("Kết thúc mua hàng!");
                    break;
                default:
                    System.out.println("Mã sản phẩm không hợp lệ!");
            }
        } while (choice != 0);

        System.out.println("Thông tin giỏ hàng: ");
        if (soSuaTuoi != 0){
            System.out.printf("Sữa tươi: %d hộp, Thành tiền: %.2f VND%n", soSuaTuoi, thanhTienSuaTuoi);
        }
        if (soBanhNgot != 0){
            System.out.printf("Bánh ngọt: %d cái, Thành tiền: %.2f VND%n", soBanhNgot, thanhTienBanhNgot);
        }
        if (soNuocNgot != 0){
            System.out.printf("Nước ngọt: %d chai, Thành tiền: %.2f VND%n", soNuocNgot, thanhTienNuocNgot);
        }
        if (soBanhMan != 0){
            System.out.printf("Bánh mặn: %d cái, Thành tiền: %.2f VND%n", soBanhMan, thanhTienBanhMan);
        }
        if (soTraiCay != 0){
            System.out.printf("Trái cây: %d trái, Thành tiền: %.2f VND%n", soTraiCay, thanhTienTraiCay);
        }
    }
}
