package entity;

public class HoSo {
    // Tạo class địa chỉ trước r tạo class hồ sơ
    private int id;
    private String name;
    private DiaChi diaChi = new DiaChi();
    private String soDT;

    // sinh tự động id
    private static int ID=0;
    public HoSo() {
        ID = ID+1;
        this.id =ID;
        soDT = soDT;
     }

    public HoSo( String name, DiaChi diaChi, String soDT) {
        ID = ID+1;
        this.id =ID;
        this.name = name;
        this.diaChi = diaChi;
        this.soDT = soDT;
    }
    // set get

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DiaChi getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(DiaChi diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    @Override
    public String toString() {
        return  String.valueOf(id) + "," + name + ',' +diaChi +soDT + '\n';
    }
}
