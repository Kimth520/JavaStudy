package makeTask;

import java.util.Scanner;

public class SolveTask03 {
	public static void main(String[] args) {
		//문제 3
//		3번 문제 
//		사용자에게 각 국어, 수학, 역사의 점수를 입력받는다
//		입력받은 3개의 과목의 총합점수와 소수점 2번째 자리 까지 평균을 구해라	
		
		SolveTask03 st = new SolveTask03();
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2=0, num3 = 0;
		System.out.print("국어 성적을 입력하세요 : ");
		num1 = sc.nextInt();
		System.out.print("수학 성적을 입력하세요 : ");
		num2 = sc.nextInt();
		System.out.print("역사 성적을 입력하세요 : ");
		num3 = sc.nextInt();
		st.scoreSum(num1,num2,num3);
		st.scoreAvg(num1,num2,num3);
	}
	void scoreSum(int score1, int score2, int score3) {
		int total = score1 + score2 + score3;
		System.out.println(total);
	}
	
	void scoreAvg(double score1, double score2, double score3) {
		double avg = (score1 + score2 + score3)/3;
		System.out.printf("%.2f",avg);
	}
}
