package superkeyword;

public class Childclass extends Parentclass
{
	String a= "Kollam";
	
	public void display()
	{
		super.display();
		System.out.println("Child class Method");
		System.out.println(a);
		System.out.println(super.a);
	}
	public Childclass(String z)
	{
		super("helo");
		System.out.println("child class constructor");
	}
	public static void main(String arg[])
	{
		Childclass obj= new Childclass("Arya");
		obj.display();
	
		
	}
}
