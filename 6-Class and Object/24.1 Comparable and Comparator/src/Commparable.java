import java.awt.List;
import java.util.*;



class Laptop implements Comparable<Laptop>{
	private int ram;
	private String brand;

	public Laptop(int ram, String brand) {
		super();
		this.ram = ram;
		this.brand = brand;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", brand=" + brand + "]";
	}
	public int compareTo(Laptop lap1) {
		if(this.getBrand().length()>lap1.getBrand().length())
			return 1;
		else
			return -1;
	}

}

public class Commparable {
	public static void main(String args[]) {
		ArrayList<Laptop> lap = new ArrayList<Laptop>();

		lap.add(new Laptop(3, "Samsung"));
		lap.add(new Laptop(2,"HP"));
		lap.add(new Laptop(4, "Dell"));
 
		Collections.sort(lap);
		
		for (Laptop lap1 : lap) {
			System.out.println(lap1);
		}
	}
}
