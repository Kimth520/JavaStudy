package ex01_김태현;

import java.util.Scanner;

public class InputNumber {
	public static void main(String[] args) {
//		1. 사용자로부터 3개의 정수를 입력받아 아래 요구사항대로 구현하라
//			- 클래스명 : InputNumber
//			- 배열은 사용하면 안된다
//			1) 최소값과 최대값 출력
//			2) 5개 숫자의 평균을 소수점 2자리까지 출력

		// 로직
		// 입력클래스 import
		// 입력 메시지 출력 띄어쓰기로 구분
		// 입력받을 세개의 정수 변수 선언과 바로 입력 메소드로 세 정수 받기
		//최댓값과 최솟값으로 사용할 변수 선언 (max,min)
		// 세개의 정수 합과 평균을 구할 변수 선언(int total, double avg)
		// if문 사용해서 최솟값과 최댓값 구하기
		//printf를 사용하여 %.2f를 통해 평균을 소수점 2자리까지 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("서로 다른 세 정수를 띄어쓰기로 구분하여 차례대로 입력하시오");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int max = 0;
		int min = 0;
		
		if(num1>num2&&num1>num2) {
			max = num1;
		}else if(num2>num1&&num2>num3){
			max = num2;
		}else {
			max = num3;
		}
		
		if(num1<num2&&num1<num2) {
			min = num1;
		}else if(num2<num1&&num2<num3){
			min = num2;
		}else {
			min = num3;
		}
		System.out.println("최소값은 : " + min + ", 최댓값은 : " + max);
		
		int total = 0;
		double avg = 0.0;
		
		total = num1+num2+num3;
		avg = total/3;
		
		System.out.printf("세 숫자의 평균은 %.2f 입니다.", avg);
	
		

	}

}
