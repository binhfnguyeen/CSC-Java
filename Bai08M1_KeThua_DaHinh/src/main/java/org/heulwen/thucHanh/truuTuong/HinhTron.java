package org.heulwen.thucHanh.truuTuong;

public class HinhTron extends HinhHoc{
    private int bk;

    public HinhTron(){
        super();
    }

    public HinhTron(int bk){
        super();
        this.bk = bk;
    }

    public int getBk() {
        return bk;
    }

    public void setBk(int bk) {
        this.bk = bk;
    }

    @Override
    public double chuVi() {
        return bk*2*Math.PI;
    }

    @Override
    public double dienTich() {
        return bk*bk*Math.PI;
    }

    @Override
    public String tenHinh() {
        return "Hình tròn";
    }
}
