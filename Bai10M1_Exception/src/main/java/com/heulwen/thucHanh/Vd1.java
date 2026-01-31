package com.heulwen.thucHanh;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Vd1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;

        try {
            System.out.print("Nhập số a: ");
            a = sc.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Bị lỗi: Thông tin nhập không hợp kiểu");
            return;
        } catch (Exception e){ // Catch cuối cùng để hứng hết lỗi
            System.out.println("Bị lỗi: " + e.getMessage());
        } finally {
            System.out.println("Dòng lệnh lúc nào cũng chạy");
        }

        sc.nextLine();

        try {
            System.out.print("Nhập số b: ");
            b = sc.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Bị lỗi: Thông tin nhập không hợp kiểu");
            return;
        } catch (Exception e){
            System.out.println("Bị lỗi: " + e.getMessage());
        } finally {
            System.out.println("Dòng lệnh lúc nào cũng chạy");
        }

        double kq = 0;
        if (b != 0) {
            kq = (double) a / b;
            System.out.println("Kết quả a/b = " + kq);
        } else {
            System.out.println("Vui lòng nhập số b khác 0");
        }
    }
}
