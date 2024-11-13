package encapsulation;

public class Student {
	private int rollno;
	private String name;
	private String dep;
	
	public void setter( int rollno, String name, String dep)
	{
		this.rollno= rollno;
		this.name= name;
		this.dep = dep;
		

	}
	public void getter()
	{
		System.out.println("Rollno: "+ rollno);
		System.out.println("Name: "+name);
		System.out.println("Department: "+ dep);
	}
		
}
