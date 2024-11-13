package inheritance;

public class Mouse extends LapTop {
	int c;
	
	public void display2(int c)
	{
		System.out.println("Price: "+c);
	}
	public static void main(String[] args) {
		Mouse obj = new Mouse();
		obj.display4("Mobile");
		obj.display1("Realme");
		obj.display2(28000);

	}

}
