package School;

import java.util.Collection;
import java.util.Iterator;

public class Search {
	
	static Student StudentSearch(String numsearch) {

		int id = 0;
		Collection<Student> c = Student.totStudent;
		Iterator<Student> it = c.iterator();
		
		String[] numArr = new String[c.size()];
		
		while(it.hasNext()) {
			for(int k =0; k<c.size();k++) {
				numArr[k] = it.next().getStudentNum();
			}
		}
		for(int k =0;k<numArr.length;k++) {
			if(numsearch.equals(numArr[k])) {
				id = k;
			}
		}
		System.out.println(Student.totStudent.get(id));
		return Student.totStudent.get(id);
	}
	
	
}
