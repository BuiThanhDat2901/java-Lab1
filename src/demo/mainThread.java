package demo;

import demo.entity.helperClass;

import java.util.Scanner;

public class mainThread {
    public static void main(String[] args) {
        helperClass tinh = new helperClass();

        // Lab 1: Tính lương tháng
        Scanner scanner= new Scanner(System.in);
        // Lab 1: Tính lương tháng
        System.out.println("Bài Lab1: Lương thưởng tháng 13 của một nhân viên.");
        System.out.println("Nhập số năm kinh nghiệm");
        int soNamKinhNghiem = scanner.nextInt();
        System.out.println("Nhập số năm cống hiến");
        double soNamCongHien = scanner.nextDouble();
        System.out.println("Lương tháng 13 là " + (tinh.tinhLuongThuongThang13(soNamKinhNghiem, soNamCongHien)) + "\n");

        // Lab 1.2: Viết chương trình tính nửa chu vi tam giác
        System.out.println("Lab 1.2: Tính nửa chu vi tam giác");
        System.out.println("Nhập cạnh a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập cạnh b: ");
        int b = scanner.nextInt();
        System.out.println("Nhập cạnh c: ");
        int c = scanner.nextInt();
        if (a <= 0 || b <= 0 || c <= 0){
            System.out.println("Độ dài một cạnh tam giác không thể nhỏ hơn hoặc bằng 0");
        }
        else if(a+b <=c || a+c <=b || b+c <=a){
            System.out.println("Tổng hai cạnh của một tam giác luôn phải lớn hơn cạnh còn lại (Theo bất đẳng thức tam giác)");
        }
        else{
            System.out.printf("Nửa Chu vi tam giác là:  %.2f \n \n", tinh.tinhNuaChuViTamGiac(a,b,c));
        }

        // Lab 1.3: Viết chương trình tìm số lớn nhất và nhỏ nhất trong một mảng các số nguyên
        int[] arr = {0, 1, 2, 5, 4, 3};
        System.out.println("Mảng là: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("\n");
        tinh.timMaxMin(arr);
    }
}