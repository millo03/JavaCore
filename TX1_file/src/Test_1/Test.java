package Test_1;

import entity.DiaChi;
import entity.HoSo;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Test {
    public  static void AddHS(ArrayList<HoSo> alhs){
        Scanner sc = new Scanner(System.in);
        HoSo hsm = new HoSo();
        System.out.print("Ho va ten: ");
        hsm.setName(sc.nextLine());
       // System.out.print("Dia chi: ");
        DiaChi dcm = new DiaChi();
        System.out.print("Xa/Phuong: ");
        dcm.setXaPhuong(sc.nextLine());
        System.out.print("Quan/Huyen: ");
        dcm.setQuanHuyen(sc.nextLine());
        System.out.print("Thanh pho/ tinh: ");
        dcm.setThanhPhoTinh(sc.nextLine());
        hsm.setDiaChi(dcm);
        System.out.print("So DT: ");
        hsm.setSoDT(sc.nextLine());
        // them vao mag
        alhs.add(hsm);
    }
    public static void Display(ArrayList<HoSo> alhs){
        for(HoSo hsm : alhs){
            System.out.print(hsm.toString());
        }
    }
    public static void Write_File(FileWriter fw , ArrayList<HoSo> alhs){

//        // ghi vao file
        try {
            for (HoSo hsm : alhs) {
                fw.write(hsm.toString());
            }
        } catch (IOException e) {
            System.out.println("Ko the ghi vao file");
            throw new RuntimeException(e);
        }
    }


    public static void FindByID_HoTen_SDT(ArrayList<HoSo> alhs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ko muốn tìm nhập 0");
        System.out.print("ID muốn tím: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Ho Ten muốn tím: ");
        String name = sc.nextLine();
        System.out.print("SDT muốn tím: ");
        String sdt = sc.nextLine();
        //System.out.println("id= "+ id+",sdt= "+sdt);
        // trường hợp id !null
        if(id!= 0 || sdt !="0"){
            for(HoSo hsm : alhs){
                if(hsm.getId() == id){
                    System.out.println(hsm.toString());
                    break;
                }
//                if(hsm.getName().equals(name)){
//                    System.out.println("Ko có");
//                }
                if(hsm.getSoDT().equals(sdt)){
                    System.out.print(hsm.toString());
                    break;
                }
            }
        }
        if(name != null){
            boolean flag =true;
            for(HoSo hsm : alhs){
                if(hsm.getName().contains(name) == true){
                    System.out.print(hsm.toString());
                    flag= false;
                }
            }
            if (flag) System.out.println("Ko có ai ten vậy");
        }

    }

    public static void ModifyByID(ArrayList<HoSo> alhs){
        Scanner sc = new Scanner(System.in);
        System.out.print("ID= ");
        int id = sc.nextInt();
        sc.nextLine();
        for(HoSo hsm : alhs){
            if(hsm.getId() == id){
                System.out.print("Ho va ten: ");
                hsm.setName(sc.nextLine());
                // System.out.print("Dia chi: ");
                DiaChi dcm = new DiaChi();
                System.out.print("Xa/Phuong: ");
                dcm.setXaPhuong(sc.nextLine());
                System.out.print("Quan/Huyen: ");
                dcm.setQuanHuyen(sc.nextLine());
                System.out.print("Thanh pho/ tinh: ");
                dcm.setThanhPhoTinh(sc.nextLine());
                hsm.setDiaChi(dcm);
                System.out.print("So DT: ");
                hsm.setSoDT(sc.nextLine());
            }
        }
    }

    public static void DeleteByID(ArrayList<HoSo> alhs){
        Scanner sc = new Scanner(System.in);
        System.out.print("ID= ");
        int id = sc.nextInt();
        sc.nextLine();
        alhs.remove(id-1);
    }
    public static void SortByName(ArrayList<HoSo> alhs){
        Collections.sort(alhs, new Comparator<HoSo>() {
            @Override
            public int compare(HoSo o1, HoSo o2) {
                return String.valueOf(o1.getName().charAt(0)).compareTo(String.valueOf(o2.getName().charAt(0)));
            }
        });
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<HoSo> alhs = new ArrayList<>();
        DiaChi dc1= new DiaChi("Thái hoc1","Bình Giang", "Hải dương");
        DiaChi dc2= new DiaChi("Thái hoc2","Bình Giang", "Hải dương");
        DiaChi dc3= new DiaChi("Thái hoc3","Bình Giang", "Hải dương");

        HoSo hs1= new HoSo("cuyen",dc1,"0123456789");
        HoSo hs2= new HoSo("auyen2",dc2,"2123456789");
        HoSo hs3= new HoSo("buyen3",dc3,"3123456789");
        alhs.add(hs1);
        alhs.add(hs2);
        alhs.add(hs3);

        System.out.println("=============Menu=============");
        System.out.println("1.Tìm kiếm đối tượng theo: Họ và tên, Số ĐT, ID");
        System.out.println("2.Sửa thông tin của đối tượng (được tìm kiếm theo ID)");
        System.out.println("3.Xóa đối tượng (được tìm kiếm theo ID)");
        System.out.println("4.Sắp xếp danh sách đối tượng theo Tên.");
        System.out.println("5.Thêm đối tượng vào file dữ liệu;");
        System.out.println("6.Hiển thị");
        System.out.println("Bấm bất kì nút nào để thoát trừ phím 1->6");
        System.out.println("==============================");
        System.out.print("Nhập lựa chọn: ");

        int choice = sc.nextInt();
        sc.nextLine();
        while (choice > 0 && choice < 7){
            switch (choice){
                case 1:
                    FindByID_HoTen_SDT(alhs);
                    break;
                case 2:
                    ModifyByID(alhs);
                    break;
                case 3:
                    DeleteByID(alhs);
                    break;
                case 4:
                    SortByName(alhs);
                    break;
                case 5:
                    try {
                        FileWriter fw = new FileWriter("kq.txt");
                        fw.write("Dữ liêu vừa đươc them: \n");
                        Write_File(fw,alhs);
                        fw.close();

                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 6:
                    Display(alhs);
                    break;
                default:
                    return;

            }
            System.out.println("-----------------------------------");
            System.out.print("NHap tiep lua chon: ");
            choice = sc.nextInt();
            sc.nextLine();
        }


    }
}
