package oper;
//비트 연산자
public class BitOper {
	public static void main(String[] args) {
		System.out.println(10 & 11); // 1010 & 1011 => 1010
		System.out.println(10 | 11); // 1010 | 1011 => 1011
		System.out.println(10 ^ 11); // 1010 | 1011 => 0001
		System.out.println(~10); // ~1010 => 
	
		
		System.out.println("십진수 : " + 10 + "=> 이진수 : " + Integer.toBinaryString(10));
		System.out.println("십진수 : " + 11 + "=> 이진수 : " + Integer.toBinaryString(11));
		
		System.out.println("10 & 11의 십진수 : " + (10&11));
		System.out.println("10 & 11의 이진수 : " + Integer.toBinaryString(10 & 11));
		
		System.out.println("10 | 11의 십진수 : " + (10|11));
		System.out.println("10 | 11의 십진수 : " + Integer.toBinaryString(10 | 11));
		
		System.out.println("10 ^ 11의 십진수 : " + (10^11));
		System.out.println("10 ^ 11의 십진수 : " + Integer.toBinaryString(10 ^ 11));
		
		//~x = -(x+1)
		System.out.println("~10의 십진수 : " + (~10));
		System.out.println("~10의 이진수 : " + Integer.toBinaryString(~10));
		
		//쉬프트연산자
		// <<, >>
		System.out.println(10 << 1); //0001010 << 1
		System.out.println("이진수 : " + Integer.toBinaryString(10 << 1));
		
		System.out.println(10 >> 1); //0001010 << 1
		System.out.println("이진수 : " + Integer.toBinaryString(10 >> 1));
		
		
	}
}
