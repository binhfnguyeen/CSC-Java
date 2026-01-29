package com.heulwen.keThua_DaHinh.lopCon;

import com.heulwen.keThua_DaHinh.lopCha.NhanVien;

public class NhanVienThucTap extends NhanVien {
    private double luongThucTap;

    public NhanVienThucTap(String hoTen, String diaChi, String soDienThoai, String email, String ngaySinh, double luongThucTap) {
        super(hoTen, diaChi, soDienThoai, email, ngaySinh);
        this.luongThucTap = luongThucTap;
    }

    public double getLuongThucTap() {
        return luongThucTap;
    }

    public void setLuongThucTap(double luongThucTap) {
        this.luongThucTap = luongThucTap;
    }


    @Override
    public double tinhLuong() {
        return luongThucTap;
    }
}
