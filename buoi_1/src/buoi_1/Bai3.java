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
public class Bai3 {
    //tính tích
    public static int Tich(int a){
        int tich=1;
       // int dem = String.valueOf(a).length();
        while (a>0){
            tich *= a%10;
            a =a/10;
        }
        return tich;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a = ");
        int a = sc.nextInt();
        System.out.println("Tich: "+Tich(a));
    }
          
}
