package org.heulwen.thucHanh.truuTuong;

public abstract class HinhHoc {
    public abstract double chuVi();
    public abstract double dienTich();
    public String tenHinh(){
        return "Hình học";
    }
    public String xuat(){
        return String.format("%s có chu vi %.2f diện tích %.2f",
                tenHinh(), dienTich(), chuVi());
    }
}
