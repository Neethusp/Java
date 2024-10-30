package inheritance;

public class Developer extends EmployeeDetails{
	int salary= 35000;
	
	public void display2 ()
	{
		System.out.println("Developer Salary:"+ salary );
	}

	public static void main(String[] args) {
		Developer obj= new Developer();
		obj.display();
		obj.display2();
		
		Tester obj1= new Tester();
		obj1.display();
		obj1.display1();

	}

}
