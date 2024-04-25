package BaiTap.Bai_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class Test {
    static ArrayList<Sach> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void nhap(){
        Sach sach = new Sach();
        sach.input();
        list.add(sach);
    }
    public static void tieuDe(){
        System.out.printf("%-7s %-10s %-7s %-10s %-10s %-7s\n","ID", "Ten sach","Nam XB","The loai","Ten tg","Nam sinh");
    }
    public static void hienThi(){
        tieuDe();
        for (Sach sach : list) {
            sach.output();
        }
    }
    public static void timKiem(){
        String s;
        System.out.print("Ten sach muon tim: ");
        s = sc.nextLine();
        for (Sach sach : list) {
            if (sach.getName().contains(s)) sach.output();
        }
    }

    public  static void SortByAuthorASC(){
        // defaul ASC
        list.sort(Comparator.comparing(s -> s.getTacGia().getName().substring(0, 1).toLowerCase()));
    }
    public static void main(String[] args) {
        TacGia tg1 = new TacGia("Huyen 1",2003);
        TacGia tg2 = new TacGia("Eyen 2",2004);
        TacGia tg3 = new TacGia("Duyen 3",2005);
        Sach sach = new Sach("ten sach 1",2011,"Hai",tg1);
        Sach sach2 = new Sach("ten sach 2",2012,"Hai",tg2);
        Sach sach3 = new Sach("ten sach 3",2013,"Hai",tg3);
        list.add(sach);
        list.add(sach2);
        list.add(sach3);

        System.out.println("========Menu=========");
        System.out.println("1.Nhập vào thông tin cuốn sách");
        System.out.println("2. In ra thông tin các cuốn sách");
        System.out.println("3. Tìm kiếm sách theo tên");
        System.out.println("4. Sắp xếp lại các cuốn sách đã nhập theo tên tác giả");
        System.out.println("5. Thoát chương trình\n");
        int choice = 0;
        System.out.print("Nhap lua chon: ");
        choice = sc.nextInt();
        sc.nextLine();
        while (choice > 0 && choice < 5) {
            switch (choice) {
                case 1:
                    nhap();
                    break;
                case 2:
                     hienThi();
                     break;
                case 3:
                     timKiem();
                     break;
                case 4:
                    SortByAuthorASC();
                    break;
                default:
                    return;
            }
            System.out.println("--------------------");
            System.out.print("Nhap lua chon: ");
            choice = sc.nextInt();
            sc.nextLine();

        }
    }
}
