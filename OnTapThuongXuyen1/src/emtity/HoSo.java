package emtity;

public class HoSo {
	private int maHoSo;
	private String tenHS;
	private Diachi diaChi;
	
	public HoSo() {
		diaChi = new Diachi();
	}

	/**
	 * @param maHoSo
	 * @param tenHS
	 * @param diaChi
	 */
	public HoSo(int maHoSo, String tenHS, Diachi diaChi) {
	
		this.maHoSo = maHoSo;
		this.tenHS = tenHS;
		diaChi = new Diachi();
		this.diaChi = diaChi;
	}
	

	public int getMaHoSo() {
		return maHoSo;
	}

	public void setMaHoSo(int maHoSo) {
		this.maHoSo = maHoSo;
	}

	public String getTenHS() {
		return tenHS;
	}

	public void setTenHS(String tenHS) {
		this.tenHS = tenHS;
	}

	public Diachi getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(Diachi diaChi) {
		this.diaChi = diaChi;
	}

	@Override
	public String toString() {
		return "HoSo [maHoSo=" + maHoSo + ", tenHS=" + tenHS + ", diaChi: " + diaChi + "]";
	}
	

}
