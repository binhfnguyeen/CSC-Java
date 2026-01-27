package org.heulwen.thucHanh.giaoTiep;

public class PhanSo implements Comparable<PhanSo>{
    private int ts;
    private int ms;
    public PhanSo(){
        super();
    }
    public PhanSo(int ts, int ms){
        this.ts = ts;
        this.ms = ms;
    }

    public int getTs() {
        return ts;
    }

    public void setTs(int ts) {
        this.ts = ts;
    }

    public int getMs() {
        return ms;
    }

    public void setMs(int ms) {
        this.ms = ms;
    }

    public String xuat(){
        return ts + "/" + ms;
    }

    @Override
    public String toString() {
        return xuat();
    }

    @Override
    public int compareTo(PhanSo o) {
        return Integer.compare(o.ts * ms, ts * o.ms);
    }
}
