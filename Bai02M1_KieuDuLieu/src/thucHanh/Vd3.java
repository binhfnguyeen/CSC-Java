package thucHanh;

public class Vd3 {
	public static void main(String[] args) {
		char c = 'A'; // Ký tự dùng dấu nháy đơn
		String x = "abc"; // Chuỗi dùng dấu nháy đôi
		String y = "a"; // Chuỗi dùng dấu nháy đôi
		
		if (Character.isDigit(c))
			System.out.println("Ký tự c là số");
		else
			System.out.println("Ký tự c không phải là số");
		
		
		System.out.println("Chiều dài ký tự chuỗi x là " + x.length());
		System.out.println("Ký tự thứ 2 trong chuỗi x là " + x.charAt(1)); // ký tự tại chỉ số 1
		
	}
}
