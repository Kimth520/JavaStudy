package makeTask;

import java.util.Scanner;

public class SolveTask02 {
	public static void main(String[] args) {
	//문제 2	
//		2번 문제
//		사용자에게 행과 열의 수를 입력받아 그에 맞게 한칸당 []를 출력해 행과 열을 표시한다
//		그리고 사용자에게 입력 받은 행 과 열의 곱을 제일 맨 마지막 []안에 기입해준다
	Scanner sc = new Scanner(System.in);
	SolveTask02 st = new SolveTask02();
	
	int num1 = 0,num2=0;
	System.out.println("행을 입력하시오");
	num1 = sc.nextInt();
	System.out.println("열을 입력하시오");
	num2 = sc.nextInt();
	st.makeArray(num1,num2);
	}
	
	void makeArray(int num1, int num2){
		for(int i = 1; i<=num1; i++) {
			System.out.print("[]");
			for(int j = 1; j<=num2; j++) {
				if(i==num1&&j==num2) {
					System.out.print("["+num1*num2+"]");
				}else {
					System.out.print("[]");
					}
			}
			
			System.out.println();
		}
		
	}
	
	
}
