package oper;

import java.util.Scanner;

//삼항 연산자
public class OperTest01 {
	public static void main(String[] args) {
		
		//다음중 음식이 아닌것은?
		//1. 피자
		//2. 케이크
		//3. 불고기
		//4. java
		//삼항연산자를 사용하여 입력받은 값과 비교하고 정답입니다 or 오답입니다 출력
		String quizMsg = "다음 중 음식이 아닌것은?\n"
				+"1. 피자\n"
				+"2. 케이크\n"
				+"3. 불고기\n"
				+"4. java\n"
				+"번호를 입력하세요 : ";
				
		System.out.println(quizMsg);
		
		//입력클래스 import
		Scanner sc = new Scanner(System.in);
		
		//변수 선언 + 입력 메소드
		int num = 0;
		final int answer = 4;
		String result = "";
		num = sc.nextInt();
		result = (num == answer) ?  "정답" : (num <=4 && num>0 ) ? "오답" : "1부터 4까지 숫자안에서 골라주세요";
		System.out.println(result);
		
		
		  //로직구성
	      //1) 변수 선언(int 1개), 상수선언(int 1개)
	      //2) 입력클래스 import
	      //3) 문제 출력 출력메시지
	      //4) 변수 입력메소드 nextInt()
	      //5) 출력(삼항연산자)
	      
//	      int choice = 0;
//	      final int answer = 4;
//	      Scanner sc = new Scanner(System.in);
//	      System.out.println(quizMsg);
//	      choice = sc.nextInt();
//	      System.out.println(answer == choice ? "정답" : "오답");
//	      System.out.println(answer == choice ? "정답" : (choice >= 1 && choice < 4) ? "오답" : "잘못입력하셨습니다");
//	      
	      //문자열 비교
//	      String choice2 = "";
//	      final String answer2 = "java";
//	      choice2 = sc.next();
//	      System.out.println(answer2.equals(choice2) ? "정답" : "오답");
	      
	      //.equals() : 문자열 비교에서 사용하는 메소드 
	      // Object 클래스 .equals()메소드 배울 예정

	
	}
}
