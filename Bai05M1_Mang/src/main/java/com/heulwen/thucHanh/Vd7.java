package com.heulwen.thucHanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Vd7 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(3);
        al.add(5);
        al.add(4);
        al.add(1);
        al.add(2);
        System.out.println("Danh sách ban đầu");
        System.out.println(al);

        System.out.println("Thêm phần tử 6 vào cuối danh sách");
        al.add(6);
        System.out.println(al);

        System.out.println("Chèn phần tử 7 vào vị trí chỉ số 1");
        al.add(1, 7);
        System.out.println(al);

        System.out.println("Xóa phần tử 4 ở vị trí chỉ số 3");
        al.remove(3);
        System.out.println(al);

        System.out.println("Sắp xếp danh sách tăng dần");
        Collections.sort(al);
        System.out.println(al);

        System.out.println("Sắp xếp danh sách giảm dần");
        al.sort(Collections.reverseOrder());
        System.out.println(al);

        System.out.println("Duyệt danh sách theo chỉ số");
        for (int i = 0; i < al.size(); i++){
            System.out.printf("%d ", al.get(i));
        }
        System.out.println();

        System.out.println("Duyệt danh sách theo phần tử");
        for (int x: al){
            System.out.printf("%d ", x);
        }
        System.out.println();

        System.out.println("Duyệt danh sách theo bộ lập");
        Iterator<Integer> it = al.iterator();
        while (it.hasNext()){
            System.out.printf("%d ", it.next());
        }
        System.out.println();
    }
}
