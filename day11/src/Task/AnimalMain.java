package Task;

public class AnimalMain {
	public static void main(String[] args) {
		Animal dog = new Animal("멍멍이", 3, "강아지");
		dog.eat();
		dog.play();
		dog.sleep();
		dog.birth();
	}
}