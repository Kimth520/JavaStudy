package scanner;

import java.util.Scanner;

public class ScannerTest04 {
	public static void main(String[] args) {
		
		//사용자로부터 주소를 입력받아 출력하기
		//3개의 next 메소드를 사용하여 서울시 강남구 역상동으로 출력할 수 있도록 할 것
		
		//1. 입력클래스 import
		//2. 출력 메시지(1번)
		//3. 입력메소드(.next()) 3개
		//4. 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주소를 입력하세요: ");
		
		String city = sc.next(); //입력값을 공백단위로 나누어 처리
		String district = sc.next();
		String neighborhood = sc.next();
		
//		 System.out.println("입력한 주소는 " + city + " " + district + " " + neighborhood + "입니다");
		System.out.printf("%s %s %s", city, district, neighborhood);
		//5. Scanner 자원 해제
		sc.close();
		
	}
}
