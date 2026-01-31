package com.heulwen.ngoaiLe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai10_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double tongTien = 0.0, soNguoi = 0;
        try {
            System.out.print("Nhập tổng tiền hóa đơn: ");
            tongTien = sc.nextDouble();
        } catch (InputMismatchException e){
            System.out.println("Nhập sai kiểu dữ liệu!");
            return;
        }

        try {
            System.out.print("Nhập số người chia: ");
            soNguoi =  sc.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Nhập sai kiểu dữ liệu!");
            return;
        }

        if (soNguoi != 0) {
            System.out.println("Mỗi người cần trả: " + tongTien/soNguoi);
        } else
            throw new ArithmeticException("Lỗi chia cho 0!!");
    }
}
