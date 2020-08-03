import java.util.ArrayList;
import java.util.List;

public class Second_ListInterface {
	public static void main(String[] args) {
		
		//Unlike Collection, List works with index numbers
		
		List values = new ArrayList();	// List interface extends Collection interface. ArrayList implements List. So, indirectly ArrayList implements collection.
		values.add(1);	//Like all other Collection in java, List can have any type of value inside the List i. e. Integer, Float, String etc. So, when we talk about list it is a list of object not of a specific type.
		values.add(4);	// Although the value looks like a number, It is not an int 4. It is a Wrapper class object Integer 4.
		values.add(7);	// It can be seen as. Integer v = new Integer(7);
		values.add(9);	// So, here inside add(), We are just passing the object of Integer (Wrapper class) here. add() only takes object.
		values.add("Ramesh");
		values.add("Pankaj");
		values.add(9.100056);
		values.add("Govind"); 
		values.add(2, "Mohan");
		
		System.out.println(values);
		
		for(Object o : values)	//Using enhanced for loop
			System.out.println(o);
		
		//Alternate methods
		/*for(int i=0; i<values.size(); i++)	// size() is used to get the size of List
			System.out.println(values.get(i));*/
		
		/*Iterator it = values.iterator();		// can be iterated using iterator also
		
		while(it.hasNext())
			System.out.println(it.next());*/
		
	}
	
}
