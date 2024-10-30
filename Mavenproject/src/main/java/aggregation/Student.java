package aggregation;

public class Student {
	String name;
	int age;
	int rollno;
	
	Address adr;
	
	public Student(String name,int age,int rollno,Address adr)
	{
		this.name= name;
		this.age= age;
		this.rollno= rollno;
		this.adr= adr;
	}
	public void display()
	{
		
		System.out.println("Student name: "+ name);
		System.out.println("Student Age:");
		System.out.println("Student Rollno: "+rollno);
		System.out.println("House No:" + adr.houseNo);
		System.out.println("House Name: " + adr.houseName);
		System.out.println("Place: " + adr.place);
		System.out.println("Pin No: " + adr.pin);
	}

	public static void main(String[] args) {
		Address obj= new Address (142,"Nivas","Trivandrum",695501);
		Student obj1=  new Student ("Arya", 14, 40, obj);
		obj1.display();
		
				

	}

}
