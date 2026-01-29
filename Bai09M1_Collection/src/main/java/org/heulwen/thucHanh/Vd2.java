package org.heulwen.thucHanh;

import java.util.HashMap;
import java.util.TreeMap;

public class Vd2 {
    public static void main(String[] args) {
        TreeMap<Integer, String> sc = new TreeMap<>(); // Có sắp xếp
        sc.put(1, "Một");
        sc.put(5, "Năm");
        sc.put(3, "Ba");
        sc.put(2, "Hai");
        sc.put(4, "Bốn");
        System.out.println("Số ánh xạ trong Map là: " + sc.size());
        for (int key: sc.keySet()){ // 1 5 3 2 4
            System.out.println(key + " -> " + sc.get(key));
        }

        HashMap<String, String> td = new HashMap<String, String>(); // Không sắp xếp
        td.put("one", "Một");
        td.put("two", "Hai");
        td.put("three", "Ba");
        td.put("four", "Bốn");
        td.put("five", "Năm");
        for (String key: td.keySet()){
            System.out.println(key + " -> " + td.get(key));
        }

        System.out.println("Xóa 'two' trong Map");
        td.remove("two");
        for (String key: td.keySet()){
            System.out.println(key + " -> " + td.get(key));
        }
    }
}
