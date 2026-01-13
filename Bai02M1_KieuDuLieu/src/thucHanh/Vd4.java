package thucHanh;

public class Vd4 {
	public static void main(String[] args) {
		// Cắt chuỗi: substring(start, end) the length of the substring is endIndex-beginIndex
		String ht = "Châu Bình Nguyên";
		String ho = ht.substring(0, 4);
		System.out.println("Họ là: " + ho);
		String ten = ht.substring(10);
		System.out.println("Tên là: " + ten);
		String lot = ht.substring(5, 9);
		System.out.println("Lót là: " + lot);
		
		int chiSoU = ht.indexOf('u');
		System.out.println("Chỉ số ký tự 'u' là " + chiSoU);
		
		ho = ht.substring(0, ht.indexOf(' '));
		System.out.println("Họ là: " + ho);
		ten = ht.substring(ht.lastIndexOf(' '));
		System.out.println("Tên là: " + ten);
		lot = ht.substring(ht.indexOf(' '), ht.lastIndexOf(' '));
		System.out.println("Lót là: " + lot);
		
		if (ht.contains("Châu"))
			System.out.println("Có");
		else {
			System.out.println("Không");
		}
		
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println(str1.equals(str2) ? "Equals" : "Not equals");
		
		int cs = ht.indexOf("Bình");
		System.out.println("Chỉ số của 'Bình': " + cs);
		lot = lot.trim();
		if (lot.equalsIgnoreCase("bìNH"))
			System.out.println("Hai chuỗi bằng nhau");
		else 
			System.out.println("Hai chuỗi không bằng nhau");
		
	}
}
