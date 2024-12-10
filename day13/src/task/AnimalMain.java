package task;

public class AnimalMain {
	public static void main(String[] args) {
//		Animal ani = new Animal();//부모 클래스 부모 객체
//		Animal cat = new Cat();//부모클래스에 자식 dog 객체 업캐스팅
//		Animal dog = new Dog();//부모클래스에 자식 cat 객체 업캐스팅
//		Animal mouse = new Mouse();//부모클래스에 자식 mouse 객체 업캐스팅
//		
//		printCrying(ani);
//		printCrying(dog);
//		printCrying(cat);
//		printCrying(mouse);
		
		
	//   (각 객체를 넣었을 때 결과 출력-어떤과정이 진행되었는지 주석달아 작성)
	      Cat cat = new Cat();
	      printCrying(cat);
	      printCrying(new Dog());

	      Animal[] ani = { new Cat(), new Dog(), new Mouse() };
	      System.out.println(ani);
	      System.out.println(ani[0]);

	      // 공통메소드 호출 다운 캐스팅으로 고유 메소드 호출
	      for (Animal animal : ani) {
	         printCrying(animal);
	      }

	   }

	   static void printCrying(Animal animal) {
	      // 업캐스팅된 상태에서 공통 메소드 호출
	      animal.cry();

	      if (animal instanceof Cat) {
	         ((Cat) animal).play();
	      } else if (animal instanceof Dog) {
	         ((Dog) animal).walk();
	      } else if (animal instanceof Mouse) {
	         ((Mouse) animal).sleep();
	      }

	   }
	}
