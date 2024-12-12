package ex05_김태현;

public class Pet extends Animal{

//	  Animal 추상 클래스를 상속받아 구현
//	  생성자
//	   name을 매개변수로 받아 초기화
//	  메소드
//	    void play() : 동물이 장난치는 행동을 출력
//	    void eat() : 동물이 먹는 행동을 출력
//	    void sleep() : 동물이 잠자는 행동을 출력
//	    void performActions() : 위 세 메소드를 호출하여 행동을 출력
	
	Pet animal = new Pet("동물");
	
	//생성자
	public Pet(String name) {
		super(name);
	}

	//메소드
	
	void play() {
		System.out.println("장난 치기");
	}
	
	void eat() {
		System.out.println("맛있게 밥먹기"); 
		
	}
	
	void sleep() {
		System.out.println("잠자기");
	}
	
	
	@Override
	void performActions() {
		play(); eat(); sleep();
	}
	
	

}
