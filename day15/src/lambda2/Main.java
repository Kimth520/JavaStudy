package lambda2;

public class Main {
	public static void main(String[] args) {
//		2개의 정수를 매개변수로 받아서 곱한 결과를 반환하는 메소드(람다식 이용)
//		FunctionalInter3 이용하기

		FunctionalInter3 fi3 = new FunctionalInter3() {
			
			@Override
			public int multi(int num1, int num2) {
				return num1 * num2;
			}
		};
		FunctionalInter3 f3 = (num1 , num2) -> (num1 *num2);
		System.out.println(f3.multi(10, 10));
		
//		람다식을 이용하여 2개의 문자열을 연결하여 출력한다.

		FunctionalInter4 fi4 = new FunctionalInter4() {
			
			@Override
			public String combineString(String a, String b) {
				return a + b;
			}
		};
		FunctionalInter4 f4 = (a,b) -> (a+b);
		System.out.println(f4.combineString("김", "태현"));
		
	}
}
