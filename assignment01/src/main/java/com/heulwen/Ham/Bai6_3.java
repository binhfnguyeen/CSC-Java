package com.heulwen.Ham;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai6_3 {
    public static ArrayList<String> tachTu(String cau){
        String[] tach = cau.split("\\s+");
        ArrayList<String> ds = new ArrayList<>();
        for (String tu: tach){
            tu = tu.replaceAll("[.,?!;:\"']", "");
            if (!tu.isEmpty()){
                ds.add(tu.toLowerCase());
            }
        }
        return ds;
    }

    public static ArrayList<String> dsTuDuyNhat(ArrayList<String> ds){
        ArrayList<String> listUnique = new ArrayList<>();

        for (int i = 0; i < ds.size() - 1; i++){
            if (listUnique.contains(ds.get(i))){
                continue;
            }
            listUnique.add(ds.get(i));
        }

        return listUnique;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập câu: ");
        String cau = sc.nextLine();

        ArrayList<String> ds = dsTuDuyNhat(tachTu(cau));

        System.out.println("Danh sách từ duy nhất: ");

        for (int i = 0; i < ds.size(); i++){
            if (i == ds.size() - 1 ){
                System.out.printf("%s%n", ds.get(i));
            } else
                System.out.printf("%s, ", ds.get(i));
        }
    }
}
