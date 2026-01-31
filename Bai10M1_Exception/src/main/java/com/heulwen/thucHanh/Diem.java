package com.heulwen.thucHanh;

import com.heulwen.thucHanh.exception.DiemKhongHopLeException;

import java.util.Scanner;

public class Diem {
    public static void nhapDiem(double diem) throws DiemKhongHopLeException {
        if (diem < 0 || diem > 10){
            throw new DiemKhongHopLeException("Điểm không hợp lệ! Điểm phải nằm trong khoảng từ 0 đến 10.");
        }
        System.out.println("Điểm hợp lệ: " + diem);
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập điểm: ");
            double diem = sc.nextDouble();
            nhapDiem(diem);
        } catch (DiemKhongHopLeException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
