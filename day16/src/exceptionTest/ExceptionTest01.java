package exceptionTest;

public class ExceptionTest01 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		int result = 10/0;
		System.out.println(result);
		//java.lang.ArithmeticException
		System.out.println("프로그램 종료");
	}
}
