package classBasic;
//Student 클래스의 객체를 만들 클래스
public class StudentMain {
	public static void main(String[] args) {
		
		Student st1 = new Student();
		Student st2 = new Student();
		
		System.out.println(st1); 
		System.out.println(st2); 
		
		st1.name = "태현";
		st1.kor = 100;
		
		st2.name = "짱구";
		st2.kor = 100;
		st2.eng = 50;
		st2.math = 77;
//		st2.avg = (double)(st2.kor+ st2.eng + st2.math)/3;
//		
//		//객체마다 고유한 값 저장 가능
//		System.out.println(st1.name);
//		System.out.println(st2.name);
//		
//		System.out.printf("%s의 평균 점수는 %.2f점 입니다", st2.name, st2.avg);
		
		//1-4 연관성있는 저장공간과 기능을 한곳에 모아 관리할 수 있는것
		System.out.println(st2.getTotal());		
		
		st1.kor = 50;
		st1.eng = 30;
		st1.math = 100;
		System.out.println(st1.getTotal());
	}
}
