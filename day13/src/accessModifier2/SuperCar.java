package accessModifier2;

public class SuperCar extends Car {

	@Override
	void speedUp() {
		setSpeed(getSpeed() + 20);//private 필드 접근은 getter와 setter를 통해 처리
		System.out.println("슈퍼카가 가속합니다" + getSpeed());
		
		SuperCar superCar = new SuperCar();
	      superCar.speedUp(); //자식클래스의 객체는 오버라이딩 된 메소드 호출
	      superCar.stop();
	}
	
}
