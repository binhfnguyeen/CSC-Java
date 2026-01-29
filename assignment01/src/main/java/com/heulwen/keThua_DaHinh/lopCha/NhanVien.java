package com.heulwen.keThua_DaHinh.lopCha;

public abstract class NhanVien {
    private String hoTen;
    private String diaChi;
    private String soDienThoai;
    private String email;
    private String ngaySinh;

    public NhanVien(String hoTen, String diaChi, String soDienThoai, String email, String ngaySinh) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract double tinhLuong();

    public void hienThiThongTin(){
        System.out.printf("Họ tên: %s%n", hoTen);
        System.out.printf("Dia chi: %s%n", diaChi);
        System.out.printf("Số điện thoại: %s%n", soDienThoai);
        System.out.printf("Email: %s%n", email);
        System.out.printf("Ngày sinh: %s%n", ngaySinh);
    }
}
