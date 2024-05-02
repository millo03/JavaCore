package BT.Bai1;

import java.util.Scanner;

public class Student extends Person{
    private int id;
    private String nameClass;
    private float gpa;
    private final float criteria = 2;// tieu chuan

    private  static  int ID = 0;
    public Student() {
        ID = ID+1;
        this.id = ID;
    }

    public Student(String name, Integer age, Address address, String nameClass, float gpa) {
        super(name, age, address);
        ID = ID+1;
        this.id = ID;
        this.nameClass = nameClass;
        this.gpa = gpa;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public float getCriteria() {
        return criteria;
    }

    public int getId() {
        return id;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Name class: ");
        nameClass = sc.nextLine();
        System.out.print("GPA: ");
        gpa = sc.nextFloat();
        sc.nextLine();
    }
    public boolean checkFall(){
        return this.gpa < criteria? true:false;
    }


    public void output(){
        super.output();
        System.out.printf("%20d%20s%20f%20s\n", getId(), getNameClass(), getGpa(),checkFall());
    }

    public static void title(){
        Person.title();
        System.out.printf("%20s%20s%20s%20s%n", "Id", "Name Class", "Gpa", "increase class");
    }

}
