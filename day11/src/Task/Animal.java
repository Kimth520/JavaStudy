package Task;

public class Animal {
//	1. 동물 클래스를 작성하세요
//	 필드(속성) : '이름', '나이', '종류'라는 필드
//	    - 이름 : 동물의 이름을 저장하는 곳
//	    - 나이 : 동물의 나이를 저장하는 곳
//	    - 종류 : 동물의 종류(개, 고양이, 새 등)를 저장하는 곳
//	 메서드(행동)
//	    - 밥먹기() : 동물이 밥을 먹는 행동을 하는 메서드
//	    - 놀기() : 동물이 노는 행동을 하는 메서드
//	    - 자다() : 동물이 자는 행동을 하는 메서드
//	    - 생일축하() : 동물의 생일을 축하하는 메서드

	//필드
	String name;
	int age;
	String kind;
	
	//생성자
	public Animal(String name, int age, String kind) {
		this.name = name;
		this.age = age;
		this.kind = kind;
	}
	
	//메서드
	//밥먹기
	void eat() {
		System.out.println( this.kind+ "인 " + this.name +"가 밥을 먹는다");
	}
	//놀기
	void play() {
		System.out.println( this.kind+ "인 " + this.name +"가 재밌게 놀기 시작한다");
	}
	//잠자기
	void sleep() {
		System.out.println( this.kind+ "인 " + this.name +"가 잠을 잔다");
	}
	//생일 축하
	void birth() {
		System.out.println( this.kind+ "인 " + this.name +"의 " + this.age + "번째 생일을 축하합니다");
	}

	
	
}
