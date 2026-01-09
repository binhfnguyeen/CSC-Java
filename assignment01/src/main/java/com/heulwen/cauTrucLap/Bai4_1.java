package com.heulwen.cauTrucLap;

import java.util.Scanner;

public class Bai4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một chuỗi: ");
        String str = sc.nextLine();

        char[] chars = str.toCharArray();

        int i=0;
        int chuCai = 0, chuSo = 0, kyTuTrang = 0, kyTuDacBiet = 0;
        while (i < chars.length) {
            if (Character.isLetter(chars[i])) {
                chuCai++;
            } else if (Character.isDigit(chars[i])) {
                chuSo++;
            } else if (Character.isWhitespace(chars[i])) {
                kyTuTrang++;
            } else
                kyTuDacBiet++;
            i++;
        }

        System.out.println("Letters: " + chuCai);
        System.out.println("Digits: " + chuSo);
        System.out.println("Spaces: " + kyTuTrang);
        System.out.println("Special characters: " + kyTuDacBiet);
    }
}
