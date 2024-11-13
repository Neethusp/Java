package interfacepgm;

public class ChildClass implements SampleInterace {
	
	public void display()
	{
		System.out.println("Implenments Interface: "+ MAX);
		
	}
	public void show()
	{
		System.out.println("Implenments Interface: "+ MIN);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleInterace obj = new ChildClass ();      //upcasting
		obj.display();
		obj.show();
		

	}

}
