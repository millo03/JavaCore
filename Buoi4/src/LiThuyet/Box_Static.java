package LiThuyet;

public class Box_Static {
    private static String subject;
    // lap chồng overloading
    // kết tập HAS-A
    // gọi lần lượt từng khối staic 1
    static {
        System.out.println("Khối static được gọi");
    }
    static {
        System.out.println("---2-----");
    }
    // gán lại giá trị cho biển
    static {
        subject = "Khối static (static blocks)";// bị khối sau đè lên
    }
    static {
        subject = "---3-----";
    }

    Box_Static () {
        System.out.println("hàm main() được gọi");
        System.out.println("Subject = " + subject);
    }

    public static void main(String[] args) {
        Box_Static ex1 = new Box_Static();
    }
}

