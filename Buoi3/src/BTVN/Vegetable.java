package BTVN;

public class Vegetable {
	private String id;
	private String name;
	private String unit;
	private int quantitySold;
	private int sale;
	private double price;
	/**
	 * 
	 */
	private static int ID =0;
	public Vegetable() {
		ID = ID + 1;
		this.id = String.valueOf(ID);
	}
	/**
	 * @param id
	 * @param name
	 * @param unit
	 * @param quantitySold
	 * @param sale
	 * @param price
	 */
	public Vegetable( String name, String unit, int quantitySold, int sale, double price) {
		ID = ID+1;
		this.id = String.valueOf(ID);
		this.name = name;
		this.unit = unit;
		this.quantitySold = quantitySold;
		this.sale = sale;
		this.price = price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public int getQuantitySold() {
		return quantitySold;
	}
	public void setQuantitySold(int quantitySold) {
		this.quantitySold = quantitySold;
	}
	public int getSale() {
		return sale;
	}
	public void setSale(int sale) {
		this.sale = sale;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTotalRevenue() {
		return 1.0*quantitySold*(price- price*sale/100);
	}
	public void Format() {
		System.out.printf("̀%-6s %-15s %-10s %-15d %-8d %-10.2f %-10.2f\n",this.id,this.name, this.unit, this.quantitySold, this.sale,this.price,getTotalRevenue());
		
	}
	public void setVegetable(Vegetable v) {
        id = v.getId();
        name = v.getName();
        unit = v.getUnit();
        quantitySold = v.getQuantitySold();
        sale = v.getSale();
        price = v.getPrice();
    }
	public boolean compareByRevenue(Vegetable v) {
		return getTotalRevenue() < v.getTotalRevenue();
	}
	@Override
	public String toString() {
		return  id + "\t" + name + "\t" + unit + "\t" + quantitySold
				+ "\t" + sale + "\t" + price + "\n";
	}
	

}
