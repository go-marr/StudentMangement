package user;

import java.util.ArrayList;
import java.util.Scanner;



public class Student extends User{

	static public ArrayList<Student> totStudent = new ArrayList<>();
	
	private String name;
	private String dept;
	private String studentNum;
	private String address;
	private String phoneNum;
	
	public Student() {

	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	public String getStudentNum() {
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

	
	
	
	
}
