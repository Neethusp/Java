package encapsulation;

public class College {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails obj= new StudentDetails();
		obj.setName("Vishnu");
		obj.setRollno(144);
		
		System.out.println("Name: "+obj.getName());
		System.out.println("RollNo: "+obj.getRollno());

	}

}
