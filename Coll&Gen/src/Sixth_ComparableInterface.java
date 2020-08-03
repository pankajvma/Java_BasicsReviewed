import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stud implements Comparable <Stud>{		//Whenever you want a class objects to be compared, We have to implement the Comparable interface
	int rollno, marks;
	String name;
	
	public Stud(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}

	@Override
	public String toString() {		//Implemented inside java.lang.Object class
		return "Stud [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}
	
	public int compareTo(Stud s) {	//Only method inside Comparable interface
		return marks>s.marks?1:-1;
	}
	 
}

public class Sixth_ComparableInterface {
	public static void main(String[] args) {
		List <Stud> studs = new ArrayList<>();
		studs.add(new Stud(22, "Mukesh", 59));
		studs.add(new Stud(23, "Suresh", 57));
		studs.add(new Stud(27, "Ramesh", 55));
		studs.add(new Stud(278, "Mahesh", 51));
		
		Collections.sort(studs);//Whenever you want a class objects to be compared, We have to implement the Comparable interface
		
		for(Stud s : studs)
			System.out.println(s);
	}
}
