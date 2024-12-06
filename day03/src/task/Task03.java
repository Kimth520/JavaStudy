package task;

public class Task03 {
	public static void main(String[] args) {
		//int, long, double, float, boolean, char
	    //1. 정수(int) -> 모든 자료형 강제형변환 가능여부 확인
		int intVal = 100;
		
		long result1 = (long)intVal;
		float result2 = (float)intVal;
		double result3 = (double)intVal;
		char result4 = (char)intVal;
//		boolean result5 = (boolean)intVal;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
//		System.out.println(result5);
	      
	    //2. 정수(long) -> 모든 자료형 강제형변환 가능여부 확인
		long longVal = 100L;
		
		int result6 = (int)longVal;
		float result7 = (float)longVal;
		double result8 = (double)longVal;
		char result9 = (char)longVal;
//		boolean result10 = (boolean)longVal;
		
		System.out.println(result6);
		System.out.println(result7);
		System.out.println(result8);
		System.out.println(result9);
//		System.out.println(result10);
	      
	    //3. 실수(double) -> 모든 자료형 강제형변환 가능여부 확인
		double doubleVal = 100.1;
		
		int result11 = (int)doubleVal;
		long result12 = (long)doubleVal;
		float result13 = (float)doubleVal;
		char result14 = (char)doubleVal;
//		boolean result15 = (boolean)doubleVal;
				
		
		System.out.println(result11);
		System.out.println(result12);
		System.out.println(result13);
		System.out.println(result14);
//		System.out.println(result15);
	      
	    //4. 실수(float) -> 모든 자료형 강제형변환 가능여부 확인
		float floatVal = 100.1f;
		
		int result16 = (int)floatVal;
		long result17 = (long)floatVal;
		double result18 = (double)floatVal;
		char result19 = (char)floatVal;
//		boolean result20 = (boolean)floatVal;
		
		System.out.println(result16);
		System.out.println(result17);
		System.out.println(result18);
		System.out.println(result19);
//		System.out.println(result20);
	      
	    //5. 논리형 (boolean) -> 모든 자료형 강제형변환 가능여부 확인
		boolean boolVal = true;
		
//		int result21 = (int)boolVal;
//		long result22 = (long)boolVal;
//		float result23 = (float)boolVal;
//		double result24 = (double)boolVal;
//		char result25 = (char)boolVal;
		
//		System.out.println(result21);
//		System.out.println(result22);
//		System.out.println(result23);
//		System.out.println(result24);
//		System.out.println(result25);
		
	    //6. 문자형(char) -> 모든 자료형 강제형변환 가능여부 확인
		char charVal = 'A';
		
		int result26 = (int)charVal;
		long result27 = (long)charVal;
		float result28 = (float)charVal;
		double result29 = (double)charVal;
//		boolean result30 = (boolean)charVal;
		
		System.out.println(result26);
		System.out.println(result27);
		System.out.println(result28);
		System.out.println(result29);
//		System.out.println(result30);
	}
}