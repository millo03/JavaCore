/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi2;

import java.util.Scanner;

/**
 *
 * @author doh59
 */
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: " );
        int n = sc.nextInt();
        int[] a = new int[n];
        // nhap mang
        for(int i=0; i< n; i++){
            a[i] = sc.nextInt();
        }
        System.out.print("Nhap l: " );
        int l= sc.nextInt();
        System.out.print("Nhap r: " );
        int r=sc.nextInt();
        while(l>r|| l<1|| r> a.length){
            System.out.print("Nhap lại l: " );
            l= sc.nextInt();
            System.out.print("Nhap lại r: " );
            r= sc.nextInt();   
        }
        // cong cac phan tu tu vi tri l den r
        int sum =0;
        for(int i= l-1; i<= r-1;i++){
            sum+= a[i];
        }
        System.out.println(sum);
    }
}
