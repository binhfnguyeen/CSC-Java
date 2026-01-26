package com.heulwen.DoiTuong;

import com.heulwen.DoiTuong.Class.TaiKhoanNganHang;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Bai7_2 {
    public static void menu(){
        System.out.println("========= MENU =========");
        System.out.println("1. Tạo tài khoản");
        System.out.println("2. Xem danh sách tài khoản");
        System.out.println("3. Sắp xếp theo số tài khoản tăng dần");
        System.out.println("4. Sắp xếp theo tên tài khoản giảm dần");
        System.out.println("5. Tìm tài khoản theo số tài khoản");
        System.out.println("6. Tìm tài khoản có số dư nhiều nhất");
        System.out.println("7. Dừng chương trình");
        System.out.println("Chọn chức năng:");
    }

    public static void taoTaiKhoan(ArrayList<TaiKhoanNganHang> ds, TaiKhoanNganHang taiKhoan){
        ds.add(taiKhoan);
        System.out.println("Tạo tài khoản thành công!!");
    }

    public static void danhSachTaiKhoan(ArrayList<TaiKhoanNganHang> ds){
        if (ds.isEmpty()){
            System.out.println("Danh sách trống!");
            return;
        }
        for (TaiKhoanNganHang d : ds){
            System.out.printf("Số tài khoản: %s%nChủ tài khoản: %s%nSố điện thoại: %s%nSố dư: %.2f%n%n",
              d.getSoTaiKhoan(), d.getTenChuTaiKhoan(), d.getSoDienThoai(), d.getSoDu()
            );
        }
    }

    public static void sapXepSoTaiKhoan(ArrayList<TaiKhoanNganHang> ds){
        ds.sort(Comparator.comparing(TaiKhoanNganHang::getSoTaiKhoan));
    }

    public static void sapXepTenTaiKhoan(ArrayList<TaiKhoanNganHang> ds){
        ds.sort(Comparator.comparing(TaiKhoanNganHang::getSoTaiKhoan).reversed());
    }

    public static void timTheoSoTaiKhoan(ArrayList<TaiKhoanNganHang> ds, String soTaiKhoan){
        TaiKhoanNganHang taiKhoan = null;
        for (TaiKhoanNganHang d : ds){
            if (d.getSoTaiKhoan().equals(soTaiKhoan)){
                taiKhoan = d;
                break;
            }
        }

        if (taiKhoan != null){
            taiKhoan.hienThiThongTin();
        }
    }

    public static void taiKhoanCoSoDuNhieuNhat(ArrayList<TaiKhoanNganHang> ds){
        TaiKhoanNganHang t = null;
        double maxSoDu = 0;
        for (TaiKhoanNganHang d : ds){
            if (maxSoDu < d.getSoDu()){
                maxSoDu = d.getSoDu();
                t = d;
            }
        }

        if (t != null){
            t.hienThiThongTin();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<TaiKhoanNganHang> ds = new ArrayList<>();
        int choice;
        do {
            menu();
            System.out.println("Nhập lựa chọn (1-7): ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Nhập số tài khoản: ");
                    String stk = sc.nextLine();
                    System.out.print("Nhập tên chủ tài khoản: ");
                    String ten = sc.nextLine();
                    System.out.print("Nhập số điện thoại: ");
                    String sdt = sc.nextLine();
                    System.out.print("Nhập số dư: ");
                    double soDu = sc.nextDouble();
                    TaiKhoanNganHang taiKhoan = new TaiKhoanNganHang(stk, ten, sdt, soDu);
                    taoTaiKhoan(ds, taiKhoan);
                    break;
                case 2:
                    danhSachTaiKhoan(ds);
                    break;
                case 3:
                    sapXepSoTaiKhoan(ds);
                    break;
                case 4:
                    sapXepTenTaiKhoan(ds);
                    break;
                case 5:
                    System.out.print("Nhập số tài khoản: ");
                    String timStk = sc.nextLine();
                    timTheoSoTaiKhoan(ds, timStk);
                    break;
                case 6:
                    taiKhoanCoSoDuNhieuNhat(ds);
                    break;
                case 7:
                    System.out.println("Thoát chương trình!!");
                    break;
                default:
                    System.out.println("Vui lòng chọn từ 1-7!!");
            }
        } while (choice != 7);
    }
}
