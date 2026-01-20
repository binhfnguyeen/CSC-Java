package com.heulwen.thucHanh;

import java.util.Random;

public class Vd5 {
    public static void main(String[] args) {
        /*
            int[][] a;
            a = new int[2][2];
            a[0][0] = 1;
            a[0][1] = 2;
            a[1][0] = 3;
            a[1][1] = 4;
         */
        /*
            int[][] a = {{1, 2}, {3, 4}};
            System.out.printf("%d %d%n", a[0][0], a[0][1]);
            System.out.printf("%d %d%n", a[1][0], a[1][1]);
         */

        int[][] a;
        a = new int[4][5];

        Random rd = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
//                a[i][j] = rd.nextInt(21); // 0 -> 20
                a[i][j] = rd.nextInt(41) - 20;
            }
        }

        System.out.println("Xuất mảng hai chiều theo chỉ số");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%3d ", a[i][j]);
            }
            System.out.println();
        }

        System.out.println("Xuất mảng theo phần tử");
        for (int[] mc: a){
            for (int x: mc){
                System.out.printf("%3d ", x);
            }
            System.out.println();
        }
    }
}
