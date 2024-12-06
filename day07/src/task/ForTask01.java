//김태현
package task;

public class ForTask01 {
	public static void main(String[] args) {
		//1. 1~100까지 출력 tab 키만큼 간격 띄우고 10마다 줄바꿈
		//1		2	3	4	5 ...10
		//11	12 ...			20
		//91 ...				100까지
		
		//로직 구성
		//1~100까지 출력(tab 간격으로 띄우고 10마다 줄바꿈)
		//for문 사용
		//초기식 int i = 1; 조건식 i<=100 ; 증감식 i++
		//i%10 ==0일때 줄바꿈
		for(int i = 1; i<=100; i++) {
			System.out.println(i + "\t");
			if(i%10 ==0) {
				System.out.println();//10개당 줄바꿈
			}
		}
		System.out.println();
	
		//2. A~F출력
		//로직구성
		//초기식 int a = 'A'; 조건식 a <= 'F'; 증감식 a++ 
		//유니코드 문자로 형변환
		for(int a = 'A'; a<= 'F'; a++) {
			System.out.println((char)a + " ");
		}
			System.out.println();
					
		//3. aBcDeFgHiJkLmNoPqRsTuVwXyZ 출력
		//로직구성 
		//초기식 int i = 0; i<26; i++
		//짝수 인덱스는 소문자, 홀수 인덱스는 대문자
		for (int i = 0; i<26; i++) {
			char letter = (char)('a' + i);
			if(i%2 == 0) {
				System.out.print(letter);
			}else {
				System.out.print((char)(letter-32));
			}
		}
		System.out.println();
			
		//4. 1) 1부터 100까지 숫자 중 3과 5의 배수만 한 줄에 5개씩 띄어쓰기로 구분되도록 출력
		// 	 2) 최종적으로 3의 배수 또는 5의 배수 숫자들의 합을 구하기
		//로직구성
		//반복문 1부터 100까지 확인
		//num%3==0||num%5==0
		//\t로 간격띄우고 5개 출력 후 줄바꿈
		//합계 sum 변수에 누적
		//1)
		int count = 0, sum =0;
		for(int num = 1; num<=100; num++) {
			if(num%3 ==0|| num%5 ==0) {
				System.out.println(num + "\t");
				sum += num;
				count ++;
				if(count %5 ==0) {
					System.out.println();
				}
			}
		}
		//2)
		System.out.println();
		System.out.println("3과 5의 배수의 합 : " +sum);
		
	}
}
