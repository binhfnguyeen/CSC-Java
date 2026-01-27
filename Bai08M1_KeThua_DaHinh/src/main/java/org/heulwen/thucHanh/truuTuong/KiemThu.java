package org.heulwen.thucHanh.truuTuong;

public class KiemThu {
    public static void main(String[] args) {
        HinhHoc[] hh = new HinhHoc[3];
        hh[0] = new HinhTron(8);
        hh[1] = new HCN(8, 5);
        hh[2] = new HV(8);
        for (HinhHoc h : hh) {
            System.out.println(h.xuat());
        }
    }
}
