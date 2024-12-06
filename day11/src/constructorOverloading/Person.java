package constructorOverloading;

//생성자 오버로딩
public class Person {
	// 필드
	String name;
	int age;
	String job;

	// 1. 기본 생성자
	public Person() {
		this.name = "이름없음";
		this.age = 0;
		System.out.println(this);
		System.out.println("기본 생성자가 생성되었습니다");
	}

	// 2. 이름만 초기화 하는 생성자
	public Person(String name) {
		this.name = name;
		this.age = 20;// 나이의 기본값
		System.out.println("이름은 인수로 받고, 나이는 20살 기본값으로 할당한 생성자가 호출되었습니다");
	}

	// 3. 이름과 나이를 초기화 하는 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.job = "미정";
		System.out.println("이름과 나이를 초기화하는 생성자가 호출되었습니다");
	}

	// 4. 나이와 이름을 초기화 하는 생성자
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	// 5. 이름과 직업을 초기화 하는 생성자
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	// 6. 직업과 이름을 초기화 하는 생성자(오버로딩 x => 5번과 같은 타입의 생성자라)
//  public Person(String job, String name) {
//     
//  }

	// 7. 모든 정보 초기화
	public Person(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
	}

}