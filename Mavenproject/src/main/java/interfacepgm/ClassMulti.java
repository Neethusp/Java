package interfacepgm;

public class ClassMulti implements Interface1,Interface2 {
	
	public void display()
	{
		System.out.println("Name :" + NAME);
	}
	public void show()
	{
		System.out.println("Age: "+ AGE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassMulti obj= new ClassMulti();
		obj.display();
		obj.show();
		
	}

}
