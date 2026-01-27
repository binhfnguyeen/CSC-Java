package org.heulwen.thucHanh.keThua;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Nguoi {
    private String hoTen;
    private Date ngaySinh;
    private Boolean gioiTinh;
    public Nguoi(){}
    public Nguoi(String hoTen, Date ngaySinh, Boolean gioiTinh){
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String xuat(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("%s - %s - %s",
                hoTen, ngaySinh != null ? sdf.format(ngaySinh) : null , gioiTinh);
    }
}
