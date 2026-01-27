package com.heulwen.keThua_DaHinh.lopCon;

import com.heulwen.keThua_DaHinh.lopCha.PhuongThucThanhToan;

public class TienMat extends PhuongThucThanhToan {
    public TienMat(Double soTien, String ngayGiaoDich){
        super(soTien, ngayGiaoDich);
    }

    @Override
    public void hienThiThongTin() {
        System.out.printf("Thanh toán tiền mặt: %.2f VND vào ngày %s%n", getSoTien(), getNgayGiaoDich());
    }
}
