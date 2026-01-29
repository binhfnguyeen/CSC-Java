package org.heulwen.thucHanh;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Vd1 {
    public static void main(String[] args) {
        ArrayList<Integer> ds1 = new ArrayList<Integer>();
        ds1.add(5);
        ds1.add(3);
        ds1.add(2);
        ds1.add(4);
        ds1.add(1);
        ds1.add(5);
        System.out.println("Duyệt danh sách List theo chỉ số");
        for(int i=0;i<ds1.size();i++){
            System.out.println(ds1.get(i) + " ");
        }
        System.out.println("Duyệt danh sách List theo phần tử");
        for (int x: ds1){
            System.out.println(x + " ");
        }
        System.out.println("Xuất danh sách List theo chuỗi");
        System.out.println(ds1.toString());

        Set<Integer> ds2 = new HashSet<Integer>();
        ds2.add(5);
        ds2.add(3);
        ds2.add(2);
        ds2.add(4);
        ds2.add(1);
        ds2.add(5); // Phần tử trùng bị loại
        System.out.println("Duyệt danh sách Set theo phần tử");
        for(int x: ds2){
            System.out.println(x + " ");
        }
        System.out.println("Xuất danh sách Set theo chuỗi");
        System.out.println(ds2.toString());
    }
}
