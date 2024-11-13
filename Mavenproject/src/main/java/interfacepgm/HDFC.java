package interfacepgm;

public class HDFC implements RBI{
	
	public void recurringDeposit()
	{
		double monthlyrate= INTEREST_RATE/ (12*100);
		double recurringAmount =amount * durationInMonths+ amount *(durationInMonths * (durationInMonths+1)/2)* monthlyrate;
		System.out.println(recurringAmount);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC obj= new HDFC();
		obj.recurringDeposit();

	}

}
