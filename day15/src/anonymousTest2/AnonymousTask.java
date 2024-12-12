package anonymousTest2;

//Calculator 인터페이스
interface Calculator {
	int add(int num1, int num2);

	int multi(int num1, int num2);
}

//추상메소드2
//- 두개의 매개변수 받아 더한값을 반환하는 메소드
//- 두개의 매개변수를 받아 곱한 값으 ㄹ반환하는 메소드

public class AnonymousTask {
	// 익명클래스로 객체 생성 후 메소드 호출하기
	public static void main(String[] args) {
		Calculator cc = new Calculator() {

			@Override
			public int add(int num1, int num2) {
				return num1 + num2;
			}

			@Override
			public int multi(int num1, int num2) {
				return num1 * num2;
			}

		};
		int sum = cc.add(10,20);
		int product = cc.multi(100, 100);
		System.out.println(sum);
		System.out.println(product);
		
	}

}
