package org.heulwen.thucHanh;

interface ChaoHoi {
    void chao();
}

class Chao implements ChaoHoi {

    @Override
    public void chao() {
        System.out.println("Chào mừng các bạn đến với lập trình Lambda");
    }
}

public class Vd4 {
    public static void main(String[] args) {
        Chao c1 = new Chao();
        c1.chao();

        // Cách 2: dùng biểu thức Lambda
        ChaoHoi c2 = () -> System.out.println("Chào các bạn lớp Java");
        c2.chao();

        ChaoHoi c3 = () -> {
            String s = "Hello Word!";
            s = s.toUpperCase();
            System.out.println(s);
        };
        c3.chao();
    }
}
