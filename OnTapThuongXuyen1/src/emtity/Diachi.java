package emtity;

public class Diachi {
	private int id;
	private int soDay;
	private int soTu;
	private int soPhong;
	private int tenPhong;
	// tự dộng tăng id
	private static int ID = 0;
	public Diachi() {
		id= ID++;
	}
	/**
	 * @param id
	 * @param soDay
	 * @param soTu
	 * @param soPhong
	 * @param tenPhong
	 */
	
	public Diachi(int id, int soDay, int soTu, int soPhong, int tenPhong) {
		
		this.id = ID++;
		this.soDay = soDay;
		this.soTu = soTu;
		this.soPhong = soPhong;
		this.tenPhong = tenPhong;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSoDay() {
		return soDay;
	}
	public void setSoDay(int soDay) {
		this.soDay = soDay;
	}
	public int getSoTu() {
		return soTu;
	}
	public void setSoTu(int soTu) {
		this.soTu = soTu;
	}
	public int getSoPhong() {
		return soPhong;
	}
	public void setSoPhong(int soPhong) {
		this.soPhong = soPhong;
	}
	public int getTenPhong() {
		return tenPhong;
	}
	public void setTenPhong(int tenPhong) {
		this.tenPhong = tenPhong;
	}
	public static int getID() {
		return ID;
	}
	public static void setID(int iD) {
		ID = iD;
	}
	@Override
	public String toString() {
		return "id=" + id + ", soDay=" + soDay + ", soTu=" + soTu + ", soPhong=" + soPhong + ", tenPhong="
				+ tenPhong ;
	}
	
	

}
