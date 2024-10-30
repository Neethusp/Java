package inheritance;

public class CrowSimple extends BirdsSimple {
	String a= "crow";
	String b= "Flying crow";
	
	public void display2()
	{
		System.out.println("Type of bird: "+a );
	}
	public void display3()
	{
		System.out.println(b );
	}
	public static void main(String[] args) {
		CrowSimple obj = new CrowSimple();
		obj.display();
		obj.display1();
		obj.display2();
		obj.display3();
		
		System.out.println(obj.a);

	}

}
