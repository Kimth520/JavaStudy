package ex03_김태현;

import java.util.Scanner;

public class Stars2 {
	public static void main(String[] args) {
		//로직 
		//입력 클래스 import
		//입력 메시지 출력
		//행으로 입력받을 정수 선언 및 입력 메소드
		//행은 입력받은 숫자 까지 나와야 하니까 
		//for문으로 별찍기 구성 (int i = 1; i <= num; i++)
		//이중for문(int j = 0; j < i; j++)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("행의 개수를 입력해주세요");
		int num = sc.nextInt();
		
		
		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
