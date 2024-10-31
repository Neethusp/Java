package Assignment;

public class OnSeason extends OffSeason {
	double discount= 0.40;
	double cost;
	public void discount(double cost)
	{
		System.out.println("Onseason Purchase");
		System.out.println("Rate of items: "+ cost);
		System.out.println("Onseason discount(15%): "+ cost*discount);
		System.out.println("Total price (after all discounts: "+ (cost -(cost*discount)));
		System.out.println("  ");
		super.discount(12000);
		
	}
	public static void main(String[] args) {
		OnSeason obj = new OnSeason();
		obj.discount(12000);
	}


}


