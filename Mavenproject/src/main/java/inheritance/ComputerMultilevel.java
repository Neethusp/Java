package inheritance;

public class ComputerMultilevel extends ElectronicsMultilevel 
	{
	String type = "windows";
	int price = 48000;
	
	public void print1()
	{
		System.out.println("Computer Type: "+type);
		System.out.println("Computer Price: "+price);
	}
	}
