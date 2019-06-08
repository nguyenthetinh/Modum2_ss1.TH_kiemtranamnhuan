package com.kiemtranamnhuan;
import java.util.Scanner;
public class kiemtra {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap so nam can kiem tra:");
        int nam=scanner.nextInt();
        if (nam %4==0){
            if (nam%100==0){
                if (nam%400==0){
                    System.out.println(nam+" .la nam nhuan");
                }else {
                    System.out.println(nam+" .khong phai nam nhuan");
                }
            }else {
                System.out.println(nam+" .la nam nhuan");
            }
        }else {
            System.out.println(nam+"  .khong phai nam nhuan");
        }
    }
}
