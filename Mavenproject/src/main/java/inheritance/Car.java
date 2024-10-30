package inheritance;

public class Car extends Vehicle {
	String model ="Swift dezir";
	int price = 120000;
	
	public void display() {
		System.out.println("Name of Vehicle:  "+ model);
		System.out.println("Price of Vehicle: "+ price);
	}
	public static void main(String args[])
	{
		Car obj= new Car();
		obj.model();
		obj.model1();
		obj.display();
		System.out.println(obj.name);        //or
		System.out.println(obj.Type);        //or
		
		
	}

}
