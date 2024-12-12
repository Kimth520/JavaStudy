package ex04_김태현;

public class Person {
//	- 필드 (private) : String name(학생 이름)
//  - 생성자 : 이름을 매개변수로 받아 초기화
//  - 메소드 :  getName() : name 필드의 값을 반환
	
	///필드
	private String name;

	
	//생성자
	public Person(String name) {
		this.name = name;
	}
	
	//메소드 로직
	//반환타입은 String
	//return 후 필드 네임
	
	String getName() {
		return name;
	}
	
}
