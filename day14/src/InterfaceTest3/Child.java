package InterfaceTest3;

public class Child implements ParentA, ParentB{
	//두개의 인터페이스의 메서드 명이 같으니 오버라이딩 해줘야함
	//어떤 부모의 것을 쓸건지 모호성 없애주기
	@Override
	public void greet() {
		// TODO Auto-generated method stub
		ParentA.super.greet(); // A와B중 하나 설정
	}
	
	//다중 구현 충돌 문제
	//Child 클래스가 두 인터페이스를 모두 사용할 떄 어떤 인터페이스에 있는
	//greet()를 사용할 지 모호성이 발생한다
	//=> Child 클래스에서 greet() 메소드를 반드시 재정의해줘야 한다
	//ParentA.super.greet()는 ParentA 인터페이스의 default greet 메소드 호출
	
}
