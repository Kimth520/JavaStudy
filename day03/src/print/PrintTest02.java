package print;
//8번 : 출력메소드(printf)

public class PrintTest02 {
	public static void main(String[] args) {
		//정수형
		int num1 = 200;
		System.out.printf("10진수 : %d\n", 100);
		System.out.printf("10진수 : %d\n", num1);
		System.out.printf("8진수 : %o\n", 377);
		System.out.printf("16진수 : %x\n", 0xff);
		System.out.printf("16진수 : %x\n", 10);//10 => a, 15 => f
		System.out.printf("16진수 : %x\n", 26);//26
		
		//실수형
		System.out.printf("실수형 : %f\n", 3.123456);// 소수점자리 7자 이상되면 7번째 자리에서 반올림
		System.out.printf("실수형 소수점 2자리까지 : %.2f\n", 3.123456);
		
		//문자형
		System.out.printf("문자형 : %c\n", 'a');
		System.out.printf("문자형 : %c\n", 'A');
		
		//문자열
		System.out.printf("문자열 : %s\n", "Hello");
		String data = "hello, java";
		System.out.printf("문자열 : %s", data);
		System.out.printf("문자열 : %.5s", data); //문자열에서 .n 형태로 쓰게 되면 해당 자리수까지만 문자열이 잘라서 출력
		
		//논리형
		System.out.printf("\n논리형 : %s", true);
		
		//복합 사용
		int age = 20;
		String name = "김태현";
		double date = 11.25;
		boolean isStudy = true;
		System.out.printf("\n이름 : %s, 나이 : %d, 오늘날짜 : %.2f, 공부중 여부 : %s", name, age, date, isStudy);
	}
}
