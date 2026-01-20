package com.heulwen.thucHanh;

import java.util.Arrays;

public class Vd6 {
    public static void main(String[] args) {
        int[] mc = {3, 5, 4, 1, 2}; // 3 5 4 1 2
        System.out.println("Mảng ban đầu");
        System.out.println(Arrays.toString(mc));

        mc = Arrays.copyOf(mc, mc.length+1); // 3 5 4 1 2 0
        System.out.println("Mảng sau khi tăng kích thước");
        System.out.println(Arrays.toString(mc));

        mc[mc.length-1] = 6; // 3 5 4 1 2 6
        System.out.println("Thêm phần tử 6 vào cuối mảng");
        System.out.println(Arrays.toString(mc));

        System.out.println("Chèn phần tử 7 vào vị trí chỉ số 1");
        mc = Arrays.copyOf(mc, mc.length+1); // 3 5 4 1 2 6 0
        int vt = 1;
        for (int i = mc.length-1; i > vt; i--) {
            mc[i] = mc[i-1];
        }
        mc[vt] = 7; // 3 7 5 4 1 2 6
        System.out.println(Arrays.toString(mc));

        System.out.println("Xóa phần tử 4 ở vị trí chỉ số 3");
        vt = 3;
        for (int i = vt; i < mc.length - 1; i++){
            mc[i] = mc[i+1]; // 3 7 5 1 2 6
        }
        mc = Arrays.copyOf(mc, mc.length - 1);
        System.out.println(Arrays.toString(mc));
    }
}
