package oper;
//관계연산자와 논리연산자
import java.util.Scanner;

public class OperTest03 {
	public static void main(String[] args) {
		
		
		
//		Scanner sc = new Scanner(System.in);
//		int num1 = 0, num2 = 0;
//		
//		System.out.println("숫자 1 : ");
//		num1 = sc.nextInt();
//		System.out.println("숫자 2 : ");
//		num2 = sc.nextInt();
		
		int num1 = 10, num2 = 15;
		
		System.out.println("num1 > num2 : num1이 num2보다 크니?" + (num1 > num2));
		System.out.println("num1 < num2 : num1이 num2보다 작니?" + (num1 < num2));
		System.out.println("num1 >= num2 : num1이 num2보다 크거나 같니?" + (num1 >= num2));
		System.out.println("num1 <= num2 : num1이 num2보다 작거나 같니?" + (num1 <= num2));
		System.out.println("num1 == num2 : num1과 num2가 같니?" + (num1 == num2));
		System.out.println("num1 != num2 : num1과 num2가 같지 않니?" + (num1 != num2));
		
		
		System.out.println("==========논리연산자============");
		System.out.println(true && true);//and - 둘다 참이면 참 
		System.out.println(false && false);
		System.out.println(true && false);
		System.out.println(false && true);
		
		System.out.println(true || true);//or - 둘중 하나라도 참이면 참 
		System.out.println(false || false);
		System.out.println(true || false);
		System.out.println(false || true);
		
		System.out.println(!true);//not - 참이면 거짓, 거짓이면 참
		System.out.println(!false);
		
	}
}
