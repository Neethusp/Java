package polymorphism;

public class Football extends Sports
{
	public void play()
	{
		System.out.println("Playing Football");
		super.play();
	}

	public static void main(String[] args) 
	{
		Sports s;
		s= new Cricket();
		s.play();
		s= new Hockey();
		s.play();
		s=new Football();
		s.play();

	}

}
