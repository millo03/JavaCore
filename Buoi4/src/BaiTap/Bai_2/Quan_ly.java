package BaiTap.Bai_2;

public class Quan_ly {
    private int maQL;
    private String tenQL;

    public Quan_ly() {
    }

    public Quan_ly(int maQL, String tenQL) {
        this.maQL = maQL;
        this.tenQL = tenQL;
    }

    public String getTenQL() {
        return tenQL;
    }

    public void setTenQL(String tenQL) {
        this.tenQL = tenQL;
    }

    public int getMaQL() {
        return maQL;
    }

    public void setMaQL(int maQL) {
        this.maQL = maQL;
    }

    @Override
    public String toString() {
        return toString().formatted("%-10d %-10s", maQL, tenQL);
    }
}
