package inheritance;

public class Tester extends EmployeeDetails {
	String a= "Arya";
	int id = 142;
	
	public void display1()
	{
		System.out.println("Tester name :"+ a);
		System.out.println("Tester id :"+ id);
	}
	public static void main(String[] args)
	{
		Tester obj= new Tester();
		obj.display();
		obj.display1();

	}

}
