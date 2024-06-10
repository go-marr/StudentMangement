package School;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		int num;
		do {
			System.out.print("학생 정보 시스템\n 1.학생 정보 입력\n 2.학생 검색\n 3.학생 삭제\n 4.학생 정보 수정\n 5. 학생 목록\n어떤 작업을 수행하시겠습니까?(숫자로) :  ");
			Scanner n = new Scanner(System.in);
			num = n.nextInt();
		
			switch(num) {
			case 0:
				System.out.println("종료");
				break;
			case 1:
				System.out.println("입력");
				Student.InputStudent();
				break;
			case 2:
				System.out.println("검색");
				System.out.println("학번 : ");

				String numsearch = n.next();
				Search.StudentSearch(numsearch);
				break;
			case 3:
				System.out.println("삭제");
		
				System.out.println("삭제할 학번 : ");
				String numd = n.next();
				Delete.DeleteStudent(Search.StudentSearch(numd));
				System.out.println("삭제 됨");
				break;
			case 4:
				System.out.println("수정");
				System.out.print("수정할 학번 : ");
				numd = n.next();
				Update.UpdateStudent(Search.StudentSearch(numd));
				break;
			case 5:
				System.out.println("목록");
				StudentList.StList();
			}
		}while(num!=0);
		


	}
}
