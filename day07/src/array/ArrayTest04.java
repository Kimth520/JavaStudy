package array;

public class ArrayTest04 {
	public static void main(String[] args) {
		//1부터 10까지의 값을 배열에 널고 출력하기
		//1) 배열 선언 및 생성=> 값을 알 때
		int[] number1 = {1,2,3,4,5,6,7,8,9,10};
		int[] number2 = {1,2,3,4,5,6};

		//배열명.length : 배열의 길이, 뱌열의 길이에서 -1이 인덱스 끝 번호
		
		//2)배열의 출력
//		for(int i = 0; i< number1.length; i++ ) {
//			System.out.println(number1[i]);
//		}
//		
//		for(int i = 0; i< number2.length; i++ ) {
//			System.out.println(number2[i]);
//		}
		
		
		//1부터 10까지의 값을 배열에 널고 출력하기
		//1) 배열 선언 및 생성(값을 모를 때)
		//2) for문(초기식 int i=0(인덱스 번호는 0부터 시작);
		//조건식 i < 배열명.length; (배열의 길이보다 작을 동안 반복)
		// 증감식 i++){
		//3) 출력 배열명 [i]}
		
//		int[] number3 = new int[10];//10칸짜리 배열을 생성하면 인덱스 번호는 0~9까지
//		
//		for(int i =0; i<number3.length; i++) {
//			number3[i] = i + 1;
//		}
//		
//		for(int i = 0; i<number3.length; i++) {
//			System.out.println(number3[i]);
//		}
		
		//
		//5부터 1까지의 값을 배열에 담고 출력
		
		//로직구성
		//1) 배열선언
		//2)값을 대읿하는 반복문(for문)
		//초기식 int i = 0;
		//조건식 => i<배열명.length
		//증감식 => i++
		
		int[] number4 = new int[5];
		
		for(int i=0; i<number4.length; i++ ) {
			number4[i] = number4.length-i;
			
		}
		for(int i=0; i<number4.length; i++) {
			System.out.println(number4[i]);
		}
		
		// 2번째방법) 초기식을 5로 시작
//	         int i = 5;
//	         i > 5 - 배열명.length; //5
//	         i--
	      for(int i = number4.length; i > (5 - number4.length); i--) {
	         number4[number4.length - i] = i;
	         System.out.println(number4[number4.length-i]);
	      }
	      
	      //i = 5; 5 > 5 - 5; t   i-- i = 4
	      //i = 4; 4 > 5 - 5; t    i-- i = 3
	      //i = 3; 3 > 5 - 5; t   i-- i = 2
	      //i = 2; 2 > 0;   t       i-- i =1
	      //i = 1; 1 > 0; t      i-- i = 0
	      //i = 0; 0 > 0; f
	     
	      //빠른 for문
	      for(int data : number4) {
	    	  
	    	  System.out.println("값 :" + data);
	      }
	
		
}
}
