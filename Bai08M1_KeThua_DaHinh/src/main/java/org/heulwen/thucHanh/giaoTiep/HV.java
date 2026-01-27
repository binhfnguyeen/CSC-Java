package org.heulwen.thucHanh.giaoTiep;

public class HV extends HCN implements HinhHoc{
    public HV(){
        super();
    }

    public HV(int canh){
        super(canh, canh);
    }

    @Override
    public String tenHinh() {
        return "Hình vuông";
    }
}
