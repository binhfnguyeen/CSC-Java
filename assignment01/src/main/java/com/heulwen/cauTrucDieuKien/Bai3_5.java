package com.heulwen.cauTrucDieuKien;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Bai3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số kWh: ");
        int soKWh =  sc.nextInt();
        int soTien = 0;
        if (soKWh <= 50){
            soTien = soKWh*1806;
        } else if (soKWh <= 100){
            soTien = 50*1806 + (soKWh-50)*1866;
        } else if (soKWh <= 200){
            soTien = 50*1806 + 50*1866 + (soKWh-100)*2167;
        } else if (soKWh <= 300){
            soTien = 50*1806 + 50*1866 + 50*2167 + (soKWh-200)*2729;
        } else if (soKWh <= 400){
            soTien = 50*1806 + 50*1866 + 50*2167 + 50*2729 + (soKWh-300)*3050;
        } else
            soTien = 50*1806 + 50*1866 + 50*2167 + 50*2729 + 50*3050 + (soKWh-400)*3050;

        DecimalFormat df =  new DecimalFormat("###,###");
        System.out.println("Số tiền điện phải trả cho " + soKWh + " Kw là: " + df.format(soTien) + " VNĐ");
    }
}
