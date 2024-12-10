package ex01;

import java.util.Scanner;

//김태현
public class Main {
	public static void main(String[] args) {
		// 입력 클래스 import
		Scanner sc = new Scanner(System.in);
		//두과목 점수 변수 선언
		int score1 = 0, score2 = 0;
		int total = 0;
		int avg = 0;
		
		System.out.println("두 과목의 성적을 각각 입력하시오");
		score1 = sc.nextInt();
		score2 = sc.nextInt();
		
		total = score1 + score2;
		avg = total/2;
		
		
		

	}

	// 성적 평가 프로그램
	// 학생의 성적을 2과목 입력 받아 학점을 계산하는 프로그램
	// 90점 이상 A, 80점 이상 B, 70점 이상 80점 미만 C, 70점 미만 F
	// 메소드 두개 이상, 객체를 2개 만들기

	// 사용자로부터 점수를 입력받고 학점과 합격 여부를 출력
	// 필드 : 이름, java점수, dbms점수, 총점, 학점
	// 생성자 : 상관없음
	// 메소드 : calculateGrade(int ) : 두과목의 평균점수 받아 학점 반환하는 메소드(매개변수1개 정수형)
	// isPass(int) : 점수가 70점이상이면 true, 아니면 false반환하는 메소드

	// 로직 구성
	
		
		
	
}

