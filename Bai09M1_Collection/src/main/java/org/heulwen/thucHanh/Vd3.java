package org.heulwen.thucHanh;

// Lambda dùng cho interface có đúng 1 abstract method
interface PhepTinh{
    double tinh(int a, int b);
}

class Cong implements PhepTinh{

    @Override
    public double tinh(int a, int b) {
        return a+b;
    }
}
public class Vd3 {
    public static void main(String[] args) {
        int a = 5, b =4;
        double tong;
        Cong cong = new Cong();
        tong = cong.tinh(a, b);
        System.out.println("Tong = "+ tong);

        // Cách 2: dùng biểu thuc Lambda
        PhepTinh tru = (x, y) -> x - y;
        double hieu = tru.tinh(a, b);
        System.out.println("Hieu = "+ hieu);
    }
}
