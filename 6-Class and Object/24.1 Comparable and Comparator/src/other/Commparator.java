package other;
import java.awt.List;
import java.util.*;

class Laptop {
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
	

}

public class Commparator {
	public static void main(String args[]) {
		ArrayList<Laptop> lap = new ArrayList<Laptop>();

		lap.add(new Laptop(3, "Samsung"));
		lap.add(new Laptop(2,"HP"));
		lap.add(new Laptop(4, "Dell"));
 
		Comparator<Laptop> com=new Comparator<Laptop>() {
			public int compare(Laptop lap1,Laptop lap2) {
				if(lap1.getRam()>lap2.getRam())
					return 1;
				else
					return -1;
			}
		};
		Collections.sort(lap,com);
		
		for (Laptop lap1 : lap) {
			System.out.println(lap1);
		}
	}
}
