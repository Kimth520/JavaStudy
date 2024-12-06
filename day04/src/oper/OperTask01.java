package oper;

import java.util.Scanner;

public class OperTask01 {
	public static void main(String[] args) {
	
		//1. 사용자로부터 두개의 숫자를 입력받아 두 숫자의 합과 곱을 각각 출력하기
		//입력클래스 import
		Scanner sc = new Scanner(System.in);
		//변수 선언
		int data1 = 0, data2 = 0, add = 0, multi = 0;
		//입력 메시지 출력 + 두 숫자 입력 메소드
		System.out.println("띄어쓰기로 구분하여 두개의 숫자를 입력해주세요 : ");
		data1 = sc.nextInt();
		data2 = sc.nextInt();
		//연산문
		add = data1 + data2;
		multi = data1 * data2;
		//출력문
		System.out.printf("두 숫자의 합은 %d, 곱은 %d입니다.", add, multi);
		//버퍼 비우기
		sc.nextLine();
		
		//2. 1번에서 입력받은 두개의 숫자를 사용하여 평균을 계산하고 소수점 두자리수까지 출력
		//변수 선언
		double avg = 0.0;
		avg = (double)add / 2; //정수 나누기 정수는 정수이므로 실수로 바꿈
		System.out.printf("두 숫자의 평균은 %.2f 입니다\n", avg);
		
		//3. 두자리수 정수를 입력받고 십의자리와 일의자리를 출력하기
		
		//변수 선언
		int data3 = 0, ten = 0, one = 0;
		//입력 메시지 + 입력 메소드
		System.out.println("두자리수 정수를 입력해주세요 : ");
		data3 = sc.nextInt();
		//연산식
		ten = data3 / 10;
		one = data3 % 10;
		//출력문
		System.out.printf("십의 자리 숫자는 %d이고, 일의 자리 숫자는 %d입니다\n", ten, one);
		sc.nextLine();
		
		//4. 코인노래방 프로그램 만들기, 사용자에게 금액을 입력받고 부를 수 있는 곡수와 잔돈 출력하기
		//한곡의 가격은 400원
		
		//변수 선언
		int money = 0, song = 0, change = 0;
		// 입력 메시지 + 입력 메소드
		System.out.println("안녕하세요 태현 노래방입니다");
		System.out.println("계산하실 금액을 입력해주세요 : ");
		money = sc.nextInt();
		//연산식
		song = money / 400;
		change = money % 400;
		//출력
		System.out.printf("남은 곡 수 : %d\n", song);
		System.out.printf("잔돈 : %d", change);
		sc.nextLine();
		//Scanner 자원해제
		sc.close();
		
		
	}
}
