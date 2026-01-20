package com.heulwen.mang;

import java.util.Arrays;
import java.util.Scanner;

public class Bai5_2 {
    private static void inBangDiem(float[][] bangDiem){
        for (int i = 0; i < bangDiem.length; i++) {
            System.out.printf("Điểm của SV %d: ", i+1);
            for (int j = 0; j < bangDiem[i].length; j++) {
                System.out.printf("%.1f ", bangDiem[i][j]);
            }
            System.out.println();
        }
    }

    private static float tinhDiemTrungBinh(float[] diem){
        float tb = 0;
        for (int i = 0; i < diem.length; i++) {
            tb += diem[i];
        }
        return tb/diem.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
            float[][] bangDiem = new float[0][0];

            bangDiem = Arrays.copyOf(bangDiem, bangDiem.length+1);
            bangDiem[bangDiem.length-1] = new float[] {6, 7, 8, 9};

            bangDiem = Arrays.copyOf(bangDiem, bangDiem.length+1);
            bangDiem[bangDiem.length-1] = new float[] {9, 7, 10, 8};

            bangDiem = Arrays.copyOf(bangDiem, bangDiem.length+1);
            bangDiem[bangDiem.length-1] = new float[] {7, 6, 9, 8};
         */

        float[][] bangDiem = new float[3][4];

        for (int i = 0; i < bangDiem.length; i++) {
            System.out.printf("Nhập điểm của SV %d%n", i+1);
            for (int j = 0; j < bangDiem[i].length; j++) {
                System.out.printf("Nhập điểm môn học %d: ", j+1);
                bangDiem[i][j] = sc.nextFloat();
            }
        }

        inBangDiem(bangDiem);

        for (int i = 0; i < bangDiem.length; i++) {
            System.out.printf("Điểm trung bình SV %d: ", i+1);
            System.out.printf("%.1f%n", tinhDiemTrungBinh(bangDiem[i]));
        }

        int sv = 0;
        float dtbcn = tinhDiemTrungBinh(bangDiem[0]);

        for (int i = 1; i < bangDiem.length; i++) {
            for (int j = 1; j < bangDiem[i].length; j++) {
                if (bangDiem[i][j] > dtbcn) {
                    sv = i + 1;
                    dtbcn = bangDiem[i][j];
                }
            }
        }

        System.out.printf("SV có điểm trung bình cao nhất là SV %d với điểm TB là %.1f", sv, dtbcn);
    }
}
