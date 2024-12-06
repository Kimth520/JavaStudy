package scanner;

import java.util.Scanner;

public class ScannerTask02 {
	public static void main(String[] args) {
		
		//0.  입력 클래스 import
		Scanner sc = new Scanner(System.in);
		
		//1. 사용자로부터 세 개의 숫자를 입력받아 합을 출력하는 프로그램
		//- 세개의 숫자를 각각 입력받기
		//- 세 숫자의 합을 계산하여 출력
		//- 세 숫자의 합은 00입니다 형식으로 출력
		
		//2. 입력 메시지 출력
//		System.out.println("첫번째 숫자 입력 : ");
//		int num1 = sc.nextInt();
//		
//		System.out.println("두번째 숫자 입력 : ");
//		int num2 = sc.nextInt();
//		
//		System.out.println("세번째 숫자 입력 : ");
//		int num3 = sc.nextInt();
//		
//		System.out.printf("세 숫자의 합은 %d입니다\n\n", num1 + num2 + num3);
		
		
		int num1 = 0, num2 = 0, num3 = 0, result = 0;
		System.out.println("합을 구할 세 숫자를 띄어쓰기로 각각 입력해주세요:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		result = num1+num2+num3;
		System.out.printf("세 숫자의 합은 %d입니다\n\n", result);
		sc.nextLine();
		
		
		//2. 사용자로부터 일어난 시간, 아침, 점심, 저녁에 할 일들과 잠들 시간을 입력받아 출력
		//- 아침, 점심, 저녁에 할 일들과 잠들 시간을 각각 입력받디
		//- 순서대로 입력받고 출력할것
		//- 출력 형식
		//오늘 일어난 시간은 00시이고 잠들 시간은 00시 입니다
		// 아침 : 00하기
		// 점심 : 00하기
		// 저녁 : 00하기
		
//		int wakeup = 0,  sleep = 0;
//		String do1 = "", do2 = "", do3 = "";
//		
//		System.out.println("일어난 시간 : ");
//		wakeup = sc.nextInt();
//		System.out.println("잠들 시간 : ");
//		sleep = sc.nextInt();
//		
//		System.out.println("아침에 할 일들 : ");
//		do1 = sc.next();
//		System.out.println("점심에 할 일들 : ");
//		do2 = sc.next();
//		System.out.println("저녁에 할 일들 : ");
//		do3 = sc.next();
//		
//		System.out.printf("오늘 일어난 시간은 %d시이고, 잠들 시간은 %d시 입니다", wakeup, sleep);
//		System.out.printf("아침 : %s하기", do1);
//		System.out.printf("점심 : %s하기", do2);
//		System.out.printf("저녁 : %s하기\n\n", do3);
		
		int wakeup = 0,  sleep = 0;
		String do1 = "", do2 = "", do3 = "";
		
		System.out.println("일어난 시간, 잠들시간, 아침/점심/저녁에 할일을 띄어쓰기로 구분해서 입력");
		wakeup = sc.nextInt();
		sleep = sc.nextInt();
		do1 = sc.next();
		do2 = sc.next();
		do3 = sc.next();
		
		System.out.printf("오늘 일어난 시간은 %d시이고, 잠들 시간은 %d시입니다\n", wakeup, sleep);
		System.out.printf("아침에 할일 : %s\n점심에 할일 : %s\n저녁에 할일 : %s\n", do1, do2, do3);
		sc.nextLine();
		
		
		
		//3. 물건 가격이 10000원이다. 사용자로부터 지불금액을 입력받아 거스름돈을 계산하기(뺄셈- 이용)
		//출력 형식
		//물건 가격은 10000원입니다
		//지불 가격을 입력하세요 : 00
		//거스름돈은 3000원입니다
		
		System.out.println("물건 가격은 10000원입니다\n지불 가격을 입력하세요 : ");
		int money = sc.nextInt();
		System.out.printf("거스름돈은 %d원입니다", money-10000);
		sc.close();
		
		
		
	}
}
