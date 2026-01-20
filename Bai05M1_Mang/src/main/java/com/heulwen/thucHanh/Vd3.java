package com.heulwen.thucHanh;

import java.util.Scanner;

public class Vd3 {
    public static void main(String[] args) {
        String[] ns = {"khong", "mot", "hai", "ba", "bon", "nam", "sau", "bay", "tam", "chin"};
        System.out.println("Xuất mảng chuỗi theo chỉ số");
        for (int i = 0; i < ns.length; i++) {
            System.out.printf("%s ", ns[i]);
        }
        System.out.println();
        System.out.println("Xuất mảng chuỗi theo phần tử");
        for (String s: ns){
            System.out.printf("%s ", s);
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một số từ (0-9): ");
        int so = sc.nextInt();
        System.out.println("Chữ số là: " + ns[so]);
    }
}
