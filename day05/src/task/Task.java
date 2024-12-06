package task;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//      1. 한개의 정수를 입력받아 짝수인지 홀수인지 출력하기
//      입력 : 8
//      출력 : 짝수입니다
		
		int num = 0;
		System.out.println("한개의 정수 입력 : ");
		num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("짝수입니다");
		}else {
			System.out.println("홀수입니다");
		}
		
		
		
//      2. 한개의 정수를 입력받아 양수, 음수, 0인지 출력하기
//      입력 : -5
//      출력 : 음수입니다
//
//      입력 : 100
//      출력 : 양수입니다
//
//      입력 : 0
//      출력 : 0입니다
		
		
		int num0 = 0;
		System.out.println("한개의 정수 입력 : ");
		num0 = sc.nextInt();
		
		if(num0 > 0) {
			System.out.println("양수입니다");
		}else if(num0 ==0){
			System.out.println("0입니다");
		}else {
			System.out.println("음수입니다");
		}
		
		
//      3. 나이를 입력받아 다음 기준으로 출력하기
//         0~12: 어린이
//         13~19: 청소년
//         20 이상: 성인
//
//      나이입력 : 16
//      청소년입니다
		
		int age = 0;
		System.out.println("나이 입력 : ");
		age = sc.nextInt();
		
		if(0 < age && age <= 12) {
			System.out.println("어린이입니다");
		}else if(13<= age && age <= 19){
			System.out.println("청소년입니다");
		}else {
			System.out.println("성인입니다");
		}
		
//
//      4. 세 개의 정수를 입력받아 가장 작은 숫자부터 큰 숫자 순으로 정렬하여 출력하기(단, 삼항연산자만 이용할 것)
//         입력 : 5 1 9
//         출력 : 1 5 9
		
		//로직
		//입력받을 변수와 최저 중간 최대값 변수 선언
		//입력메시지 + 입력메소드
		//삼항연산자
		//small은 가장 작은값, large는 가장 큰값
		//middle값은 나머지 값으로 
		
		int num1 =0, num2 = 0, num3 = 0;
		int small = 0, middle = 0, large = 0;
		System.out.println("세개의 정수를 입력하시오(띄어쓰기로 구분) : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		small = (num1 <= num2 && num1 <= num3) ? num1 
                : (num2 <= num1 && num2 <= num3) ? num2 : num3;
		large = (num1 >= num2 && num1 >= num3) ? num1 
                : (num2 >= num1 && num2 >= num3) ? num2 : num3;
		middle = (num1 != small && num1 != large) ? num1 
               : (num2 != small && num2 != large) ? num2 : num3;
		
		System.out.println(small + " " + middle + " " + large);
		
//
//      5. 사용자로부터 문자열을 입력받고 "X"만 입력했을 경우에만 종료 메시지를 출력하고 그 외에는 입력한 문자열을 출력하기
		
		
			// 변수 사용자가 입력한 값 저장할 변수
			// 출력메시지(숫자 입력 : )
			// 입력메소드
			// while(조건식) => 변수 != 0
			// 결과 출력문
		//로직
		//문자열 변수 선언
		//입력메시지 + 입력메소드
		//while 반복문으로 x가 입력되지 않는다면 출력문   
		
		String choice = "";
		System.out.println("문자열을 입력하시오 : ");
		choice = sc.next();
		
		while(!choice.equals("X")) {
			System.out.println(choice);
			System.out.println("문자열을 입력하시오 : ");
			choice = sc.next();
			
		}
		System.out.println("프로그램 종료");

//      6. 사용자가 입력한 숫자에 해당하는 구구단을 출력하기
//      단을 입력하세요 : 3단
		
//      출력
//      3 x 1 = 3
//      3 x 2 = 6
//      ...
//      3 x 9 = 27
		
		//로직
		//단 변수 선언
		//입력 메시지 + 입력 메소드
		//for 반복문 구성
		
		int num4 = 0;
		System.out.println("단을 입력하세요 : ");
		num4 = sc.nextInt();
		for(int i=1; i<=9; i++) {
			System.out.printf("%d x %d = %d\n", num4, i,num4*i);
		}
		
//
//
//      7. ATM 메뉴에서 입금, 출금, 잔액 조회를 구현하세요.
//
//      [조건]
//      초기 잔액은 10000원으로 설정
//      메뉴에서 선택에 따라 작업 수행
//      종료 시 프로그램 종료
		
		
		//로직
		//상수 선언 및 변수 초기화
		//입력 메소드
		//switch문 구성
		//입금과 출금 로직 구성 결과 저장되도록 +=, -=
		//default로 다른 숫자 입력 경고 메시지 출력
		
		int balance = 10000, pick = 0;
		
      String msg =  "ATM 메뉴의 번호를 선택하세요 : \n"
                  + "1. 잔액 조회\n"
                  + "2. 입금\n"
                  + "3. 출금\n"
                  + "4. 종료\n"
                  + "선택 : \n";
      
      
      
      while(true) 
      {
    	  System.out.println(msg);
      pick = sc.nextInt();
      
      switch(pick) 
      {
      	case 1:
      		System.out.println("현재 잔액 : " + balance);
      		break;
      		
      		
      	case 2:
      		System.out.print("입금할 금액을 입력하세요: ");
            int deposit = sc.nextInt();
            if (deposit > 0) 
            {
                balance += deposit;
                System.out.println(deposit + "원이 입금되었습니다.");
            } 
            else 
            {
                System.out.println("올바른 금액을 입력하세요.");
            }
      		break;
      		
      		
      	case 3:
      		System.out.print("출금할 금액을 입력하세요: ");
            int withdraw = sc.nextInt();
            if (withdraw > 0 && withdraw <= balance) 
            {
                balance -= withdraw;
                System.out.println(withdraw + "원이 출금되었습니다.");
            } 
            else if (withdraw > balance) 
            {
                System.out.println("잔액이 부족합니다.");
            } else 
            {
                System.out.println("올바른 금액을 입력하세요.");
            }
            
            
      	case 4:
      		System.out.println("프로그램 종료");
      		return;
      		
      		
      	default :
      		System.out.println("error <1에서 4까지의 숫자를 입력하시오>");
      		break;
      		
      	}
      }
			
		
	}
}
