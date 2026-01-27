package org.heulwen.thucHanh.keThua;

public class HV extends HCN{
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
