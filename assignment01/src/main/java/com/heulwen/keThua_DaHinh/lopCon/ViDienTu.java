package com.heulwen.keThua_DaHinh.lopCon;

import com.heulwen.keThua_DaHinh.lopCha.PhuongThucThanhToan;

public class ViDienTu extends PhuongThucThanhToan {
    private String loaiVi;

    public ViDienTu(String loaiVi, Double soTien, String ngayGiaoDich) {
        super(soTien, ngayGiaoDich);
        this.loaiVi = loaiVi;
    }

    public String getLoaiVi() {
        return loaiVi;
    }

    public void setLoaiVi(String loaiVi) {
        this.loaiVi = loaiVi;
    }

    @Override
    public void hienThiThongTin() {
        System.out.printf("Ví điện tử %s : %.2f VND vào ngày %s qua ngân hàng %s%n", loaiVi, getSoTien(), getNgayGiaoDich());
    }
}
