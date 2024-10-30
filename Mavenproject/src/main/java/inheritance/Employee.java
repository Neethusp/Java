package inheritance;

public class Employee 
{
	float basicpay = 35000;
	float deduction= 1200;
	float bonus= 5200;
	public void basic()
	{
		System.out.println("Basic pay is :"+ basicpay);
		System.out.println("Deduction is :"+ deduction);
		System.out.println("Bonus is :"+ bonus);
	}
}