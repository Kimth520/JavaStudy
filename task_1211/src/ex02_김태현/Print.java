package ex02_김태현;

public class Print {
	public static void main(String[] args) {
//		15부터 30까지 중 짝수의 합을 출력하라
//		- 클래스명 : Print
//		- 단, while문을 사용할 것

		// 로직
		// 정수형 변수 선언 후 15로 초기화
		// 합을 구해줄 변수 선언 sum
		// while 문을 사용하여 15부터 30까지의 짝수의 합을 구함
		//while 문은 15부터 30까지만 반복하도록 설정
		// 15부터 시작해서 짝수만 골라 합하고 ++를 사용하여 반복한번마다 숫자를 1 증가 시킴
		// 짝수일때 합하고 홀수일떄 continue를 사용하여 반복을 건너뜀

		int num = 15;
		int sum = 0;

		while (num >=15 &&num<=30) {
			if (num % 2 == 0) {
				sum += num;
				num++;
			} else {
				num++;
				continue;
			}
			
		}
		System.out.println("15부터 30까지 짝수의 합은: " + sum);
		
		
	}

}
