package com.com.kieutachbien;
import java.util.Scanner;
public class kiemtra {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap nam can kiem tra:");
        int nam=scanner.nextInt();
        boolean isnam=false;
        boolean isnam4=nam%4==0;
        if (isnam4){
            boolean isnam100=nam%100==0;
            if (isnam100){
                boolean isnam400=nam%400==0;
                if (isnam400){
                    isnam=true;
                }
            }else {
                isnam=true;
            }
        }
        if (isnam){
            System.out.println(nam+" .la nam nhuan");
        }else {
            System.out.println(nam+" .khong phai nam nhuan");
        }
    }

}
