package com.heulwen.mang;

import java.util.Arrays;
import java.util.Scanner;

public class Bai5_1 {
    private static void hienThiDanhSach(String[] danhSach){
        for (String pt : danhSach) {
            System.out.printf("- %s%n", pt);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] danhSach = {"Bạc Xỉu Đá", "Freeze Trà Xanh", "Trà Thạch Vải", "Trà Thanh Đào", "Cappuccino", "Cà Phê Sữa Đá"};
        String tenThucUong;
        boolean themNuoc = true;
        while (true){
            hienThiDanhSach(danhSach);
            System.out.println("Nhập tên thức uống");
            tenThucUong = sc.nextLine();

            for (int i=0;i<danhSach.length;i++){
                if (tenThucUong.equalsIgnoreCase(danhSach[i])){
                    System.out.printf("Đã tìm thấy thức uống: %s%n", danhSach[i]);
                    themNuoc = false;
                    break;
                }
            }

            if (themNuoc){
                System.out.printf("Không tìm thấy '%s' trong danh sách%n", tenThucUong);
                System.out.printf("Thêm '%s' vào danh sách: (y/n)%n", tenThucUong);
                char choice = sc.nextLine().charAt(0);

                if (Character.toLowerCase(choice) == 'y'){
                    danhSach = Arrays.copyOf(danhSach, danhSach.length+1);
                    danhSach[danhSach.length - 1] = tenThucUong;
                    System.out.printf("Thêm thức uống '%s' vào danh sách thành công", tenThucUong);
                    hienThiDanhSach(danhSach);
                } else {
                    System.out.println("Kết thúc chọn thức uống");
                    break;
                }
            } else {
                break;
            }
        }
    }
}
