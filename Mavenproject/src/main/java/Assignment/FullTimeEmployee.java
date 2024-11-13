package Assignment;

public class FullTimeEmployee extends Employee{
	public void calculateSalary(int payment)
	{
		int Fulltimepay= payment*PERHOUR;
		System.out.println("Full Time Employee payment: "+ Fulltimepay);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FullTimeEmployee obj = new FullTimeEmployee();
		Contractor obj1= new Contractor();
		obj.calculateSalary(4000);
		obj1.calculateSalary(2000);
		
	}

}
