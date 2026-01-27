package org.heulwen.thucHanh.keThua;

public class KiemThu {
    public static void main(String[] args) {
//        Nguoi ng1 = new Nguoi();
//        System.out.println(ng1.xuat());
//        System.out.println(ng1.toString());
//        Nguoi ng2 = new Nguoi("NVA", new Date(), true);
//        System.out.println(ng2.xuat());
//
//        HocSinh hs1 = new HocSinh();
//        System.out.println(hs1.xuat());
//        HocSinh hs2 = new HocSinh("TTB", new Date(), false, "LHT", "hd");
//        System.out.println(hs2.xuat());

        HCN h = new HCN();
        System.out.println(h.xuat());
        h = new HCN(8, 5);
        System.out.println(h.xuat());
        h = new HV(8);
        System.out.println(h.xuat());
    }
}
