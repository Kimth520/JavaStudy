package makeTask;

import java.util.Scanner;

public class Dan {
	public static void main(String[] args) {
		
		//입력 클래스 import
		Scanner sc = new Scanner(System.in);
		//입력받을 단 변수 선언
		int num = 0;
		System.out.println("단을 입력하세요 : ");
		num = sc.nextInt();
		
		while(true) {
			if(num<1 || num>9) 
			{
			System.out.println("1부터 9까지의 수를 다시 입력하시오");
			System.out.println("단을 입력하세요 : ");
			num = sc.nextInt();
			}
			else 
			{
				System.out.println(num + "단");
				
				for(int i= 1; i <= 9; i++ ) 
				{
					for(int j = 1; j <= num; j++) 
					{
						System.out.print(j+" X " + i+  " = " + i*j +"\t");
					}
					System.out.println();
				}
				break;
			}
		
		}
	}
}
	


