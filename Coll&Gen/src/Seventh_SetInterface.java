import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Seventh_SetInterface {
	public static void main(String[] args) {
		Set <Integer> values = new TreeSet<>();
		//Set <Integer> values = new HashSet<>();	  //HashSet class implements set interface
		values.add(5);
		values.add(6);
		values.add(9);		//The add() method here returns boolean values.
		values.add(6);		//Unlike List, Set doesn't store duplicate values. add() will return false for 6 here. And it will not be added to Set
		values.add(87);
		values.add(37);
		values.add(94);
		values.add(92);		//Hashing doesn't save elements in a specified sequence. It will bring the value stored at the nearest location first
		
		//To store values in ascending order Use TreeSet class instead of HashSet
		
		for(int i : values) {
			System.out.println(i);
		}
	}
}
