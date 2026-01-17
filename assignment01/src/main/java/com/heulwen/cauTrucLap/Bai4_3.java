package com.heulwen.cauTrucLap;

import java.util.Scanner;

public class Bai4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, m = 0;
        do {
            do {
                System.out.println("Nhập số bắt đầu: ");
                n = sc.nextInt();
                if (n < 2 || n > 9)
                    System.out.println("Vui lòng nhập bảng cửu chương từ 2 đến 9");
            } while (n < 2 || n > 9);
            do {
                System.out.println("Nhập số kết thúc: ");
                m = sc.nextInt();
                if (m < 2 || m > 9)
                    System.out.println("Vui lòng nhập bảng cửu chương từ 2 đến 9");
            } while (m < 2 || m > 9);
        } while (n > m);

        for (int i = n; i<= m; i++){
            for (int j = 1; j <= 10; j++){
                System.out.printf("%2d x %2d = %2d%n", i, j, (i*j));
            }
            System.out.println();
        }
    }
}
