package BaiTap.Bai_2;

public class May {
    private int maM;
    private String kieuMay;
    private String tinhTrang;

    public May() {
    }

    public May(String kieuMay, int maM, String tinhTrang) {
        this.kieuMay = kieuMay;
        this.maM = maM;
        this.tinhTrang = tinhTrang;
    }

    public int getMaM() {
        return maM;
    }

    public void setMaM(int maM) {
        this.maM = maM;
    }

    public String getKieuMay() {
        return kieuMay;
    }

    public void setKieuMay(String kieuMay) {
        this.kieuMay = kieuMay;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Override
    public String toString() {
        return toString().formatted("%-10d %-10s %-10s", kieuMay, maM, tinhTrang);
    }
}
