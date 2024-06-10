package view;

import java.util.Scanner;

import system.UserManagement;

public class Menu {
	
	public static int run() {
		int num;
		do {
			System.out.print("학생 관리 시스템\n 1.학생 정보 입력\n 2.학생 검색\n 3.학생 삭제\n 4.학생 정보 수정\n 5.학생 목록\n어떤 작업을 수행하시겠습니까?(숫자로) :  ");
			Scanner n = new Scanner(System.in);
			num = n.nextInt();
		
			switch(num) {
			case 0:
				break;
			case 1:
				System.out.println("학생 정보 입력하세요.");
				break;
			case 2:
				System.out.println("학생 검색을 선택하였습니다.");
				System.out.println("학번 검색: ");
				n = new Scanner(System.in);
				String searchnum = n.next();
				UserManagement.search(searchnum);
				break;
			case 3:
				System.out.println("삭제할 학번 : ");
				UserManagement.delete(UserManagement.search(n.next()));
				System.out.println("삭제 됨");
				break;
			case 4:
				System.out.println("수정");
				System.out.print("수정할 학번 : ");
				UserManagement.update(UserManagement.search(n.next()));
				break;
			case 5:
				System.out.println("목록");
				UserManagement.userList();
				
			}
		}while(num!=0);
		
		return num;
	}
	public static void main(String[] args) {
		

	}
}
