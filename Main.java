package baiTapCodegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu rong");
        double width = scanner.nextDouble();
        System.out.println("Nhap chieu dai");
        double height = scanner.nextDouble();
        HinhChuNhat hcn1 = new HinhChuNhat(width, height);
        System.out.println("dien tich hinh chu nhat la " + hcn1.getDienTich());
        System.out.println("chu vi hinh chu nhat la " + hcn1.getChuVi());
        System.out.println(hcn1.display());
    }
}
