package com.heulwen.keThua_DaHinh.lopCon;

import com.heulwen.keThua_DaHinh.lopCha.NhanVien;

public class NhanVienPartTime extends NhanVien {
    private double soGioLamViec;
    private double tienCongGio;

    public NhanVienPartTime(String hoTen, String diaChi, String soDienThoai, String email, String ngaySinh, double soGioLamViec, double thuong) {
        super(hoTen, diaChi, soDienThoai, email, ngaySinh);
        this.soGioLamViec = soGioLamViec;
        this.tienCongGio = thuong;
    }

    public double getTienCongGio() {
        return tienCongGio;
    }

    public void setTienCongGio(double tienCongGio) {
        this.tienCongGio = tienCongGio;
    }

    public double getSoGioLamViec() {
        return soGioLamViec;
    }

    public void setSoGioLamViec(double soGioLamViec) {
        this.soGioLamViec = soGioLamViec;
    }

    @Override
    public double tinhLuong() {
        return soGioLamViec + tienCongGio;
    }
}
