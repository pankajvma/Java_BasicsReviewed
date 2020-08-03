import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fourth_CollectionsClass {
public static void main(String[] args) {
		
		List <Integer> values = new ArrayList<>();	// 1.7
		values.add(1);	
		values.add(4);	
		values.add(7);	
		values.add(9);	
		
		System.out.println(values);
		
		Collections.sort(values); //Collections is a Class inside the Collection API. It has a static sort() used to sort 
		Collections.reverse(values); //reverses the order of elements
		Collections.shuffle(values);	// shuffles the elements inside the List
		
		
		
		for(Integer o : values)
			System.out.println(o);
		
	}
}
