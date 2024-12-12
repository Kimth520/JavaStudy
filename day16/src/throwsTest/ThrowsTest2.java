package throwsTest;

import java.util.Scanner;

public class ThrowsTest2 {
	static void method1() throws InterruptedException {
		System.out.println("양수만 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int result = sc.nextInt();
		if(result <= 0) {
			throw new NumberFormatException();
		}
		System.out.println("입력한 숫자는 " + result);
	}
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
