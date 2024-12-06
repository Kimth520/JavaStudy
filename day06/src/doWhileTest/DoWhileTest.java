package doWhileTest;

public class DoWhileTest {
	public static void main(String[] args) {
		
		boolean isFalse = false;
		
		//while문
//		while(isFalse) {
//			System.out.println("hi");
//		}
//		System.out.println("출력끝");
		
		//do - 재확인 하거나 메뉴주문 등 선택하지 않아도 무조건 실행될 프로그램에 사용
		do {
			System.out.println("hi");
		}while(isFalse);
		System.out.println("출력끝");
		
	}
}
