package School;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
	static public ArrayList<Student> totStudent = new ArrayList<>();
	String name;
	String dept;
	int studentNum;
	String address;
	String phoneNum;

	public Student(String name,String dept,int studentNum, String address, String phoneNum) {
		this.name=name;
		this.dept=dept;
		this.studentNum=studentNum;
		this.address=address;
		this.phoneNum=phoneNum;
	}
	
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	public int getStudentNum() {
		return studentNum;
	}
	public String getAddress() {
		return address;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public String toString() {
		return "이름 : " + name +"\n학과 : " + dept + "\n학번 : " + studentNum +"\n주소 : "+ address + "\n전화번호 : " + phoneNum+"\n";
	}
	
	static public void InputStudent() {
		//정보 입력
		Scanner s = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = s.next();
		
		System.out.print("학과: ");
		String dept = s.next();
		
		System.out.print("학번 : ");
		int studentNum = s.nextInt();
		
		System.out.print("주소: ");
		String address = s.next();
		
		System.out.print("전화번호: ");
		String phonenum = s.next();
	
		
		Student s1  = new Student(name, dept, studentNum, address, phonenum);
		totStudent.add(s1);
		
		System.out.println(totStudent.toString());
	}
	
	
}