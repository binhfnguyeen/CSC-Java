package org.heulwen.thucHanh.giaoTiep;

public class HT implements HinhHoc{
    private int bk;
    public HT(){
        super();
    }
    public HT(int bk){
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
        return bk * 2 * 3.14;
    }

    @Override
    public double dienTich() {
        return bk * bk * 3.14;
    }

    @Override
    public String tenHinh() {
        return "Hình tròn";
    }
}
