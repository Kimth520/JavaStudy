package task;

import java.util.Scanner;

public class task1 {
//	1. 숫자를 입력받아 1부터 입력받은 숫자까지의 합을 출력하는 프로그램을 만드세요. 
//	그리고 숫자가 아닌 값이 입력될 경우 "잘못된 입력입니다"라는 예외 메시지를 출력하고, 
//	프로그램을 종료하세요.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오");
		int total = 0;
		
		
			try {
				int num = sc.nextInt();
				for(int i = 1; i<=num; i++) {
					total += num;
				}
			} catch (Exception e) {
				System.out.println("잘못된 입력입니다");
				System.out.println("프로그램을 종료합니다");
			}
		
			System.out.println(total);
		
		
	}
}
