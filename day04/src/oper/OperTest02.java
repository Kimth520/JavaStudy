package oper;
//복합대입 연산자
public class OperTest02 {
	public static void main(String[] args) {
		
		int num = 1;
		System.out.println(num);
		System.out.println(num+10); //출력은 1회성 
		
//		num = num + 10;
		System.out.println(num);
		num += 10; //num = num + 10; 
		//num 에 저장된 값 + 10, 연산된 값을 num 변수에 저장
		System.out.println(num);
		
		num *= 2;
		System.out.println(num);
		
		num /=2;
		System.out.println(num);
		
		System.out.println("==========증감연산자=========");
		int num2 =1;
		System.out.println("기존 num2의 값 : " + num2);
		System.out.println("전위형을 사용한 값 : " + ++num2);
		System.out.println("전위형을 적용한 뒤의 num2 값 : " + num2);
		
		int num3 = 1;
		System.out.println("기존 num3의 값 : " + num3);
		System.out.println("후위형을 사용한 값 : " + num3++);
		System.out.println("후위형을 적용한 뒤의 num3 값 : " + num3);
		
		 int num4 = 7, num5 = 7;
		 int result1 = 0, result2 = 0;

		   result1 = --num4 + 4; //--num4은 전위감소연산자 num1의 값이 먼저 감소한 뒤에 연산에 사용된다
		   	//num4의 값 : 7 -> 6
		      //계산 : 6 + 4의 결과값이 result1 변수에 대입, 결과 10

		   result2 = num5-- + 4; //num5--는 후위감소연산자 num2의 현재 값이 연산에 사용된 후 감소된다
		   //num5의 값 : 7
		      //계산 : 7 + 4의 결과값이 result2 변수에 대입, 결과 11
		      //그 후 num5의 값 : 7 -> 6

		   System.out.println(result1);
		   System.out.println(result2);
		
	}
}
