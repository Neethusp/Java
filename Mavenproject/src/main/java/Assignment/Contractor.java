package Assignment;

public class Contractor extends Employee {
	
	public void calculateSalary(int payment)
	{
		int Totalpay= payment*PERHOUR;
		System.out.println("Contract Employee payment: "+ Totalpay);
	}
	

}
