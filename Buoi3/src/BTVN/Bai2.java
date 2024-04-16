package BTVN;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Bai2 {
    public static void InsertSubject(ArrayList <Subject> subjeccs) {
        Scanner sc = new Scanner(System.in);
        Subject s = new Subject();
        System.out.print("Nhap ten mon: ");
        s.setName(sc.nextLine());
        System.out.print("Nhap só học sinh: ");
        s.setStudentCount(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap thoi gian bat dau: ");
        s.setLimeStart(sc.nextLine());
        System.out.print("Nhap thoi gian ket thuc: ");
        s.setLimeEnd(sc.nextLine());
        subjeccs.add(s);
    }
    public  static void Title(){
        System.out.printf("%-5s %-15s %-15s %-20s\n","ID","Subject name","Student count","Time start-end");
    }
    public static void Display(ArrayList <Subject> subjects) {
        if(!subjects.isEmpty()) {
            Title();
            for (Subject s : subjects) {
               // System.out.print(s.toString());
                s.display();
            }
        }else System.out.println("Empty List");
    }
    public static void sortByTimeEndASC(ArrayList <Subject> subjects) {
        Collections.sort(subjects, new Comparator<Subject>() {
            public int compare(Subject o1, Subject o2) {
                String s = o1.getLimeEnd().substring(0,2);
                int i = Integer.parseInt(s);
                String s1= o2.getLimeEnd().substring(0,2);
                int i1 = Integer.parseInt(s1);
                return Integer.compare(i,i1);
            }
        });
    }

    public static void main(String[] args) {
        ArrayList<Subject> subjects = new ArrayList<>();
        Subject s = new Subject("Android dwv",12,"14:00","17:00");
        Subject s1 = new Subject("Android dev1",12,"14:00","16:00");
        Subject s2= new Subject("Android dwv2",12,"14:00","15:00");
        Subject s3 = new Subject("Android dwv3",12,"14:00","13:00");
        subjects.add(s);
        subjects.add(s1);
        subjects.add(s2);
        subjects.add(s3);

        Display(subjects);
        sortByTimeEndASC(subjects);
        Display(subjects);
    }
}
