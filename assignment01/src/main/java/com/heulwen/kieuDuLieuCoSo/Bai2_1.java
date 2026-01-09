package com.heulwen.kieuDuLieuCoSo;

import java.util.Scanner;

public class Bai2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a weight: ");
        int weight = sc.nextInt();
        System.out.print("Enter a height: ");
        double height = sc.nextDouble();

        double bmi =  weight / (height * height);
        System.out.println("BMI is " + bmi);
    }
}
