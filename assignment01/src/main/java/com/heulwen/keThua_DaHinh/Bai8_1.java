package com.heulwen.keThua_DaHinh;

import com.heulwen.keThua_DaHinh.lopCha.PhuongThucThanhToan;
import com.heulwen.keThua_DaHinh.lopCon.ChuyenKhoan;
import com.heulwen.keThua_DaHinh.lopCon.TienMat;
import com.heulwen.keThua_DaHinh.lopCon.ViDienTu;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai8_1 {
    public static void menu(){
        System.out.println("=====MENU=====");
        System.out.println("1. Thêm giao dịch mới");
        System.out.println("2. Hiển thị tất cả giao dịch");
        System.out.println("3. Tính tổng tiền theo từng loại");
        System.out.println("4. Thoát");
    }

    public static void hienThiGiaoDich(ArrayList<PhuongThucThanhToan> listGiaoDich){
        System.out.println("DANH SÁCH GIAO DỊCH");
        for (PhuongThucThanhToan pt:  listGiaoDich){
            pt.hienThiThongTin();
        }
    }

    public static void tongTienTungLoai(ArrayList<PhuongThucThanhToan> listGiaoDich){
        Double tienMat = 0.0, chuyenKhoan = 0.0, viDienTu = 0.0;
        for (PhuongThucThanhToan pt: listGiaoDich){
            if (pt.getClass().equals(TienMat.class)) {
                tienMat += pt.getSoTien();
            } else if (pt.getClass().equals(ChuyenKhoan.class)) {
                chuyenKhoan += pt.getSoTien();
            } else {
                viDienTu += pt.getSoTien();
            }
        }

        System.out.printf("Tổng tiền mặt: %.1f%n", tienMat);
        System.out.printf("Tổng chuyển khoản: %.1f%n", chuyenKhoan);
        System.out.printf("Tổng ví điện tử: %.1f%n", viDienTu);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<PhuongThucThanhToan> phuongThucThanhToan = new ArrayList<>();
        phuongThucThanhToan.add(new TienMat((Double) 800000.0, "15/05/2025"));
        phuongThucThanhToan.add(new TienMat((Double) 500000.0, "16/05/2025"));
        phuongThucThanhToan.add(new ChuyenKhoan("Vietcombank", (Double) 5000000.0, "21/05/2025"));
        phuongThucThanhToan.add(new ChuyenKhoan("Techcombank", (Double) 3000000.0, "17/05/2025"));
        phuongThucThanhToan.add(new ViDienTu("Momo", (Double) 1200000.0, "23/05/2025"));
        phuongThucThanhToan.add(new ViDienTu("ZaloPay", (Double) 1500000.0, "18/05/2025"));

        System.out.println("DANH SÁCH GIAO DỊCH BAN ĐẦU");
        for (PhuongThucThanhToan pt: phuongThucThanhToan){
            pt.hienThiThongTin();
        }

        int choice;

        do {
            menu();
            System.out.print("Chọn chức năng: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Chọn loại giao dịch");
                    int luaChon;
                    do {
                        System.out.println("1. Tiền mặt");
                        System.out.println("2. Chuyển khoản");
                        System.out.println("3. Ví điện tử");
                        System.out.print("Lựa chọn: ");
                        luaChon = sc.nextInt();
                    } while (luaChon < 1 || luaChon > 3);
                    if (luaChon == 1) {
                        System.out.print("Nhập số tiền: ");
                        Double soTien = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Nhập ngày giao dịch: ");
                        String ngayGiaoDich = sc.nextLine();
                        phuongThucThanhToan.add(new TienMat(soTien, ngayGiaoDich));
                    } else if (luaChon == 2) {
                        System.out.print("Nhập tên ngân hàng: ");
                        String nganHang = sc.nextLine();
                        System.out.print("Nhập số tiền: ");
                        Double soTien = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Nhập ngày giao dịch: ");
                        String ngayGiaoDich = sc.nextLine();
                        phuongThucThanhToan.add(new ChuyenKhoan(nganHang, soTien, ngayGiaoDich));
                    } else {
                        System.out.print("Nhập loại ví: ");
                        String loaiVi = sc.nextLine();
                        System.out.print("Nhập số tiền: ");
                        Double soTien = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Nhập ngày giao dịch: ");
                        String ngayGiaoDich = sc.nextLine();
                        phuongThucThanhToan.add(new ViDienTu(loaiVi, soTien, ngayGiaoDich));
                    }
                    break;
                case 2:
                    hienThiGiaoDich(phuongThucThanhToan);
                    break;
                case 3:
                    tongTienTungLoai(phuongThucThanhToan);
                    break;
                case 4:
                    System.out.println("Chương trình kết thúc.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Chọn từ 1 đến 4!");
            }
        } while (choice != 4);
    }
}
