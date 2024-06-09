package School;

import java.util.Collection;
import java.util.Iterator;

public class StudentList {
	
	static void StList() {
		Collection<Student> c = Student.totStudent;
		Iterator<Student> it = c.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
