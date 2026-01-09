package com.heulwen.cauTrucDieuKien;

import java.util.Scanner;

public class Bai3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mật khẩu: ");
        String password = sc.nextLine();

        if (password.length() < 8) {
            System.out.println("Mật khẩu yếu!");
            return;
        }
        int hoa = 0, thuong = 0, so = 0, dbiet = 0;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                hoa++;
            } else if (Character.isLowerCase(c)) {
                thuong++;
            } else if (Character.isDigit(c)) {
                so++;
            } else
                dbiet++;
        }

        if (hoa < 1 || thuong < 1 || so < 1 || dbiet < 1) {
            System.out.println("Mật khẩu yếu!");
            return;
        }

        System.out.println("Mật khẩu mạnh!!");
    }
}
