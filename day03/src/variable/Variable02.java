package variable;
//	변수명 선언 시 주의 사항

public class Variable02 {
	public static void main(String[] args) {
//		문자부터 시작
		int num1 = 10;
		
//		특수문자를 쓸 수 없다(단 , _ 와 $는 가능)
		int _$a = 10;
		
//		공백을 사용할 수 없다(카멜표기법, 스네이크 표기법 등을 활용)
		int numBer = 10; // 첫단어 소문자로 시작, 단어가 바뀔때 대문자 = 카멜 표기법(변수명, 메소드 명 작성시)
		int my_age = 10; // 첫단어 소문자로 시작, 단어가 바뀔 떄 언더바 연결 = 스네이크 표기법(상수 작성시)
		int MyAge = 10; //  첫단어 대문자로 시작, 단어가 바뀔 때 첫문자 대문자로 파스칼 표기법(클래스명 작성시)
		
//		키워드(예약어)를 사용할 수 없다
//		int int = 10;
//		int for = 10;
				
//		되도록 소문자로 시작한다(대소문자를 구분한다)
		int Abc = 10;
		int abc = 10;
		System.out.println(Abc);
		System.out.println(abc);		
	}
}
