package oper;

import java.util.Scanner;

public class OperTask01 {
	public static void main(String[] args) {
		//정수 2개를 입력받아서 큰 수 출력하기
		
		//입력클래스 import
		Scanner sc = new Scanner(System.in);
		//정수2개 변수 선언
		int num1 = 0, num2 = 0;
		String result1 = "";
 
		System.out.println("두개의 정수를 각각 입력");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		result1 = (num1 > num2) ? "큰수는 :" + num1 : num1 == num2 ? "두 수는 값습니다" : "큰수는 : " + num2; //삼항연산 두번연속으로 사용
		System.out.println(result1); 
		
		
	}
}
