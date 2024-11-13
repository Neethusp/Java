package finalKeyword;

public final class ClassFinal {
	final int A= 5;
	final int B;   //un initialized final variable   or blank final variable

	public ClassFinal()
	{
		B=10;   //this value will be constant, cannot be changed
		
	}
	
	public void method()
	{
		int x= A+B;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
