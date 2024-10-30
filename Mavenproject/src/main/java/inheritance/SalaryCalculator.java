package inheritance;

public class SalaryCalculator extends Employee
{ 
	float hra=1750;
	float pf= 7000;
	
	public  void calculator()
	{
		System.out.println("Hra is: " +hra);
		System.out.println("Pf is: " +pf);
		
	}

}
