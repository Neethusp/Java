package abstraction;

public class ChildClass extends Abstract{
	
	public void display()
	{
		System.out.println("Abstract Method");
	}
	
	public void show()
	{
		System.out.println("Child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass obj = new ChildClass ();
		obj.display();
		obj.show();
		obj.print();
		
	}

}
