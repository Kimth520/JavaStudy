package scanner;

import java.util.Scanner;

public class ScannerTask01 {
	public static void main(String[] args) {
		//두 정수를 입력받고 합을 출력하기
		//next 메소드를 사용한다
		//[입출력 결과]
		//정수1 입력 : 10
		//정수2 입력 : 20
		//두 정수의 합은 30입니다
		
		//로직구성
		//입력클래스 import
		Scanner sc = new Scanner(System.in);
		//입력 메시지 + 입력 메소드		
		System.out.println("정수1을 입력 : ");
		String num1 = sc.next();
		
		System.out.println("정수2를 입력 : ");
		String num2 = sc.next();
		
		//형변환 + 두 정수의 합 출력 메소드
		int result = Integer.parseInt(num1) + Integer.parseInt(num2);
		System.out.printf("두 정수의 합은 %d입니다", result);
		
		//Scanner 자원 해제
		sc.close();
		
	}
}
