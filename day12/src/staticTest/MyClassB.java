package staticTest;
//3. 정적 변수와 정적메소드
public class MyClassB {
	public static void main(String[] args) {
		
		//1. 인스턴스 변수 출력 => 객체 생성 필수
		MyClassA a = new MyClassA();
		MyClassA aa = new MyClassA();
		System.out.println(a.instanceVar);
		
		//2. 정적 변수 출력 => 객체 생성으로 접근 가능하나 권장하지 x ->정적변수는 하나의 공통된 저장공간을 사용함
		//클래스명.정적변수명으로 접근
		System.out.println(a.staticVar);//
		System.out.println(MyClassA.staticVar);
		
//		//정적변수는 공통된 저장공간을 사용함 확인
//		a.staticVar = 10;
//		System.out.println(a.staticVar);
//		aa.staticVar = 20;
//		System.out.println(aa.staticVar);
//		System.out.println(a.staticVar);
		
		//3. 다름 클래스에서 인스턴스 메소드 호출
		a.instanceMethod1();
		
		//4. 다른 클래스에서 스태틱 메소드 호출
		MyClassA.staticMethod1();
	}
}
