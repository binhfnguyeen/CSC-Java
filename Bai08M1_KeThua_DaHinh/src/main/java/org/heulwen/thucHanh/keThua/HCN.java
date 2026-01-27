package org.heulwen.thucHanh.keThua;

public class HCN {
    private int cd;
    private int cr;
    public HCN(){
        super();
    }
    public HCN(int cd, int cr) {
        this.cd = cd;
        this.cr = cr;
    }

    public int getCd() {
        return cd;
    }

    public void setCd(int cd) {
        this.cd = cd;
    }

    public int getCr() {
        return cr;
    }

    public void setCr(int cr) {
        this.cr = cr;
    }

    public double chuVi(){
        return ((double) cd + cr) / 2;
    }

    public double dienTich(){
        return ((double) cd * cr);
    }

    public String tenHinh(){
        return "Hình chữ nhật";
    }

    public String xuat(){
        return String.format("%s có chu vi %.2f diện tích %.2f", tenHinh(), chuVi(), dienTich());
    }
}
