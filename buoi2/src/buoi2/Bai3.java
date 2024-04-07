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
public class Bai3 {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        int c=0;
        int n=0;
        int k=0;
        for(int i=0; i< s.length(); i++){
            if(Character.isAlphabetic(s.charAt(i))) c++;
            else if(Character.isDigit(s.charAt(i))) n++;
            else k++;
        }
        System.out.println(c+"  "+n+"   "+k);
    }
}
