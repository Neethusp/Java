package Assignment;

public class HDFC implements RBI{
	
	public void recurringDeposit()
	{
		float depositrate = amount*durationInyears*INTEREST_RATE;
		float  recurringAmount =depositrate + amount ;
		System.out.println("Amount deposited: "+ amount);
		System.out.println("Recurring Amount : "+recurringAmount);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC obj= new HDFC();
		obj.recurringDeposit();

	}

}
