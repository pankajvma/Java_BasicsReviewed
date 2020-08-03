import java.util.ArrayList;
import java.util.List;

public class Third_GenericsWithList {
public static void main(String[] args) {
		
		List <Integer> values = new ArrayList<>();	// 1.7
		//List <Integer> values = new ArrayList<>();	// 1.5
		values.add(1);	
		values.add(4);	
		values.add(7);	
		values.add(9);	
		
		System.out.println(values);
		
		for(Integer o : values)	//Using enhanced for loop
			System.out.println(o);
		
		//Alternate methods
		/*for(Object o : values)	//Using enhanced for loop
			System.out.println(o);
		
		//Alternate methods
		/*for(int i=0; i<values.size(); i++)	// size() is used to get the size of List
			System.out.println(values.get(i));*/
		
		/*Iterator it = values.iterator();		// can be iterated using iterator also
		
		while(it.hasNext())
			System.out.println(it.next());*/
		
	}
}

