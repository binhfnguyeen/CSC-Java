package org.heulwen.thucHanh.keThua;

import java.util.Date;

public class HocSinh extends Nguoi{
    private String truong;
    private String lop;
    public HocSinh(){
        super();
    }
    public HocSinh(String hoTen, Date ngaySinh, Boolean gioiTinh, String truong, String lop){
        super(hoTen, ngaySinh, gioiTinh);
        this.truong = truong;
        this.lop = lop;
    }

    public String getTruong() {
        return truong;
    }

    public void setTruong(String truong) {
        this.truong = truong;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    @Override
    public String xuat() {
        return String.format("%s - %s - %s", super.xuat(), truong, lop);
    }
}
