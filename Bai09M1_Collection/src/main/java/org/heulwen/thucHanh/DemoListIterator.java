package org.heulwen.thucHanh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class DemoListIterator {
    public static void main(String[] args) {
        List<String> danhSach = new ArrayList<String>(Arrays.asList("A", "B", "C"));
        ListIterator<String> listIt = danhSach.listIterator();

        System.out.println("Duyệt xuôi:");
        while (listIt.hasNext()) {
            String value = listIt.next();
            System.out.println("->" + value);
            if (value.equals("B")){
                listIt.set("B-mới");
                listIt.add("B-thêm");
            }
        }

        System.out.println("Duyệt ngược:");
        while (listIt.hasPrevious()){
            System.out.println("<-" + listIt.previous());
        }

        System.out.println("Kết quả cuối cùng: " + danhSach);
        listIt = danhSach.listIterator();
        while (listIt.hasNext()) {
            String value = listIt.next();
            if (value.equals("B-thêm")){
                listIt.remove();
            }
        }
        System.out.println("Kết quả sau khi xóa 'B-thêm': " + danhSach);
    }
}
