package polymorphism;

public class Class2 extends Class1 {
	public void sum(int c, int d)
	{
		int z= c+d;
		System.out.println("Child Class sum: "+z);
		super.sum(4, 5);
	}

	public static void main(String[] args) {
		// Class2 obj= new Class2();
		 // obj.sum(2, 4);
		
		Class1 obj1= new Class2();    //upcasting
		obj1.sum(1,2);		
				
	}

}
