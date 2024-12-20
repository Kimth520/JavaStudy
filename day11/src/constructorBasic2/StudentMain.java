package constructorBasic2;
//기본 생성자 확인
//필드와 매개변수가 동일할때 문제 해결 : this
class Student {
	   // 필드
	   String name;
	   int age;

	   // 생성자
	   public Student(String name, int age) {
	      this.name = name; // 의도한대로 동작하지 않는다
	      this.age = age; // 지역변수의 값을 그대로 대입하기 때문에 필드는 초기화 되지 않는다
	      System.out.println(this.name);
	      System.out.println(name);
	   }

	   // 메소드
	   void studentInfo() {
	      System.out.println("이름 : " + name);
	      System.out.println("나이 : " + age);
	   }
	}

	public class StudentMain {
	   public static void main(String[] args) {
	      Student st1 = new Student("짱구", 5);
	   }
	}
