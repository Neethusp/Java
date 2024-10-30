package aggregation;

public class Book {
	String a;
	int price;
	
	Author adr;
	
	public Book(String a,int price,Author adr)
	{
		this.a= a;
		this.price= price;
		this.adr=adr;
	}
	public void display()
	{
		System.out.println("Book Name: " +a);
		System.out.println("Price of book: "+ price);
		System.out.println("Author name: "+ adr.name);
		System.out.println("Author Age: "+ adr.age);
	}
	  public static void main(String[] args) {
		  Author obj= new Author("Arundhathi",44);
		  Book obj1= new Book("The Good Things", 455,obj);
		  obj1.display();

	}

}
