package BaiTap.Bai_1;

import java.util.Scanner;

public class Sach {
    private  int id;
    private String name;
    private int namXuatBan;
    private String theLoai;
    private TacGia tacGia= new TacGia();
     private static int ID= 0;

    public Sach() {
        ID = ID+1;
        this.id = ID;
    }

    public Sach( String name, int namXuatBan, String theLoai, TacGia tacGia) {
        ID = ID+1;
        this.id = ID;
        this.name = name;
        this.namXuatBan = namXuatBan;
        this.theLoai = theLoai;
        this.tacGia = tacGia;
    }

    public TacGia getTacGia() {
        return tacGia;
    }

    public void setTacGia(TacGia tacGia) {
        this.tacGia = tacGia;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ten sach: ");
        name = sc.nextLine();
        System.out.print("Nam xuat ban: ");
        namXuatBan = sc.nextInt();
        sc.nextLine();
        System.out.print("The loai: ");
        theLoai = sc.nextLine();
        tacGia.input();
    }
    public void output() {
        System.out.format("%-7s %-10s %-7d %-10s ",id,name,namXuatBan, theLoai);
        tacGia.output();
    }
}
