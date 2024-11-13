package exceptionhandling;

public class Sample {

	public static void main(String[] args) {
		
		
		try
		{
			int arr[]= new int[4];
			arr[5]=20;
			int value= 5/0;
			
		}
		catch(ArithmeticException a)
		
		{
			System.out.println("Division by 0 is not poossible");
		}
		catch(ArrayIndexOutOfBoundsException a)
		
		{
			System.out.println(a);
		}
		/*catch (Exception a)
		{
			System.out.println("Parent Exception");
		}*/
		finally
		{
			System.out.println("finally block will always executed");
		}
		System.out.println("rest of codes");
	}

}
