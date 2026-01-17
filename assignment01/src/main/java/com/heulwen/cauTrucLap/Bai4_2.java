package com.heulwen.cauTrucLap;

import java.util.Scanner;

public class Bai4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra: ");
        int x = sc.nextInt();

        if (x < 2) {
            System.out.printf("Số %d không là số nguyên tố%n", x);
            return;
        }

        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x%i==0){
                System.out.printf("Số %d không là số nguyên tố%n", x);
                return;
            }
        }

        System.out.println("Là số nguyên tố");
    }
}
