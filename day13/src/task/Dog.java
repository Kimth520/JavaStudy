package task;

public class Dog extends Animal {

	@Override
	void cry() {
		System.out.println("멍멍");
	}
	
	void walk() {
		System.out.println("산책을 갑니다");
	}
	
}
