package method;

public class MethodOverloading02 {
	public static void main(String[] args) {
		
		System.out.println(add(10,20));
		add(1.1, 5);
		add(1, 1, 5);
	}
	static int add(int num1, int num2) {
		return num1 + num2;
	}
	//매개변수의 개수가 다름 
	static void add(int num3, int num4, int num5) {
		System.out.println(num3 + num4 + num5);
	}
	//매개변수의 타입이 다름
	static void add(int num1, double num2) {
		System.out.println(num1 + num2);
	}
	//매개변수의 순서가 다름
	static void add(double num1, int num2) {
		System.out.println(num1 + num2);
	}
//	//메소드의 리턴 타입만 다른 경우
//	static double add(double num1, int num2) {
//		System.out.println(num1 + num2);
//	}
//	//매개변수의 타입, 개수, 순서가 똑같지만 매개변수의 이름이 다른 경우
//	static double add1(double num1, int num2) {
//	System.out.println(num1 + num2);
//	
	
}