package ex04_김태현;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//   Student 객체를 생성하여 이름과 점수를 입력받는다(입력받을 점수는 0~100 범위 내, 입력클래스 사용)
//	 각 학생의 총점과 평균을 출력한다
		
		//로직
		//각 이름과 세 점수에 해당하는 변수 선언 및 초기화
		//입력 클래스 import
		//입력 메시지 출력 및 해당하는 입력 메소드 선언
		//Student 객체 생성하고 매개변수에 이름과 세 점수 변수 대입
		//Student는 Person의 자식 객체이므로 두 객체의 메서드를 모두 사용 가능
		//Student에서 만든 메소드를 활용하여 이름과 총 점수 평균점수 출력 
				
		String name = "";
		int javaScore = 0;
		int dbmsScore = 0;
		int htmlScore = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학생의 이름을 입력하시오");
		name = sc.next();
		System.out.println("학생의 세 점수를 띄어쓰기로 구분하여 차례대로 입력하시오");
		javaScore = sc.nextInt();
		dbmsScore = sc.nextInt();
		htmlScore = sc.nextInt();
		
		Student st = new Student(name, javaScore, dbmsScore, htmlScore);
		System.out.println("학생의 이름은 : " + st.getName());
		System.out.println("학생의 총점은 : " + st.getTotalScore()); 
		System.out.println("학생의 평균점수는 : " + st.getAverageScore());
		
		
	}

}
