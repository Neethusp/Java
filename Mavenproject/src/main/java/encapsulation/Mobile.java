package encapsulation;

public class Mobile {
	private String brand;
	private int price;
	
	public void setter(String brand,int price)
	{
		this.brand= brand;
		this.price= price;
		
	}
	public void getter()
	{
		System.out.println("Brand: "+ brand);
		System.out.println("Price: "+ price);
	}

}
