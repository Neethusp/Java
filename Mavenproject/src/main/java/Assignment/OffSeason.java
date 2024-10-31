package Assignment;

public class OffSeason {
	double discount= 0.15;
	double cost;
	public void discount(double cost)
	{
		System.out.println("Offseason Purchase");
		System.out.println("Rate of items: "+ cost);
		System.out.println("Offseason discount(15%): "+ cost*discount);
		System.out.println("Total price (after all discounts: "+ (cost -(cost*discount)));
	}


}
