package ex05_김태현;

public class Zoo {
//	필드
//   Animal[] animals : 동물 객체 배열
//   int animalCount : 현재 동물 수
//	생성자
//    배열 크기를 매개변수로 받아 초기화
//	메소드
//    void addAnimal : 동물을 배열에 추가, 매개변수는 참조변수의 다형성 이용할 것
//    배열 크기를 초과하면 "더 이상 동물을 추가할 수 없습니다"를 출력
//    void printAllAnimals() : 모든 동물의 이름과 행동을 출력
	
	
	//로직
	//생성자는 배열의 크기이므로 배열의 크기는 동물 수
	
	//필드
	Animal[] animals;
	int animalCount;
	
	//생성자 
	public Zoo(int animalCount) {
		this.animalCount = animalCount;
	}
	
	//메소드
	void addAnimal() {
		int[] Animals = new int[animalCount];
		
	}
	
	void printAllAnimal() {
		
		System.out.println(Animals[]+"");
	}
}

