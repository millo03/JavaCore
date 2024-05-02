package BT.Bai1;

import java.util.Scanner;

public class Address {
    private String commune;// xa
    private String district;
    private String city;

    public Address() {
    }

    public Address(String commune, String district, String city) {
        this.commune = commune;
        this.district = district;
        this.city = city;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Commune: ");
        this.commune = sc.nextLine();
        System.out.print("District: ");
        this.district = sc.nextLine();
        System.out.print("City: ");
        this.city = sc.nextLine();
    }

    public void output(){
        System.out.print(getCommune() + "-" + getDistrict() + "-" + getCity());
    }
}
