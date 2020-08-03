import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Fifth_ComparatorInterface {
	public static void main(String[] args) {
		
		List <Integer> values = new ArrayList<>();	// 1.7
		values.add(401);
		values.add(908);
		values.add(639);
		values.add(265);
		
		System.out.println(values);
		
		Comparator  <Integer> c = (i, j) -> i%10 > j%10?1:-1; 	// Using Lambda expression here as Comparator is a functional interface
		
//		Comparator  <Integer> c = new Comparator <Integer> ()  {
//			public int compare(Integer i, Integer j) {
//				return i%10 > j%10 ? 1 : -1;
//			}
//		};
		
		
//		Comparator  <Integer> c = new Comparator <Integer> ()  {
//			public int compare(Integer i, Integer j) {
//				if (i%10 > j%10)
//					return 1;
//				else
//					return -1;
//			}
//		};
		
		Collections.sort(values, c); //Collections is a Class inside the Collection API. It has a static sort() used to sort 
		
		for(Integer o : values)
			System.out.println(o);
		
	}
}
