package inheritance;

public class LaptopMultilevel extends ComputerMultilevel {
	String type1="ubuntu";
	int price1 = 50000;
	
	public void print2()
	{
		System.out.println("Laptop Type: "+type1);
		System.out.println("Laptop Price: "+price1);
	}

	public static void main(String[] args) {
		LaptopMultilevel obj= new LaptopMultilevel();
		obj.print();
		obj.print1();
		obj.print2();
	}

}
