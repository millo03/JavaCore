package entity;

public class DiaChi {
    private String xaPhuong;
    private String quanHuyen;
    private String thanhPhoTinh;

    public DiaChi() {
    }

    public DiaChi(String xaPhuong, String quanHuyen, String thanhPhoTinh) {
        this.xaPhuong = xaPhuong;
        this.quanHuyen = quanHuyen;
        this.thanhPhoTinh = thanhPhoTinh;
    }

    public String getXaPhuong() {
        return xaPhuong;
    }

    public void setXaPhuong(String xaPhuong) {
        this.xaPhuong = xaPhuong;
    }

    public String getQuanHuyen() {
        return quanHuyen;
    }

    public void setQuanHuyen(String quanHuyen) {
        this.quanHuyen = quanHuyen;
    }

    public String getThanhPhoTinh() {
        return thanhPhoTinh;
    }

    public void setThanhPhoTinh(String thanhPhoTinh) {
        this.thanhPhoTinh = thanhPhoTinh;
    }

    @Override
    public String toString() {
        return  xaPhuong + ',' + quanHuyen + ',' + thanhPhoTinh + ',' ;
    }
}
