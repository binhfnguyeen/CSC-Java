package com.heulwen.cauTrucLap;

import java.util.Scanner;

public class Bai4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số bắt đầu: ");
        int n = sc.nextInt();
        System.out.println("Nhập số kết thúc: ");
        int m = sc.nextInt();

        for (int i = n; i<= m; i++){
            for (int j = 1; j <= 10; j++){
                System.out.println(i + " x " + j + " = " + i*j);
            }
            System.out.println();
        }
    }
}
