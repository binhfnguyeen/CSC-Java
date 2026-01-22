package com.heulwen.Ham;

import java.util.Scanner;

public class Bai6_1 {
    private static boolean checkDate(String chuoi){
        String nam = chuoi.substring(chuoi.lastIndexOf('/') + 1);
        String thang = chuoi.substring(chuoi.indexOf("/") + 1, chuoi.lastIndexOf("/"));
        String ngay = chuoi.substring(0, chuoi.indexOf("/"));

        int year = Integer.parseInt(nam);
        int month = Integer.parseInt(thang);
        int day = Integer.parseInt(ngay);

        boolean isLeapYear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        int dayOfFeb = isLeapYear ? 29 : 28;

        int[] nd = {31, dayOfFeb, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (nam.length() != 4) {
            return false;
        }

        if (month < 1 || month > 12) {
            return false;
        }

        return day >= 1 && day <= nd[month - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ngày theo định dạng dd/MM/yyyy: ");
        String date = sc.nextLine();

        if (checkDate(date)) {
            System.out.println("Ngày hợp lệ");
        } else {
            System.out.println("Ngày không hợp lệ");
        }
    }
}
