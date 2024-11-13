package exceptionhandling;

public class CustomException {
	public void display(int age) throws LicenseException
	{
		if(age>18)
		{
			System.out.println("age is greater than 18");
		}
		else
		{
			throw new LicenseException("Custom Exception");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomException obj= new CustomException();
		try 
		{
			obj.display(14);
		}
		catch (LicenseException a)
		{
			System.out.println(a);
		}
	}

}
