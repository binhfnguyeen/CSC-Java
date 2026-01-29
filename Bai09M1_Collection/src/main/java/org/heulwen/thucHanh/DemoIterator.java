package org.heulwen.thucHanh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DemoIterator {
    public static void main(String[] args) {
        List<String> gioHang = new ArrayList<>(Arrays.asList("Táo", "Chuối", "Cam", "Dưa hấu"));
        System.out.println("Giỏ hàng: " + gioHang);
        Iterator<String> iterator = gioHang.iterator();
        while (iterator.hasNext()){
            String item = iterator.next();
            if (item.equals("Cam")) {
                iterator.remove();
            } else {
                System.out.println("Mua: " + item);
            }
        }
        System.out.println("Giỏ hàng còn lại: " + gioHang);
    }
}
