package system;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import user.Student;
import view.Menuview;

public class UserManagement {

	
	//대상 입력
	static public void input() {
		//정보 입력
		Scanner s = new Scanner(System.in);
		Student student = new Student();
		System.out.print("이름 : ");
		student.setName(s.next()); 

		System.out.print("학과: ");
		student.setDept( s.next());
		
		System.out.print("학번 : ");
		student.setStudentNum(s.next());
		
		System.out.print("주소: ");
		student.setAddress(s.next());
		
		System.out.print("전화번호: ");
		student.setPhoneNum(s.next());
	
		
		Student.totStudent.add(student);
		
		System.out.println(Student.totStudent.toString());
	}
	
	
	//대상 검색
	static public Student search() {
		Scanner n = new Scanner(System.in);
		n = new Scanner(System.in);
		String searchnum = n.next();
		
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
			if(searchnum.equals(numArr[k])) {
				id = k;
			}
		}
		System.out.println(Student.totStudent.get(id));
		return Student.totStudent.get(id);
	}
	
	
	//대상 수정
	static public void update(Student s) {
		Scanner sc = new Scanner(System.in);
		System.out.println("변경할 전화번호 : ");
		s.setPhoneNum( sc.next());
		System.out.println("변경할 주소 : ");
		s.setAddress( sc.next());
		
		System.out.printf("전화번호 : %s%n주소 : %s%n변경이 완료되었습니다.%n",s.getPhoneNum(),s.getAddress());
		
	}
	
	
	//대상 삭제
	static public void delete(Student s) {
		
		int index = Student.totStudent.indexOf(s);
		Student.totStudent.remove(index);
	
	}

	
	//목록
	static public void userList() {
		Collection<Student> c = Student.totStudent;
		Iterator<Student> it = c.iterator();
			
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	
	
	
	static public void menu(int n) {		
		switch(n){
			case 1:
				input();
				break;
			case 2:
				search();
				break;
			case 3:
				Student searchStudent = search();
				delete(searchStudent);
				
				break;
			case 4:
				searchStudent = search();
				update(searchStudent);
				
				break;
			case 5:
				userList();
				break;
		}
	
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
