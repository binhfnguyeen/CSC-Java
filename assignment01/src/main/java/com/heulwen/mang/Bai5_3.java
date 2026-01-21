package com.heulwen.mang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Bai5_3 {
    private static boolean checkInput(String input){
        if (!input.contains("-")){
            return false;
        }

        String ten = input.substring(0, input.indexOf("-")).trim();
        String sdt = input.substring(input.indexOf("-") + 1).trim();

        for (int i = 0; i<ten.length(); i++){
            if (!Character.isLetter(ten.charAt(i)) && !Character.isWhitespace(ten.charAt(i))){
                return false;
            }
        }

        for (int i = 0; i<sdt.length(); i++){
            if (!Character.isDigit(sdt.charAt(i))){
                return false;
            }
        }

        return true;
    }

    private static void printDanhSach(ArrayList<String[]> danhSach){
        System.out.println("Danh sách danh bạ: ");
        for (String[] sach : danhSach) {
            System.out.printf("%s : %s%n", sach[0], sach[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lienHe;
        ArrayList<String[]> danhSach = new ArrayList<>();

        do {
            System.out.println("Nhập thông tin liên hệ (Tên - Số điện thoại): ");
            lienHe = sc.nextLine();
            if (!checkInput(lienHe)){
                System.out.println("Kết thúc thêm thông tin liên hệ!!");
                printDanhSach(danhSach);
                break;
            }
            danhSach.add(new String[] {lienHe.substring(0, lienHe.indexOf("-")).trim(), lienHe.substring(lienHe.indexOf("-")+1).trim()});
        } while (checkInput(lienHe));

        System.out.println("Danh sách danh bạ sau khi sắp xếp");
        danhSach.sort(
                Comparator.comparing((String[] s) -> s[0].toLowerCase())
                        .thenComparing(s -> s[1])
        );
        printDanhSach(danhSach);

        System.out.println("Nhập tên cần tìm");
        String timTen = sc.nextLine().trim();
        for (String[] thongTin: danhSach) {
            if (thongTin[0].equalsIgnoreCase(timTen)){
                System.out.printf("Danh bạ cần tìm: %s : %s%n", thongTin[0], thongTin[1]);
            }
        }

        System.out.println("Nhập tên cần xóa");
        String tenXoa = sc.nextLine().trim();
        int vtXoa = -1;
        for (int i = 0; i<danhSach.size(); i++){
            if (danhSach.get(i)[0].equalsIgnoreCase(tenXoa)){
                vtXoa = i;
                break;
            }
        }

        if (vtXoa != -1)  {
            danhSach.remove(vtXoa);
            System.out.println("Danh sách danh bạ sau khi xóa");
            printDanhSach(danhSach);
        }

    }
}
