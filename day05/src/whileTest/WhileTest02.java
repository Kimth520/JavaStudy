package whileTest;

import java.util.Scanner;

public class WhileTest02 {
	public static void main(String[] args) {
		
		//사용자가 0을 입력하면 종료되는 프로그램
		
		//1) 입력 클래스 import
		//2) 변수 사용자가 입력한 값 저장할 변수
		//3) 출력메시지(숫자 입력 : )
		//4) 입력메소드
		//5) while(조건식) => 변수 != 0
		//6) 결과 출력문
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		System.out.println("숫자 입력 : ");
		choice = sc.nextInt();
		
		while(choice != 0) {
			System.out.println(choice);
			System.out.println("숫자 입력 : ");
			choice = sc.nextInt();
		}
		System.out.println("프로그램 종료");
		
	}
}