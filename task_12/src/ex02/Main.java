package ex02;

import java.util.Scanner;

//김태현
public class Main {
	public static void main(String[] args) {
		//5명의 학생의 점수(1과목)를 입력받아 아래를 수행하는 프로그램
	    // 총합 계산
	    // 평균 계산
	    // 최고 점수와 해당 인덱스 출력

	    
	    // 점수는 배열에 저장하여 출력
	    // 나중에 학생수를 사용자 입력할 수 있도록 변경할 예정이다
		
		//로직
		//크기가 5인 배열 생성
		//5명의 학생의 점수를 입력받아 배열에 넣기
		//반복문을 사용하여 총합 계산
		//배열의 길이로 나누어 평균 계산
		int[] ar = new int[5];
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i<ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		
	
		
}
	
}