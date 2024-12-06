package twoForTest;

public class TwoForTask01 {
	public static void main(String[] args) {
		
//      i, j의 규칙성 찾기
	      
//      1번 : 역삼각형
//      *****
//      ****
//      ***
//      **
//      *
      
//      2번 : 피라미드와 유사하지만 좌측 정렬
//      *
//      * * *
//      * * * * *
//      * * * * * * *
      
//      3번 : 피라미드 (for문이 총 3개-> 어떻게 사용될지 먼저 생각하기)
//        *
//       * *
//      * * *
		
		
		//1
		//i = 바깥 for문(행)
		//j = 안쪽 for문(열)
//		for(int i = 5; i>0; i--) {//5행
//			for(int j = 1; j<=i; j++) {i만큼 반복
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		//2
//		for(int i = 1; i<=4; i++) {
//			for(int j= 1; j<=2*i-1; j++) {//홀수 공식 사용
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		//3 for문 세개
		for(int i = 1; i <=3 ;i++) {
			for(int j= 1; j<=3-i; j++) {//공백을 의미하는 for문 2,1,0줄어듬
				System.out.print(" ");
			}
			for(int k = 1; k<=i; k++) {//별을 의미하는 for문 1,2,3늘어남
					System.out.print("* "); 
								
			}
			System.out.println();
		}
		
	}
}
