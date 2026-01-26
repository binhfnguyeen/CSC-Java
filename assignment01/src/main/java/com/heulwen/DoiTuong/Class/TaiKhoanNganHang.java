package com.heulwen.DoiTuong.Class;

public class TaiKhoanNganHang {
    private String soTaiKhoan;
    private String tenChuTaiKhoan;
    private String soDienThoai;
    private double soDu;

    private boolean isDigit(String s){
        for(int i=0;i<s.length();i++){
            if (!Character.isDigit(s.charAt(i))){
                return false;
            }
        }
        return true;
    }

    private boolean checkLength(String s, int size){
        return s.length() == size;
    }

    public TaiKhoanNganHang(String soTaiKhoan, String tenChuTaiKhoan, String soDienThoai, double soDu) {
        if (!isDigit(soTaiKhoan)){
            throw new IllegalArgumentException("Số tài khoản phải là chữ số!");
        }
        if (!isDigit(soDienThoai) && !checkLength(soDienThoai, 10)){
            throw new IllegalArgumentException("Số điện thoại phải là chữ số và có độ dài là 10!");
        }
        this.soTaiKhoan = soTaiKhoan;
        this.tenChuTaiKhoan = tenChuTaiKhoan;
        this.soDienThoai = soDienThoai;
        this.soDu = soDu;
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getTenChuTaiKhoan() {
        return tenChuTaiKhoan;
    }

    public void setTenChuTaiKhoan(String tenChuTaiKhoan) {
        this.tenChuTaiKhoan = tenChuTaiKhoan;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public double getSoDu() {
        return soDu;
    }

    public void setSoDu(double soDu) {
        this.soDu = soDu;
    }

    public void napTien(double soTien){
        if (soTien > 0){
            soDu += soTien;
            System.out.printf("Số dư hiện tại: %.1f%n", soDu);
            return;
        }
        System.out.println("Nạp tiền không thành công!");
    }

    public void rutTien(double soTien){
        if (soTien > 0 && soTien <= soDu){
            soDu -= soTien;
            System.out.printf("Số dư hiện tại: %.1f%n", soDu);
            return;
        }
        System.out.println("Rút tiền không thành công!");
    }

    public void hienThiThongTin(){
        System.out.printf("Số tài khoản: %s%nChủ tài khoản: %s%nSố điện thoại: %s%nSố dư: %.2f%n",
                soTaiKhoan, tenChuTaiKhoan, soDienThoai, soDu);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        TaiKhoanNganHang taiKhoanNganHang = (TaiKhoanNganHang) obj;
        return soTaiKhoan.equals(taiKhoanNganHang.soTaiKhoan);
    }

    @Override
    public int hashCode() {
        return soTaiKhoan.hashCode();
    }
}
