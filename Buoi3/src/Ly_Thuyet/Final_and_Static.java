package Ly_Thuyet;

public class Final_and_Static {
    /*
    - STATIC:
    + Thuộc tiính static ko cần gọi đối tượng có thể truy cập được trong lớp đó trù pricate
    + method static: gọi được trục tiếp trong lớp luôn
                    Ko sử dụng được this và super
                    ko ghi đè được method static

    * */
    private static String subject;

    static {
        System.out.println("Khối static được gọi");
    }

    static {
        subject = "Khối static (static blocks)";
    }

    Final_and_Static () {
        System.out.println("hàm main() được gọi");
        System.out.println("Subject = " + subject);
    }

    public static void main(String[] args) {
        Final_and_Static ex1 = new Final_and_Static();
    }
    //Mảng
    // Khai bải
    Car[] cars = new Car[10];


}
