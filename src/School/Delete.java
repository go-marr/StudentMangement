package School;


public class Delete {
	
	static void DeleteStudent(Student s) {
		
		int id = Student.totStudent.indexOf(s);
		Student.totStudent.remove(id);
	
	}

}
