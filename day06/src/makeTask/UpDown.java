package makeTask;

import java.util.Scanner;

public class UpDown {
	public static void main(String[] args) {
		
		//if, else if, else 연습겸,  i의 증감 위치 연습
		
		//입력 클래스 import
		//반복문(while)로 정답 맞출때까지 반복 break;문으로 종료
		//정답은 상수 선언
		//입력받은 숫자가 0보다 크고 정답보다 작을때 up
		//입력받은 숫자가 50보다 작고 정답보다 클때 down
		//그 이외의 값은 다시 입력하라는 메시지
		//변수 i++로 몇번쨰에 맞춘지 횟수 계산
		
		Scanner sc = new Scanner(System.in);
		int num = 0,  i =0;
		final int answer = 17;
		
		System.out.println("UpDown 문제입니다!");
				
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			num = sc.nextInt();
			i++;
			
			if(answer == num) {
				System.out.println("정답입니다 " + i +"번째에 맞췄습니다");
				break ;
			}else if(num>0 &&num < answer) {
				System.out.println("up");
			}else if(num > answer && num<50) {
				System.out.println("down");
			}else {
				System.out.println("1부터 50사이의 숫자를 다시 입력하세요");
			}
			
			
				}
		System.out.println("win");
	}
}
