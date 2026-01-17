package com.heulwen.thucHanh;

import java.util.Arrays;
import java.util.Scanner;

public class Vd1 {
    public static void main(String[] args) {
        double[] a = {1.2, 3.5, 5.3};
        double[] b = new double[4];
        for(int i=0; i<a.length; i++)
            b[i] = a[i];
        System.out.print("Xuất mảng b theo chuỗi ");
        System.out.println(Arrays.toString(b));

        double[] c = Arrays.copyOf(a, 4);
        System.out.print("Xuất mảng c theo chuỗi ");
        System.out.println(Arrays.toString(c));

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị cần tìm:");
        double gtTim = sc.nextDouble();

        int chiSo = Arrays.binarySearch(c, gtTim);
        System.out.printf("Chỉ số tìm thấy giá trị %.1f là: %d%n", gtTim, chiSo);
        if (chiSo > 0){
            System.out.printf("Tìm thấy phần tử %.1f trong mảng c%n", gtTim);
        } else {
            System.out.printf("Không tìm thấy phần tử %.1f trong mảng c%n", gtTim);
        }

        System.out.println("Gán tất cả các phần tử trong mảng a với giá trị 1");
        Arrays.fill(a, 1);
        System.out.println("Xuất mảng a " + Arrays.toString(a));

        System.out.println("So sánh hai mảng có bằng nhau hay không");
        if (Arrays.equals(b, c)) {
            System.out.println("Mảng b bằng mảng c");
        } else {
            System.out.println("Mảng b không bằng mảng c");
        }
    }
}
