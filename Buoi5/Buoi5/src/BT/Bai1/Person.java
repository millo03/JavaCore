package BT.Bai1;

import java.util.Scanner;

public class Person {
    private String name;
    private Integer age;
    private Address address = new Address();

    public Person() {
    }

    public Person(String name, Integer age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public void  input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        this.name = sc.nextLine();
        System.out.print("Age: ");
        this.age = sc.nextInt();
        sc.nextLine();
        address.input();

    }

    public void output(){
        System.out.printf("%20s%20d%15s", getName(), getAge(), "");
        getAddress().output();
    }

    public static void title(){
        System.out.printf("%20s%20s%20s", "Name", "Age", "Address");
    }
}
