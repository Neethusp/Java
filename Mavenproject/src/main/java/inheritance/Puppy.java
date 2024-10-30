package inheritance;

public class Puppy extends Dog {
	int age = 3;
	public void Age ()
	{
		System.out.println("Age: "+age);
	}
	
	public static void main(String[] args) {
		Puppy obj = new Puppy();
		obj.Details();
		obj.Details1();
		obj.Age();
	

	}

}
