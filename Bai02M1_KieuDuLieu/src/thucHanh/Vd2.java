package thucHanh;

public class Vd2 {
	public static void main(String[] args) {
		int c = 3;
		// c = c + 5;
		c += 5;
		System.out.println("c = " + c);
		c++;
		System.out.println("c = " + c);
		c--;
		System.out.println("c = " + c);
		int x = 3 + ++c;
		System.out.println("x = " + x);
		System.out.println("c = " + c);
	}
}
