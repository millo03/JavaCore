/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi2;

//import java.util.HashMap;

import java.util.HashMap;
import java.util.Scanner;



public class Bai1_HashMap {

    static HashMap<Integer, Integer> map = new HashMap<>();
    public static void Count1(int[] a){
       // HashMap<Integer,Integer> map =new HashMap();
        Scanner sc = new Scanner(System.in);
        
        
         for(int i=0; i< a.length; i++){
             if(map.containsKey(a[i])){// kiểm tra xem a[i] có trong key ko
                 int key = map.get(a[i]);// lấy giá trị hiện tại của key a[i]
                 key++;
                 map.put(a[i],key);
             }else{
                 map.put(a[i],1);
             }
         }
    }
    public static void HienThi() {
        map.forEach((keyInt, valueInt)-> System.out.println("Key = "+ keyInt +", value = "+ valueInt));
        
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3, 3, 3, 9, 9,9, 9};
        Count1(a);
        HienThi();
    }
    
}
