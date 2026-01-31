package com.heulwen.thucHanh;

public class Vd2 {
    private static void chiaSo(int a, int b) throws ArithmeticException{
        if (b==0)
            throw new ArithmeticException("Không được chia cho 0");
        else
            System.out.println("Kết quả: " + a/b);
    }
    public static void main(String[] args) {
        try {
            chiaSo(2, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
