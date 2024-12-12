package anonymousTest2;

public class AnimalMain {
	public static void main(String[] args) {
		Animal cat = new Animal() {

			@Override
			public void speak() {
				System.out.println("키야야야야아옹");
			}
			
		};
		Animal dog = new Animal() {

			@Override
			public void speak() {
				System.out.println("와로아롸오라ㅗ왈ㅇ롸오롤");
				
			}
				
		};
		
		System.out.println(cat);
		System.out.println(dog);
		
	}
}
