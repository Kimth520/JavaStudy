package classBasic;
//1.1 클래스 - 사용자 정의 타입이다(자료형)
public class Student {
	//필드(속성)
	int math;
	int eng;
	int kor;
	double avg;
	String name;
	
	//메서드(기능)
	//1-3 연관성있는 저장공간과 기능을 한곳에 모아 관리할 수 있는 것
	int getTotal() {
		return math + eng + kor;
	}
	
}
