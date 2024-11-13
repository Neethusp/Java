package exceptionhandling;

public class Throwexm {
	
	public void sum(int a,int b)
	{
		int sum = a+b;
		System.out.println(sum);
		if(sum>50)
		{
			throw new ArithmeticException("Sum is greater than 50");
		}
		else
		{
			System.out.println("Sum is Less than 50");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throwexm obj= new Throwexm();
		try 
		{
			obj.sum(55, 10);
		}
		catch (ArithmeticException a)
		{
			System.out.println(a);
		}
		
		System.out.println("Rest of the code");
		
	}

}
