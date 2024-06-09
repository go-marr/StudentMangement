package School;

import java.util.Scanner;

public class Update {

	static void UpdateStudent(Student s) {
		Scanner sc = new Scanner(System.in);
		System.out.println("변경할 전화번호 : ");
		s.phoneNum = sc.next();
		System.out.println("변경할 주소 : ");
		s.address = sc.next();
		
		System.out.printf("전화번호 : %s%n주소 : %s%n변경이 완료되었습니다.",s.phoneNum,s.address);
		
	}
}
