package com.heulwen.DoiTuong;

import com.heulwen.DoiTuong.Class.Word;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai7_1 {
    public static void menu(){
        System.out.println("=========MENU=========");
        System.out.println("1. Thêm từ mới vào từ điển");
        System.out.println("2. Xem tất cả các từ trong từ điển");
        System.out.println("3. Tìm nghĩa tiếng Việt theo từ tiếng anh");
        System.out.println("4. Cập nhật ví dụ từ");
        System.out.println("5. Xóa từ khỏi từ điển");
        System.out.println("6. Thoát");
    }

    public static void themTuVaoTuDien(ArrayList<Word> ds, Word tuMoi){
        for (Word tu: ds){
            if (tu.equals(tuMoi)){
                System.out.print("Đã có " + tuMoi.toString() + " trong danh sách");
                return;
            }
        }
        ds.add(tuMoi);
    }

    public static void xemDanhSachTuDien(ArrayList<Word> ds){
        if (ds.isEmpty()){
            System.out.println("Danh sách trống!");
        }
        for (Word tuDien: ds){
            System.out.println(tuDien.toString());
        }
    }

    public static String timNghia(ArrayList<Word> ds, String english){
        Word tu = null;
        for (Word tuDien: ds){
            if (tuDien.getEnglish().equalsIgnoreCase(english)){
                tu = tuDien;
            }
        }
        if (tu != null){
            return tu.toString();
        }
        return "Không tìm thấy!!";
    }

    public static void updateExample(ArrayList<Word> ds, String english, String newExmample){
        Word tu = null;
        for (Word tuDien: ds){
            if (tuDien.getEnglish().equalsIgnoreCase(english)){
                tu = tuDien;
            }
        }
        if (tu != null){
            tu.setExample(newExmample);
            System.out.print("Cập nhật thành công từ: " + tu.toString());
        }
    }

    public static void removeWord(ArrayList<Word> ds, String english){
        Word word = null;
        for (Word tuDien: ds){
            if (tuDien.getEnglish().equalsIgnoreCase(english)){
                word = tuDien;
            }
        }
        if (word != null) {
            ds.remove(word);
            System.out.println("Xóa thành công!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Word> ds = new ArrayList<>();
        int choice;
        do {
            menu();
            System.out.println("Chọn chức năng: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.print("Nhập từ tiếng anh: ");
                    String english = sc.nextLine();
                    System.out.print("Nhập nghĩa tiếng việt: ");
                    String vietnamese = sc.nextLine();
                    System.out.print("Nhập ví dụ: ");
                    String example = sc.nextLine();

                    Word tuMoi = new Word(english, vietnamese, example);
                    themTuVaoTuDien(ds, tuMoi);
                    break;
                case 2:
                    xemDanhSachTuDien(ds);
                    break;
                case 3:
                    sc.nextLine();
                    System.out.print("Nhập từ tiếng anh cần tìm: ");
                    String tuCanTim = sc.nextLine();
                    System.out.println(timNghia(ds, tuCanTim));
                    break;
                case 4:
                    sc.nextLine();
                    System.out.print("Nhập từ cần cập nhật ví dụ: ");
                    String tuUpdate = sc.nextLine();
                    System.out.print("Nhập ví dụ mới: ");
                    String newExample = sc.nextLine();
                    updateExample(ds, tuUpdate, newExample);
                    break;
                case 5:
                    sc.nextLine();
                    System.out.print("Nhập từ cần xóa: ");
                    String tuXoa = sc.nextLine();
                    removeWord(ds, tuXoa);
                    break;
                case 6:
                    System.out.println("Thoát chương trình!!");
                    break;
                default:
                    System.out.println("Vui lòng chọn từ 1-6!!");
            }
        } while (choice != 6);
    }
}
