package interfaceTest1;

public class InterMain {
	public static void main(String[] args) {
		//인터페이스 객체화 불가능 => 추상메소드를 구형하는 클래스로 객체화
//		Inter i = new Inter();
		
		ClassA a = new ClassA();
		System.out.println(a);
		a.method2();
		System.out.println(a.VAR1);
		
		Inter i1 = new ClassA();//업캐스팅
		i1.method1();
	}
}
