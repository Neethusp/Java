package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExm {

	public static void main(String[] args) {
		List<String> List1= new ArrayList();
		List1.add("Apple");
		List1.add("Banana");
		List1.add("Orange");
		
		System.out.println(List1);
		
		
		//non Generic
		ArrayList List2= new ArrayList();
		List2.add(1);
		List2.add(4);
		List2.add('V');
		List2.add("Four");
		System.out.println(List2);
			
		
		//Generic Vollection
		
		ArrayList <String> List3= new ArrayList();
		List3.add("Hai");
		List3.add("Hello");
		List3.add("Hello");
		List3.add(null);
		List3.add(null);
		List3.add("Bye");
		List3.add("Nice");
		System.out.println(List3);
		System.out.println(List3.isEmpty());
		System.out.println(List3.size());
		System.out.println(List3.contains("Hai"));
		
		List3.remove(0);
		System.out.println(List3);
		
		List3.remove("Hello");
		System.out.println(List3);
		
		Collections.sort(List1);           //utility class
		System.out.println(List1);
		
		List1.addAll(List3);
		System.out.println(List1);
		
		List1.removeAll(List3);
		System.out.println(List1);
		
		System.out.println(List1.get(1));
		System.out.println(List2.get(1));
		
		List2.set(0, "Blue");
		System.out.println(List2);
		
		
		

	}
	
	
}
