package com.heulwen.Collection;

import java.util.*;

/** Map được sử dụng khi cần ánh xạ key-value, truy xuất nhanh theo key
 * như lưu cache, cấu hình, đếm tần suất, nhóm dữ liệu hoặc thay thế if-else/switch-case
 * HashMap: truy xuất nhanh không cần thứ tự - Array + LinkedList/ Red-Black Tree
 * LinkedHashMap: giữ thứ tự insert - Hash Table + Doubly Linked List
 * TreeMap: sắp xếp theo key - Red-Black Tree
 */
public class Bai9_1 {
    public static boolean checkInput(String input){
        String[] dayOfWeek = {"Thứ 2", "Thứ 3", "Thứ 4", "Thứ 5", "Thứ 6", "Thứ 7"};
        for (String day : dayOfWeek){
            if(input.equals(day)){
                return true;
            }
        }
        return false;
    }

    public static void printTkb(Map<String, List<String>> thoiKhoaBieu){
        System.out.println("Thời khóa biểu cả tuần: ");
        for (String key : thoiKhoaBieu.keySet()){
            System.out.println(key + ": " + thoiKhoaBieu.get(key).toString());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] monHoc = {"Toán", "Lý", "Hóa", "Sinh", "Văn", "Sử", "Địa", "Tin"};
        Map<String, List<String>> thoiKhoaBieu = new HashMap<>();
        String ngay;
        while (true){
            System.out.printf("Nhập ngày (Thứ 2 - Thứ 7, hoặc 'thoat'): ");
            ngay = sc.nextLine();
            if (ngay.equalsIgnoreCase("thoat")) break;

            if (!checkInput(ngay)){
                System.out.println("Ngày không hợp lệ!");
                continue;
            }

            System.out.printf("Nhập tên môn học: ");
            String monCanHoc = sc.nextLine();

            boolean hopLe = false;
            for (String mon : monHoc){
                if (monCanHoc.equals(mon)){
                    hopLe = true;
                    break;
                }
            }

            if (!hopLe) {
                System.out.println("Môn học không hợp lệ!!");
                continue;
            }

            thoiKhoaBieu.putIfAbsent(ngay, new ArrayList<>());  // Tạo key nếu chưa có, chèn nếu key đã tồn tại
            thoiKhoaBieu.get(ngay).add(monCanHoc);
        }

        printTkb(thoiKhoaBieu);
    }
}
