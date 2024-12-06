package marvelTask;

public class MarvelHero {
	//마블에 나오는 히어로를 객체로 만들어 출력하기
	//필드 = 이름, 슈퍼파워(String superpower), 나이
	//생성자
	//모든 필드를 매개변수로 받는 생성자
	//정보출력 매소드(printInfo())
	//모든 필드 내용 출력
	
	//필드
	String name;
	String superpower;
	int age;
	
	//생성자
	public MarvelHero(String name, String superpower, int age) { 
		this.name = name;
		this.superpower = superpower;
		this.age = age;
		System.out.println(this);
	}
	
	//메소드
	void printInfo() {
		System.out.println("히어로의 이름은 " + this.name  + ", 히어로의 능력은 " + this.superpower  + ", 히어로의 나이는 " + this.age + "입니다");
	}
	
	void performAction() {
			System.out.println(this.name + "이 " +this.superpower + "을 시작합니다.");
		
			
	}
	
	
}
