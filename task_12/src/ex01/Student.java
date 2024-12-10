package ex01;

public class Student {
	// 필드
	String name;
	int javaScore;
	int dbmsScore;
	int totalScore;
	String grade;

	// 생성자
	public Student(String name, int javaScore, int dbmsScore, int totalScore, String grade) {
		super();
		this.name = name;
		this.javaScore = javaScore;
		this.dbmsScore = dbmsScore;
		this.totalScore = totalScore;
		this.grade = grade;
	}
	
	

	// 메소드

	// 학점을 구할 매소드
//		String calculateGrade(int avgScore) {
//			return (score1 + score2)/2;
//		}

	// 통과를 구할 매소드
	boolean isPass(int avgScore) {
			return avgScore>=70;
	}
}
