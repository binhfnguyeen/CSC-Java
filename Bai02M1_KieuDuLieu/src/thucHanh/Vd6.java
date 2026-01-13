package thucHanh;

import java.util.Scanner;

public class Vd6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String hoTen;
		int tuoi;
		float chieuCao;
		System.out.println("Nhập tuổi: ");
		tuoi = scan.nextInt();
		scan.nextLine(); // Xóa ký tự enter trong vùng đệm
		System.out.println("Nhập họ tên: ");
		hoTen = scan.nextLine();
		System.out.println("Nhập chiều cao: ");
		chieuCao = scan.nextFloat();
		
		System.out.println(String.format("Họ tên: %s, Tuổi: %d, Chiều cao: %.2f", hoTen, tuoi, chieuCao));
	}

}
