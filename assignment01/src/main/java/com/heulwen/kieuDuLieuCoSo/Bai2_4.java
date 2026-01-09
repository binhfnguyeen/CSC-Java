package com.heulwen.kieuDuLieuCoSo;

import java.util.Scanner;

public class Bai2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        System.out.println("Đảo ngược: " + sb.reverse());
        StringBuilder sb2 = new StringBuilder(str);
        System.out.println("Chèn * sau chuỗi: " + sb2.append('*'));
        StringBuilder sb3 = new StringBuilder(str);
        System.out.println("Xóa khoảng trắng: " + sb3.toString().replaceAll("\\s+", ""));
    }
}
