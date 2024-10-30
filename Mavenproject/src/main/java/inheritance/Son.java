package inheritance;

public class Son extends Father {
	String a= "Akhil";
	
	public void details2()
	{
		System.out.println("Son name:"+ a);
	}
	public static void main(String arg[])
	{
		Son obj= new Son();
		obj.details();
		obj.details1();
		obj.details2();
		
		Daughter obj1= new Daughter();
		obj1.details3();
			
	}

}
