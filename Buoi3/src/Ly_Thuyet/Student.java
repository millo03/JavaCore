package Ly_Thuyet;

public class Student {
	// Thuộc tính của đối tượng nên để phạm vi private
    private String name;
    private int age;
    
    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// Phương thức của đối tượng nên để phạm vi public
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
