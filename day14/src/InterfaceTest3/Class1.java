package InterfaceTest3;

public class Class1 {
	public void printText() {//public 생략시 충돌날 수 있음
		System.out.println("Class1의 메서드 printText()");
		
		//Class1과 Inter1 양쪽에 printText() 메소드가 존재하지만
		//오류발생하지 않는 이유는 구현하는 인터페이스보다 상속받는 부모 클래스의 우선순위가 더 높기 때문이다   
	}
}
