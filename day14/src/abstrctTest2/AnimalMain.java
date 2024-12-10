package abstrctTest2;

public class AnimalMain {
	public static void main(String[] args) {
		
		//업캐스팅하여 객체화
		Animal animal = new Cat();
		Animal animal2 = new Dog();
		
		System.out.println(animal);
		System.out.println(animal2);
		
		animal.crying();
		animal2.crying();
	}
}
