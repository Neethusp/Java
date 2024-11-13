package encapsulation;

public class User {
	private int pin;
	
	public void setter( int pin)
	{
		this.pin= pin;

	}
	public void getter()
	{
		System.out.println("PIN: "+ pin);
		
	}
	public void valid()
	{                                                                           
		if(pin==1001 || pin==1234 || pin==1212)
			{
			System.out.println("Valid PIN");
			
			}
		
		else
		{
			System.out.println("Invalid PIN");
		}
	}
}

	


