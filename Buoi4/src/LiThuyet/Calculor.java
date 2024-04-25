package LiThuyet;

public class Calculor {
    // Phương thức nạp chồng
    public  int add (int a, int b) {
        return a+b;
    }
    public float add (float a, float b) {
        return a+b;
    }

    public static void main(String[] args) {
        Calculor c = new Calculor();
        System.out.println(c.add(5,3));
        System.out.println(c.add(5.6f,3.7f));
    }
}
