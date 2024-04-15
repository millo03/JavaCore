package Ly_Thuyet;

public class Account {
	private int id;// thường ko để static trong lớp này vì truy cập được luôn
	private String name;
	private int balance;
	
	public  Account() {
		
	}
	public  Account(int id, String name,int balance) {
		this.id= id;
		this.name = name;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public  String getName() {
		return name;
	}
	public  void setName(String name) {
		this.name = name;
	}
	public  int getBalance() {
		return balance;
	}
	public  void setBalance(int balance) {
		this.balance = balance;
	}

	public int desposit(int amount) {
		this.balance += amount;
		return balance;
	}
	public int withdraw(int amount) {
		this.balance -= amount;
		return balance;
	}
	@Override
	public String toString() {
		return "id=" + id + "\n name=" + name + "\n balance=" + balance + "\n";
	}
	
	

}
