package makeTask;

import java.util.Scanner;

public class SolveTask01 {
	public static void main(String[] args) {
		//1번 문제
//		사용자에게 0~9까지의 정수 10개를 입력을 받고
//		이 때 잘못된 정수를 입력하면 다시 입력을 받고
//		사용자가 입력한 10개의 정수의 합을 구하시오
//		SolveTask01 st = new SolveTask01();
//		Scanner sc = new Scanner(System.in);
//		int num = 0, sum = 0, count = 0;
//		st.totalTen();
		System.out.println(((int)Math.random() * 30) +1);
		
	
		
	}
		void totalTen() {
			Scanner sc = new Scanner(System.in);
			int num = 0, sum = 0, count = 0;
			
		while(true) {
			System.out.print("0~9까지의 정수를 입력해주세요 : ");
			num = sc.nextInt();
			if(num<0||num>9) {
				System.out.println("잘못입력하셨습니다. 다시 입력하세요");
				continue;
			}else {
			sum += num;
			count++;
			}
			if(count ==10) {
				break;
			}
		}
		System.out.println(sum);
		
	}
	
}
