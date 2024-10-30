package inheritance;

public class TotalSalary extends SalaryCalculator
 {
	float salary;
	
	 public void  Salary()
	
	 {
		 salary= basicpay+hra-pf-deduction+bonus;
		 System.out.println("Total Salary is:" +salary);
		 
	 }
	 
	public static void main(String[] args) {
		TotalSalary obj= new TotalSalary();
		obj.basic();
		obj.calculator();
		obj.Salary();
	}

}
