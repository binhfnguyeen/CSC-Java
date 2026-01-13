package thucHanh;

import java.util.Scanner;

public class Vd3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tháng 1-12:");
		int month = sc.nextInt();
		String season = switch (month) {
			case 12, 1, 2 -> "Mùa đông";
			case 3, 4, 5 -> "Mùa xuân";
			case 6, 7, 8 -> "Mùa hạ";
			case 9, 10, 11 -> "Mùa thu";
			default -> "Tháng không hợp lệ!";
		};
		System.out.println("Mùa tương ứng: " + season);
	}
}
