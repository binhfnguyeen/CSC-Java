package thucHanh;

public class Vd5 {

	public static void main(String[] args) {
		char c1 = 'B';
		Character c2 = 'C'; // Chứa địa chỉ của vùng nhớ
		int a = 1; // value
		Integer A = a; // Object
		
		String s1 = "Trung"; // Trung
		s1 += " tâm"; 		// Trung tâm
		s1 += " tin";		// Trung tâm tin
		s1 += " học";		// Trung tâm tin học --> 3 vùng nhớ rác --> bị GC
		System.out.println(s1); 
		
//		StringBuilder s2 = new StringBuilder(); // Object có 16 ký tự
//		StringBuilder s2 = new StringBuilder("abc"); // Object có "abc"
		StringBuilder s2 = new StringBuilder(5); // Object có 50 ký tự
		s2.append("Trung ");
		s2.append("tâm ");
		s2.append("tin ");
		s2.append("tin ");
		s2.append("học");
		// StringBuilder tự động tăng kích thước --> mất thời gian cấp phát
		System.out.println(s2); 
		s2.insert(5, ",");
		System.out.println(s2); 
		
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(", World!");
		System.out.println(sb); 
		sb.insert(7, "Java ");
		System.out.println(sb); 
		sb.replace(7, 12, "Python ");
		System.out.println(sb);
		sb.delete(7, 14);
		System.out.println(sb); 
		sb.reverse();
		System.out.println(sb); 
		System.out.println(sb.length());
		System.out.println(sb.toString()); 
		
	}

}
