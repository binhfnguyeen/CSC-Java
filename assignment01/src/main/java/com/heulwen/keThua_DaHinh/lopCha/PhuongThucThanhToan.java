package com.heulwen.keThua_DaHinh.lopCha;

public class PhuongThucThanhToan {
    private Double soTien;
    private String ngayGiaoDich;

    public PhuongThucThanhToan(){
        soTien=0.0;
        ngayGiaoDich="";
    }

    public PhuongThucThanhToan(Double soTien, String ngayGiaoDich){
        this.soTien=soTien;
        this.ngayGiaoDich=ngayGiaoDich;
    }

    public Double getSoTien() {
        return soTien;
    }

    public void setSoTien(Double soTien) {
        this.soTien = soTien;
    }

    public String getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(String ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public void hienThiThongTin(){
        System.out.printf("Giao dịch: %.2f VND vào ngày %s", soTien, ngayGiaoDich);
    }
}
