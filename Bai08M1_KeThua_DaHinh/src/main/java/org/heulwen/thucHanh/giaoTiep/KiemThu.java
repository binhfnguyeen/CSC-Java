package org.heulwen.thucHanh.giaoTiep;

import java.util.Arrays;

public class KiemThu {
    public static void main(String[] args) {
//        HinhHoc[] hh = new HinhHoc[3];
//        hh[0] = new HT(5);
//        hh[1] = new HCN(5, 3);
//        hh[2] = new HV(3);
//        for (HinhHoc h: hh){
//            System.out.printf(h.xuat());
//        }

        PhanSo[] nps = new PhanSo[5];
        nps[0] = new PhanSo(1, 5);
        nps[1] = new PhanSo(1, 2);
        nps[2] = new PhanSo(1, 6);
        nps[3] = new PhanSo(1, 3);
        nps[4] = new PhanSo(1, 4);
        System.out.println("Mảng phân số ban đầu");
        System.out.println(Arrays.toString(nps));

        System.out.println("Sắp xếp mảng phân số tăng dầm");
        Arrays.sort(nps);
        System.out.println(Arrays.toString(nps));
    }
}
