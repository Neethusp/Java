package collection;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExm {

	public static void main(String[] args) {
		Set<String> s1= new HashSet<String>();               //import set and hashset
		s1.add("Red");
		s1.add("Blue");
		s1.add("Black");
		
		System.out.println(s1);
		
		HashSet s2= new HashSet();                        //non generic
		s2.add(2);
		s2.add("hello");
		s2.add('V');
		 
		System.out.println(s2);
		
		HashSet<String> s3= new HashSet<String>();                        //non generic
		s3.add("One");
		s3.add("Two");
		s3.add("Three");
		 
		System.out.println(s3);
		
		s3.addAll(s1);
		System.out.println(s3);
		
		s3.removeAll(s1);
		System.out.println(s3);
		
		s3.remove("One");
		System.out.println(s3);
		
		System.out.println("  ");              //SPACE
		System.out.println("ITERATOR");
		Iterator<String>it=s3.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		

	}

}
