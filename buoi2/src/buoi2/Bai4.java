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
public class Bai4 {
    public static void main(String[] args) {
        String s= "";
        System.out.println(""+s.length());
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        int[] flag = new int[255];
        s = s.toLowerCase();
        for(int i=0; i< s.length(); i++){
            flag[(int)s.charAt(i)] =1;
        }
        int sum =0;
        int sum2 =0;
        for(int i=0; i< flag.length; i++){
            if(i>54 && i< 123)sum += flag[i];
            else sum2+= flag[i];
        }
        System.out.println(sum);
        if(sum == 26&& sum2==0) System.out.println("Yes");
        else System.out.println("No");
    }
}