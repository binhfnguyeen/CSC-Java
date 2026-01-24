package com.heulwen.thucHanh;

public class HinhTron {
    // Thành phần dữ liệu
    private int bk;
    // Thành phần phương thức
    // -- Phương thức khởi tạo
    public HinhTron(){
        bk = 0;
    }

    public HinhTron(int bk){
        this.bk = bk;
    }

    // -- Phương thức getter & setter
    public int getBk() {
        return bk;
    }

    public void setBk(int bk) {
        this.bk = bk;
    }

    // -- Phương thức xử lý
    public double dienTich(){
        return bk*bk*3.14;
    }

    public double chuVi(){
        return bk*2*3.14;
    }

    public String tenHinh(){
        return "Hình tròn";
    }

    public String xuat(){
        return String.format("%s có Chu vi: %.2f, Diện tích: %.2f%n", tenHinh(), dienTich(), chuVi());
    }
}
