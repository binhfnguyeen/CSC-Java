package com.heulwen.keThua_DaHinh.lopCon;

import com.heulwen.keThua_DaHinh.lopCha.PhuongThucThanhToan;

public class ChuyenKhoan extends PhuongThucThanhToan {
    private String tenNganHang;
    public ChuyenKhoan(String tenNganHang, Double soTien, String ngayGiaoDich){
        super(soTien, ngayGiaoDich);
        this.tenNganHang = tenNganHang;
    }

    public String getTenNganHang() {
        return tenNganHang;
    }

    public void setTenNganHang(String tenNganHang) {
        this.tenNganHang = tenNganHang;
    }

    @Override
    public void hienThiThongTin() {
        System.out.printf("Chuyển khoản: %.2f VND vào ngày %s qua ngân hàng %s%n", getSoTien(), getNgayGiaoDich(), tenNganHang);
    }
}
