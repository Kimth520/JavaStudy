package twoForTest;

import java.util.Scanner;

public class TwoForTest03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오 :");
		int num = sc.nextInt();
		sc.nextLine();
		
		for(int i = num; i >0 ; i--) {
			for(int j = 1; j <=i  ; j++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
			
	}
}
