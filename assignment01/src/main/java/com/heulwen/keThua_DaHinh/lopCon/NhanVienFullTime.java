package com.heulwen.keThua_DaHinh.lopCon;

import com.heulwen.keThua_DaHinh.lopCha.NhanVien;

public class NhanVienFullTime extends NhanVien {
    private double luongCoban;
    private double thuong;

    public NhanVienFullTime(String hoTen, String diaChi, String soDienThoai, String email, String ngaySinh, double luongCoban, double thuong) {
        super(hoTen, diaChi, soDienThoai, email, ngaySinh);
        this.luongCoban = luongCoban;
        this.thuong = thuong;
    }

    public double getLuongCoban() {
        return luongCoban;
    }

    public void setLuongCoban(double luongCoban) {
        this.luongCoban = luongCoban;
    }

    public double getThuong() {
        return thuong;
    }

    public void setThuong(double thuong) {
        this.thuong = thuong;
    }

    @Override
    public double tinhLuong() {
        return luongCoban + thuong;
    }
}
