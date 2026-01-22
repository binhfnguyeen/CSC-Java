package com.heulwen.Ham;

import java.util.Scanner;

public class Bai6_2 {
    static double tinhBMI(int kg, int height){
        return (double) kg / (height * height);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cân nặng:");
        int kg = sc.nextInt();
        System.out.println("Nhập chiều cao:");
        int height = sc.nextInt();

        if (tinhBMI(kg, height) < 18.5) {
            System.out.println("Thiếu cân");
        } else if (tinhBMI(kg, height) >= 18.5 && tinhBMI(kg, height) <= 22.9) {
            System.out.println("Bình thường");
        } else if (tinhBMI(kg, height) >= 23 && tinhBMI(kg, height) <= 24.9) {
            System.out.println("Thừa cân");
        } else {
            System.out.println("Béo phì");
        }
    }
}
