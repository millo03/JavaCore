package BTVN;

import java.util.*;

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
        subjects.sort((o1, o2) -> {
            String s = o1.getLimeEnd().substring(0, 2);
            int i = Integer.parseInt(s);
            String s1 = o2.getLimeEnd().substring(0, 2);
            int i1 = Integer.parseInt(s1);
            return Integer.compare(i, i1);
        });
    }

    public static void SelectSubjectByTime(ArrayList <Subject> subjects) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Thơi gian bắt đầu: ");
        String timeStart = sc.nextLine();
        System.out.print("Thơi gian kết thúc: ");
        String timeEnd = sc.nextLine();
        subjects.forEach((o1)->{
            if (Integer.parseInt(o1.getLimeStart().substring(0, 2)) > Integer.parseInt(timeStart.substring(0, 2)) &&
                    Integer.parseInt(o1.getLimeEnd().substring(0, 2)) < Integer.parseInt(timeEnd.substring(0, 2)))
            System.out.print(o1);
        });

    }

    public static void main(String[] args) {
        ArrayList<Subject> subjects = new ArrayList<>();
        Subject s = new Subject("Android dwv",12,"14:00","17:00");
        Subject s1 = new Subject("Android dev1",12,"14:00","16:00");
        Subject s2= new Subject("Android dwv2",12,"14:00","15:00");
        Subject s3 = new Subject("Android dwv3",12,"14:00","18:00");
        subjects.add(s);
        subjects.add(s1);
        subjects.add(s2);
        subjects.add(s3);

        // tạo menu
        Scanner sc = new Scanner(System.in);
        System.out.println("=================Menu================");
        System.out.println("1.Thêm 1 tiết học mới");
        System.out.println("2. Hiển thi ds");
        System.out.println("3. Sắp xếp môn học");
        System.out.println("4. Lựa chọn môn học");
        System.out.println("5. Thoát!");
        System.out.println("");
        int choice = 0;
        System.out.print("Nhap lua chon: ");
        choice = sc.nextInt();
        sc.nextLine();
        while (choice>0 && choice <5 ){
            switch (choice){
                case 1:
                    InsertSubject(subjects);
                    break;
                case 2:
                    Display(subjects);
                    break;
                case 3:
                    sortByTimeEndASC(subjects);
                    break;
                case 4:
                    SelectSubjectByTime(subjects);
                    break;
                default:
                    return;
            }
            System.out.println("------------------------------");
            System.out.print("Nhap lua chon: ");
            choice= sc.nextInt();
            sc.nextLine();

        }

//        Display(subjects);
//        //sortByTimeEndASC(subjects);
//        SelectSubjectByTime(subjects);
//        //Display(subjects);
    }
}
