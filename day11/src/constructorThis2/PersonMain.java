package constructorThis2;

public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("홍길동", 20);
		System.out.println(p1);
		System.out.println(p2);
		
		p1.printInfo();
		p2.printInfo();
	}
}
