/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_1;


/**
 *
 * @author doh59
 */
public class Bai2 {
    public static void tranfer(int a, int heSo){
        String s = "";
        if(heSo>1&& heSo<10){
            while (a>0){
               s +=String.valueOf(a%heSo);
                a = a/heSo;
            }
        }else{
            while (a>0){
                int c= a%heSo;
                if(c == 10) s +="A";
                if(c == 11) s +="B";
                if(c == 12) s +="C";
                if(c == 13) s +="D";
                if(c == 14) s +="E";
                if(c == 15) s +="F";
                if(c >=0 && c <=9)   s+= s.valueOf(c);
                a = a/heSo;
            }
        }
        
        //hien thi nguoc laij
        for(int i = s.length()-1; i>=0; i--){
            System.out.print(s.charAt(i));
        }
        
    }
    public static void main(String[] args) {
        tranfer(26, 16);
    }
}
