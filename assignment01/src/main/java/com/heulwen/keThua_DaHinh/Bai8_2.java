package com.heulwen.keThua_DaHinh;

import com.heulwen.keThua_DaHinh.lopCha.NhanVien;
import com.heulwen.keThua_DaHinh.lopCon.NhanVienFullTime;
import com.heulwen.keThua_DaHinh.lopCon.NhanVienPartTime;
import com.heulwen.keThua_DaHinh.lopCon.NhanVienThucTap;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Bai8_2 {
    public static void menu(){
        System.out.println("Chọn công việc");
        System.out.println("1. Tính tổng lương các nhân viên");
        System.out.println("3. Tìm nhân viên có lương cao nhất");
        System.out.println("4. Thoát");
    }

    public static void tongLuongNhanVien(ArrayList<NhanVien> nhanVien){
        double tongLuongNhanVien = 0;
        for (NhanVien nv : nhanVien) {
            tongLuongNhanVien += nv.tinhLuong();
        }
        DecimalFormat df = new DecimalFormat("#,###,###");
        System.out.printf("Tổng lương các nhân viên: %s%n", df.format(tongLuongNhanVien));
    }

    public static void timKiemNhanVienTheoTen(ArrayList<NhanVien> nhanVien, String ten){
        ArrayList<NhanVien> nhanVienTheoTen = new ArrayList<>();
        for (NhanVien nv : nhanVien) {
            if (nv.getHoTen().equalsIgnoreCase(ten)){
                nhanVienTheoTen.add(nv);
            }
        }

        System.out.printf("Danh sách nhân viên có tên: %s%n", ten);
        for (NhanVien nv : nhanVienTheoTen) {
            nv.hienThiThongTin();
        }
    }

    public static void nhanVienCoLuongCaoNhat(ArrayList<NhanVien> nhanVien){
        NhanVien nvLuongCaoNhat = null;
        double max = -1;
        for (NhanVien nv : nhanVien) {
            if (nv.tinhLuong() > max) {
                max = nv.tinhLuong();
                nvLuongCaoNhat = nv;
            }
        }

        if (nvLuongCaoNhat != null) {
            System.out.println("Nhân viên có lương cap nhất");
            nvLuongCaoNhat.hienThiThongTin();
        } else {
            System.out.println("Không có nhân viên!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> nhanVien = new ArrayList<>();
        nhanVien.add(new NhanVienFullTime(
                "Nguyễn Anh Bình",
                "123 Nguyễn Trãi",
                "0989234567",
                "nab@gmail.com",
                "01/01/1990",
                11500000,
                1250000));
        nhanVien.add(new NhanVienPartTime(
                "Trần Thu Sương",
                "12/234 Phan Văn Trị",
                "0904852159",
                "ttsuong@gmail.com",
                "02/02/1995",
                8,
                8600000
        ));
        nhanVien.add(new NhanVienThucTap(
            "Lê Duy Tiến",
            "24/12 NTMK",
            "09685948569",
            "ldtien@gmail.com",
            "02/02/1995",
            3000000
        ));

        int choice;
        do {
            menu();
            System.out.print("Nhập chức năng: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
            }
        } while (choice != 4);
    }
}
