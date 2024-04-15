package BTVN;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import javax.xml.transform.Source;

public class Bai1 {
	static ArrayList<Vegetable> listVegetable = new ArrayList();
	static Scanner sc = new Scanner(System.in);

	public static void Add() {
		Vegetable vnew = new Vegetable();
		System.out.print("Name: ");
		vnew.setName(sc.nextLine());
		System.out.print("Unit: ");
		vnew.setUnit(sc.nextLine());
		System.out.print("Quantity sold: ");
		vnew.setQuantitySold(sc.nextInt());
		System.out.print("Sale: ");
		vnew.setSale(sc.nextInt());
		System.out.print("Price: ");
		vnew.setPrice(sc.nextDouble());
		// them vao arraylist
		listVegetable.add(vnew);
	}

	public static void Title() {
		System.out.printf("̀%-6s %-15s %-10s %-15s %-8s %-10s %-10s\n", "ID", "Name", "Unit", "Quantity", "Sale",
				"Price", "Revenue");
	}

	// hien thi
	public static void Display() {
		if (listVegetable.size() == 0)
			System.out.println("List is empty!");
		else {
			Title();
			for (Vegetable a : listVegetable) {
				a.Format();
			}
		}
	}

	// sap sep theo gia tien tang dan
	public static void SortByRevenue() {
		// Cách 1
//		for(int i=0; i < listVegetable.size()-1;i++) {
//			for(int j= i+1;j<listVegetable.size(); j++ ) {
//				if(!listVegetable.get(i).compareByRevenue(listVegetable.get(j))) {
//					Vegetable tmp = new Vegetable();
//					tmp.setVegetable(listVegetable.get(i));
//					listVegetable.get(i).setVegetable(listVegetable.get(j)); 
//					listVegetable.get(j).setVegetable(tmp); 
//				}
//			}
//		}
		// cách 2
		Collections.sort(listVegetable, new Comparator<Vegetable>() {
			public int compare(Vegetable v1, Vegetable v2) {
				return Double.compare(v1.getTotalRevenue(), v2.getTotalRevenue());// đảo lại vị trí v1, v2 có thể sắp																	// sếp tăng or giảm
			}
		});
	}

	public static void SortByUnit() {
		for (int i = 0; i < listVegetable.size() - 1; i++) {
			for (int j = i + 1; j < listVegetable.size(); j++) {
				if (listVegetable.get(i).getUnit().equals(listVegetable.get(j).getUnit())) {
					// sắp sếp lại unit gần nhau
					Vegetable tmp = new Vegetable();
					tmp.setVegetable(listVegetable.get(i + 1));
					listVegetable.get(i + 1).setVegetable(listVegetable.get(j));
					listVegetable.get(j).setVegetable(tmp);
					if (listVegetable.get(i).getPrice() > listVegetable.get(i + 1).getPrice()) {
						tmp.setVegetable(listVegetable.get(i));
						listVegetable.get(i).setVegetable(listVegetable.get(i + 1));
						listVegetable.get(i + 1).setVegetable(tmp);
					}
				}
			}
		}
	}
	
	public static void Find() {
		String s;
		System.out.print("Tên rau: ");
		s = sc.nextLine();
		
		for (Vegetable v : listVegetable) {
			if(v.getName().contains(s)== true)
				System.out.print(v.toString());
		}
	}
	
	public static void menu() {
		System.out.println("__________MENU__________");
        System.out.println("1. Thêm 1 rau ms");
        System.out.println("2. Hiển thị");
        System.out.println("3. Sắp xếp theo doanh thu");
        System.out.println("4. nhóm cùng đơn vị và sắp xếp");
        System.out.println("5. Tìm kiếm");
        System.out.println("6. Exit");
        System.out.println("________________________");
       
        return ;
	}

	public static void main(String[] args) {
		Vegetable vnew = new Vegetable("Cai xanh", "Kg", 20, 5, 40000);
		Vegetable vnew1 = new Vegetable("Cai xanh1", "Kg", 10, 10, 20000);
		Vegetable vnew3 = new Vegetable("Cai xanh3", "Kg1", 20, 15, 40000);
		Vegetable vnew2 = new Vegetable("Cai xanh2", "Kg", 20, 15, 30000);
		Vegetable vnew4 = new Vegetable("Cai xanh3", "Kg1", 20, 15, 20000);
		listVegetable.add(vnew);
		listVegetable.add(vnew1);
		listVegetable.add(vnew3);
		listVegetable.add(vnew2);
		listVegetable.add(vnew4);
		int chon;
		menu();
		System.out.print("Lựa chon: ");
		chon = sc.nextInt();
		sc.nextLine();
		
		do {
			System.out.println("----------------------------------");
			switch (chon) {
			case 1: {
				Add();
				break;
			}
			case 2: {
				Display();
				break;
			}
			case 3: {
				SortByRevenue();
				Display();
				break;
			}
			case 4: {
				SortByUnit();
				Display();
				break;
			}
			case 5: {
				Find();
				break;
			}
			case 6: {
				System.out.println("KẾT THÚC!");
				System.out.println("----------------------------------");
				return;
			}
			default:
				break;
			}
			System.out.println("----------------------------------");
			System.out.print("Lựa chon: ");
			chon = sc.nextInt();
			sc.nextLine();
		}while (chon < 6 && chon >0 );

	}

}
