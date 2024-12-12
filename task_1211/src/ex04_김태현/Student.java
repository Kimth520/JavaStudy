package ex04_김태현;

public class Student extends Person{

//	- 필드 (private) : int javaScore, int dbmsScore, int htmlScore(과목 점수)
//    - 생성자 : Person의 생성자를 호출하고, 각 점수 초기화
//    - 메소드
//     getTotalScore() : 세 과목 점수를 더한 값(정수)을 반환
//     getAverageScore() : 평균(정수형)으로 반환
	
	private int javaScore = 0;
	private int dbmsScore = 0;
	private int htmlScore = 0;
	
	
	//생성자
	
	public Student(String name, int javaScore, int dbmsScore, int htmlScore) {
		super(name);
		this.javaScore = javaScore;
		this.dbmsScore = dbmsScore;
		this.htmlScore = htmlScore;
	}
	
	//메소드 로직
	//반환타입은 정수형 int
	//return 후 세 점수의 총합
	
	int getTotalScore() {
		return (this.javaScore + this.dbmsScore + this.htmlScore);
	}
	
	//반환타입은 정수형 int
	//return 후 getTotalScore을 3으로 나눈 값을 강제로 정수형으로 형변환
	int getAverageScore() {
		return (int)(getTotalScore()/3);
	}


}
