package BaiTap.Bai_1;

import java.util.Scanner;

public class TacGia {
    private String name;
    private int namSinh;

    public TacGia(String name, int namSinh) {
        this.name = name;
        this.namSinh = namSinh;
    }

    public TacGia() {
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ten tac gia: ");
        this.name = sc.nextLine();
        System.out.print("Nam sinh: ");
        this.namSinh = sc.nextInt();
        sc.nextLine();
    }
    public void output(){
        System.out.printf("%-10s %-7d\n", name,namSinh);
    }
}
