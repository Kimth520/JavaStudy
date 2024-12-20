//김태현
package task;

import java.util.Scanner;

public class ArrayTask01 {
	public static void main(String[] args) {
		//배열문제 조건 1) 칸수만 알고있다고 가정
		//		 조건2) 반드시 length 사용
		// 		 조건3) 값을 대입하는 반복문, 값을 출력하는 반복문 각각 사용
		
		//1. 100~1까지의 값을 배열에 넣고 출력
		//일반 for문만 사용
		
//		//1) 배열 선언
//		int[] ar1 = new int[100];
//		//for문으로 100부터 1까지 배열에 넣기
//		for(int i = 0; i<ar1.length; i++) {
//			ar1[i] = ar1.length - i;
//		}
//		//출력
//		for(int i = 0; i< ar1.length; i++) {
//			System.out.println(ar1[i]);
//		}
			
		
		
		//2. 1~10까지의 값을 배열에 넣고 총 합 구하기
		//일반 for문만 사용
		//변수 선언
//		int sum1 = 0;
		//배열 선언
//		int[] ar2 = new int[10];
		//1~10까지의 값 배열에 넣기
//		for(int i=0; i<ar2.length; i++) {
//			ar2[i] = i+1;
//		}
//		//총합
//		for(int i=0; i<ar2.length; i++) {
//			sum1 += ar2[i];
		//출력
//		}
//		System.out.println(sum1);
		
		//3. 사용자에게 4개의 숫자를 입력받고 입력받은 값을 배열에 저장한 후 배열의 평균 구하기
		//일반 for문, for-each 문 상관 없음
		
//		//입력 클래스 import
		Scanner sc = new Scanner(System.in);
//		//배열 선언
//		int[] ar3 = new int[4];
//		//변수 선언
//		int sum2 = 0, avg1 = 0;
//		
//		
//		//숫자 입력메시지 출력
//		System.out.println("4개의 숫자를 입력하시오(띄어쓰기로 구분): ");
//		//for문으로 입력받은 숫자 차례대로 배열에 저장
//		for(int i=0; i<4; i++) {
//			ar3[i] = sc.nextInt();
//		}
//		//sum2에 네 숫자의 합을 넣기
//		for(int i=0; i<4; i++) {
//			sum2 += ar3[i];
//		}
//		//총합과 평균 출력
//		System.out.println(sum2);
//		avg1 = sum2/4;
//		System.out.println(avg1);
		
		
		//4. 0, 1, 2, 3, 4, 0, 1, 2, 3, 4 값을 배열에 담고 출력
		//출력시 for-each문 사용
		//로직구성
		//배열 선언
		//0,1,2,3,4반복 두번 되도록 for문 2개
//		int[] ar4 = new int[10];
//		for(int i = 0; i<5; i++) {
//			ar4[i] = i;
//		}
//		for(int j = 5; j<10; j++) {
//				ar4[j] = j-5;
//			}
//			
//			
//		for (int data : ar4) {
//			System.out.println(data);
//		}
		
		
		//5. A~F까지를 C만 제외하고 배열에 담아 출력
		//일반 for문
		//초기식 int i = 0;
		
		//로직구성
		//A는 65 이므로 67 C를 제외한 70 F까지 출력해야함
//		char ar5 = new char[5];
//		
//		for(int i = 0; i<6; i++) {
//			ar5[i] = i+65;
//			
//		}
		
		
		//6. aBcDeFgHiJkLmNoPqRsTuVwXyZ를 순서대로 배열에 담아 출력
		//로직구성
		//홀수는 소문자로 출력, 짝수는 대문자로 출력
		//for문  int i=0; i<26; i++
		//삼항연산으로 홀수일때랑 짝수일떄 구분
		char[] alph = new char[26];
		for (int i = 0; i<26; i++) {
			alph[i] = (i%2 ==0)? (char)('a' + i) : (char)('A'+ i);
		}
		for (char ch : alph) {
			System.out.print(ch);//줄바꿈 없이 출력
		}
		System.out.println();// 줄바꿈
		//7. 5개의 정수를 입력한 뒤 배열에 담고 최소값과 최대값 출력하기
		//일반 for문
		
		
		
		
		
		//8. 사물함의 비밀번호를 설정하고 사용자에게 이용할 사물함 번호와 비밀번호를 입력받아
		//	입력받은 사물함의 비밀번호와 설정한 비밀번호를 비교하여 일치 여부 출력하기
		//배열 이용 x 로직
		//입력 클래스 import
		//사물함 번호 설정
		//비밀번호 설정
		//사용할 사물함 번호와 비밀번호 입력 후 일치여부 확인(if)
//		System.out.println("사물함 번호를 입력하시오");
//		int num1 = sc.nextInt();
//		System.out.println("선택한 사물함의 비밀번호를 설정하세요");
//		int arPw = sc.nextInt();
//		System.out.println("사용할 사물함 번호를 입력하세요");
//		int choice = sc.nextInt();
//		System.out.println("사용할 사물함 번호의 비밀번호를를 입력하세요");
//		int choicePw = sc.nextInt();
//		if(arPw == choicePw ) {
//			System.out.println("비밀번호가 일치합니다. 사물함을 이용하세요");
//		}else {
//			System.out.println("비밀번호가 일치하지 않습니다");
//		}
		
		//1)5칸짜리 사물함의 비밀번호를 각각 배열에 저장한다
		//2)사용자에게 이용할 사물함 번호를 묻는다
		//3)비밀번호를 입력받아 확인한다
		//4)일치/불일치를 출력한다
		
		int[] arPw = new int[5];
		String mainMsg = "번 사물함의 비밀번호 설정 : ";
		String choiceMsg = "이용할 사물함 번호 입력 : ";
		String inputMsg = "비밀번호 입력 : ";
		String result = null;
		int choice = 0, inputPw = 0;
		
		for(int i =0; i<arPw.length; i++) {
			System.out.println(i+1+mainMsg);
			arPw[i] = sc.nextInt();
		}
		System.out.println(choiceMsg);
		choice = sc.nextInt();
		
		System.out.println(inputMsg);
		inputPw = sc.nextInt();
		
		if(arPw[choice - 1] ==inputPw) {
			System.out.println("비밀번호 일치");
		}else {
			System.out.println("비밀번호 불일치");
		}
		
		
		//9. 학생 1명의 3과목 총점과 평균(소수점 3자리까지)을 구하고 출력하기
		// 3과목은 배열에 입력받아 저장하며 for-each문만 사용(일반 for문 사용금지!)
		
		//로직
		//입력클래스 import
		//3칸 배열 선언하기
		//합계 저장할 변수 int, 평균 저장할 변수 double
		//3과목 점수 입력받는 for each문
		//입력받은 과목 총점계산할 for each문
		//결과 출력
		int[] scores = new int[3];
		
//		for(int i = 0; i < scores.length; i++) {
//			System.out.println("점수를 입력하시오");
//			scores[i] = sc.nextInt();
//		}
		int index = 0;
		int total = 0;
		double avg = 0.0;

		for(int score : scores) {
			System.out.println("점수 입력 : ");
			score = sc.nextInt();
			scores[index++] = score;
		}
		
		for(int score : scores) {
			total += score;
		}
		avg = (double)total/scores.length;
		System.out.printf("점수의 총점은 : %d, 점수의 평균은 : %.3f ", total, avg);
	}
}
