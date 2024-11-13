package encapsulation;

public class Details1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Details obj= new Details();
		obj.setName("Suresh");
		obj.setAcno(145258);
		obj.setEmail("suresh@gamil.com");
		
		System.out.println("Name :"+obj.getName());
		System.out.println("Account No:" +obj.getAcno());
		System.out.println("Email Id: "+obj.getEmail());
		
	}

}
