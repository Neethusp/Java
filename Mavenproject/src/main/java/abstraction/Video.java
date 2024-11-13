package abstraction;

public class Video extends Google {
	public void search()
	{
		System.out.println("Search Google");
	}
	
	public void show()
	{
		System.out.println("Video is Loading");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Video obj= new Video();
		obj.search();
		obj.dispaly();
		obj.show();
		

	}

}
