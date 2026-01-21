package com.heulwen.mang;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai5_4 {
    private static void inGio(ArrayList<String> gioTen, ArrayList<Integer> gioSoLuong, ArrayList<Integer> gioGia, int tongTien) {
        System.out.println("Chi tiết giỏ hàng:");
        for (int i = 0; i < gioTen.size(); i++) {
            int thanhTien = gioSoLuong.get(i) * gioGia.get(i);
            tongTien += thanhTien;

            System.out.println(
                    (i + 1) + " " + gioTen.get(i) + " x " + gioSoLuong.get(i)
                            + " = " + thanhTien + " VNĐ"
            );
        }
        System.out.println("Tổng tiền: " + tongTien + " VNĐ");
    }

    public static void main(String[] args) {
        ArrayList<String> tenSP = new ArrayList<>();
        ArrayList<Integer> giaSP = new ArrayList<>();

        tenSP.add("Sữa tắm");
        giaSP.add(75000);

        tenSP.add("Dầu gội");
        giaSP.add(135000);

        tenSP.add("Dầu xả");
        giaSP.add(128000);

        tenSP.add("Xà phòng tắm");
        giaSP.add(18000);

        tenSP.add("Kem đánh răng");
        giaSP.add(25000);

        ArrayList <String> gioTen = new ArrayList<>();
        ArrayList <Integer> gioSoLuong = new ArrayList<>();
        ArrayList <Integer> gioGia = new ArrayList<>();

        System.out.println("Danh sách sản phẩm:");
        for (int i = 0; i < tenSP.size(); i++) {
            System.out.println((i + 1) + ". " + tenSP.get(i) + " " + giaSP.get(i) + " VNĐ");
        }

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Bạn muốn mua mặt hàng số mấy? (1-5, 0 để dừng): ");
            int ma = sc.nextInt();

            if (ma == 0) {
                break;
            }

            if (ma < 1 || ma > 5) {
                System.out.println("Mã hàng không hợp lệ!");
                continue;
            }

            System.out.print("Nhập số lượng: ");
            int sl = sc.nextInt();

            gioTen.add(tenSP.get(ma - 1));
            gioSoLuong.add(sl);
            gioGia.add(giaSP.get(ma - 1));

            System.out.println("Đã thêm vào giỏ hàng.");
        }

        int tongTien = 0;

        inGio(gioTen, gioSoLuong, gioGia, tongTien);

        System.out.print("Bạn muốn xóa mặt hàng số mấy khỏi giỏ? (0 để không xóa): ");
        int xoa = sc.nextInt();

        if (xoa > 0 && xoa <= gioTen.size()) {
            gioTen.remove(xoa - 1);
            gioSoLuong.remove(xoa - 1);
            gioGia.remove(xoa - 1);

            System.out.println("Đã xóa mặt hàng.");
        }

        inGio(gioTen, gioSoLuong, gioGia, tongTien);
    }
}
