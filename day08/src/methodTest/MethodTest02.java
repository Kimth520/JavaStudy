package methodTest;
//메소드 정의 및 호출
public class MethodTest02 {
	public static void main(String[] args) {
		//메소드 호출 방법 2가지
//		1) 메소드 정의하는 부분에서 static키워드 붙인다
//		(main메소드가 메모리에 할당될 때 add 메소드도 같이 할당시키는 방법)
		
//		2) 메인 메소드에 add메소드가 있는 클래스를 알려준다
//		클래스명 변수 = new 클래스명();
		MethodTest02 mt = new MethodTest02();
		System.out.println(mt);//주소값
//		System.out.println(mt.add(10, 20));//리턴값이 없는 메소드는 출력문 쓸수 없음
		mt.add(10, 20);//인수들은 매개변수에 차례대로 전달
		
		
		 MethodTest02 mt1 = new MethodTest02();
	      System.out.println(mt);//주소 다름
	      System.out.println(mt1);
	      mt1.add(10, 10);

		
	}
		
	void add(int num1, int num2) {
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num1+num2);
	}
	//2개의 값을 더하는 기능의 매소드 add
		//리턴타입
		//메소드명
		//매개변수
		//실행할 문장 => num1출력, num2출력, num1 + num2 출력 
		//리턴값 x
	
}
