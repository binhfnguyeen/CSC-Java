package org.heulwen.thucHanh.giaoTiep;

public interface HinhHoc {
    int AA = 1; // public static final
    double chuVi(); // public abstract
    double dienTich();
    default String tenHinh(){ // default mới được phép có thân hàm
        return "Hình học";
    }
    default String xuat(){
        return String.format("%s có chu vi %.2f diện tích %.2f", tenHinh(),dienTich(),chuVi());
    }
}

// Interface cái chung để các lớp khác thực hiện
// khai bao abstract thi khong tao doi tuong duoc
