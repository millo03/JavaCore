/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi2;

/**
 *
 * @author doh59
 */
public class Bai1_Cach2 {

    /**
     *
     * @param args
     */
//    public static void main(String[] args) {
//        System.out.println("Helll");
//    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3, 3, 3, 9, 9,9, 9};
        boolean[] flag= new boolean[10];
        for(int i =0; i< a.length; i++){
            int value = 1; flag[i] =false;
            for(int j=1; j< a.length; j++){
                if(i!= j && a[i] == a[j]) {
                    value++;
                    a[j]=0;
                }
            }
            if(a[i]!=0) System.out.println(a[i]+"  "+ value);
        }
        
    }
    
}
