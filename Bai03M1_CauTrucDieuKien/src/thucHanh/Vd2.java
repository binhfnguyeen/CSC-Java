package thucHanh;

import java.util.Scanner;

public class Vd2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Chọn phương tiện di chuyển (1 - Máy bay, 2 - Tàu hỏa, 3 - Xe khách):");
		int choice = sc.nextInt();
		double price = 0;
		String vehicle = "";
		switch (choice) {
		case 1:
			price = 2030000;
			vehicle = "Máy bay - hạng phổ thông giá rẻ";
			break;
		case 2:
			price = 375000;
			vehicle = "Tàu hỏa - ngồi mềm điều hòa";
			break;
		case 3:
			price = 295000;
			vehicle = "Xe khách - giường nằm";
			break;
		default:
			System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn từ 1 đến 3.");
			break;
		}
		
		System.out.print("Bạn đã chọn: " + vehicle + " với giá vé: " + price + " VND");
	}

}
