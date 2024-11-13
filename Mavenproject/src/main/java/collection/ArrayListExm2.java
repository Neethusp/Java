package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExm2 {

	public static void main(String[] args) {
		ArrayList <String> List3= new ArrayList();
		List3.add("Hai");
		List3.add("Hello");
		List3.add("Banana");
		List3.add("Bye");
		List3.add("Nice");
		System.out.println("For Loop");
		
		for(int i=0; i<List3.size(); i++)
		{
			System.out.println(List3.get(i));
		}
		
		System.out.println("  ");              //SPACE
		System.out.println("For each Loop");
		for (String i:List3)
		{
			System.out.println(i);
		}
		System.out.println("  ");              //SPACE
		System.out.println("ITERATOR");
		
		Iterator<String>it=List3.iterator();
				while(it.hasNext())
				{
					System.out.println(it.next());
				}
				
		System.out.println("  ");              //SPACE
		System.out.println("ITERATOR- REMOVE");
				it.remove();
				System.out.println(List3);   //remove the last element
		
	}

}
