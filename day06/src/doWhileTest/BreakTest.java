package doWhileTest;
//기타 제어문
public class BreakTest {
	public static void main(String[] args) {
		//1~10까지 중 5까지만 출력
//		for(int i=0; i<10; i++ ) {
//			System.out.println(i + 1);
//			if(i ==4) {
//				break ;
//			}
//		}
//		System.out.println("출력 끝");
//		
//		// break 위치 비교
//		
//		for(int i=0; i<10; i++ ) {
//			if(i ==4) {
//				break ;
//			}
//			System.out.println(i + 1);
//		}
//		System.out.println("출력 끝");
		
		//1~10까지중 7까지만 출력(while)
		int num = 1;
		while(num <= 10 ) {
			if(num ==8) { //num > 7도 가능
				break;
			}
			System.out.println(num);
			num++;
		}
		
	}
}
