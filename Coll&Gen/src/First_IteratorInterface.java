import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class First_IteratorInterface {
	public static void main(String[] args) {
		Collection values = new ArrayList();	// Collection interface, ArrayList class
		values.add(1);
		values.add(4);
		values.add(7);
		values.add(9);
		values.add("Ramesh");
		values.add("Pankaj");
		values.add(9.100056);
		values.add("Govind"); //Collection can store any type value until it's not defined using Generics
		System.out.println(values);
		
		//As Collection doesn't support indexing, We will have to use the Iterator interface to iterate through the ArrayList
		
		Iterator it = values.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		
	}
	
}
