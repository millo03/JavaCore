/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_1;

import java.util.Scanner;

/**
 *
 * @author doh59
 */
public class Bai4 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a = ");
        a= sc.nextInt();
        System.out.print("Nhap b = ");
        b= sc.nextInt();
        System.out.println("Tong = "+ (a+b));
        System.out.println("Hieu = "+ (a-b));
        System.out.println("Tich = "+ (a*b));
        if(b==0){
            System.out.print("Nhap lai b = ");
            b= sc.nextInt();
        }else
            System.out.printf("Thuong = %.3f\n",(1.0*a/b));
    }
    
}
