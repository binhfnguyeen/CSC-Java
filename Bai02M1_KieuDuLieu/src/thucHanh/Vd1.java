package thucHanh;

public class Vd1 {
	public static void main(String[] args) {
		int abc = 2;
		long so2 = 1666666;
		so2 = 1;
		final double PI = 3.14;
//		PI = 3;
		
		final double PI2 = Math.PI;
		
		int x = (int) Math.sqrt(9);
		
		System.out.println("Số " + abc);
		System.out.println(so2);
		System.out.println(PI2);
		
		// T = V + O (T: Data type, V: value, O: Operator) 
		
		int a = 9, b = 3, c = 2;
		
		int d = a / b;
		System.out.println("d = " + d);
		int e = a / c;
		System.out.println("e = " + e);
		float f = a / c; /* int/int --> int */
		System.out.println("f = " + f);
		float g = (float) a / c; /* float/int --> float */
		System.out.println("g = " + g);
		int du = a % c;
		System.out.println("du = " + du);
		int st = 880000;
		// đổi ra các tờ tiền 500000, 200000, 100000 và 50000
		int to500000 = st / 500000;
		int to200000 = (st % 500000) / 200000;
		int to100000 = (st%500000%200000) / 100000;
		int to50000 = (st %500000%200000%100000) / 50000;
		System.out.println("Tờ 500000: " + to500000);
		System.out.println("Tờ 200000: " + to200000);
		System.out.println("Tờ 100000: " + to100000);
		System.out.println("Tờ 50000: " + to50000);
		
	}
}
