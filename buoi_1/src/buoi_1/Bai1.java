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
public class Bai1 {
    public static int UCLN(int a, int b){
       if(b== 0) return a;
       return UCLN(b,a%b);
    }
    public static int BCNN(int a, int b){
        for(int i = Math.max(a, b); i<=a*b; i++)
            if(i%a==0 &&i%b==0) return i;
        
        return 0;
    }
    public static void main(String[] args) {
        // UCLL cua 3 số
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a = "); a = sc.nextInt();
        System.out.print("Nhap b = "); b = sc.nextInt();
        System.out.print("Nhap c = "); c = sc.nextInt();
        System.out.println("UCLN: " + UCLN(UCLN(a,b),c));
        System.out.println("BCNN: "+ BCNN(BCNN(a,b),c));
    }
}
