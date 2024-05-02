package BT.Bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import static java.util.Collections.*;

public class ClassRoom {
    static ArrayList<Student> sts = new ArrayList<>();
    public static void input(){
        Student s = new Student();
        s.input();
        sts.add(s);
    }
    public static void output(){
        System.out.println("\n<=====================DISPLAY LIST STUDENT========================>");
        Student.title();
        for(Student x: sts)
            x.output();
    }
    public static void sortByGPA_ASC(){
        // cachs 1
//        sort(sts, new Comparator<Student>() {
//            public int compare(Student s1, Student s2) {
//                return Float.compare( s1.getGpa(),s2.getGpa());
//            }
//        });
        //cach2
        sts.sort((s1,st2)->Float.compare(s1.getGpa(),st2.getGpa())
        );
    }

    // xoa theo ID
    public static void DeleteByID(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        for(Student x: sts){
            if(x.getId() == id){
                System.out.println("------1----");
                sts.remove(x);
                return;
            }

        }
    }

    public static void main(String[] args) {
        input();
        input();
        output();
        sortByGPA_ASC();
        DeleteByID();
        output();

    }
}
