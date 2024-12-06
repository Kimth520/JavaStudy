package makeTask;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word = " ";
		System.out.print("문자열을 입력하시오 : ");
		word = sc.next();
		sc.nextLine();//
		char result = word.charAt(2);
		
	
		//1
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<5; j++) {
				System.out.print(result + " ");
			}
			System.out.println();
		}
		
		
		
		
		//1심화
		for(int i = 0; i<5; i++)
		{
			if(i==0 || i==4)
			{
				for(int j = 0; j<5; j++)
				{
				System.out.print(result + " ");
				}
			}
			else if(i==1 || i==2|| i==3)
			{
				System.out.print(result);
				for(int k = 0; k<7; k++)
				{
					System.out.print(" ");
				}
				System.out.print(result);
				
			}	
			System.out.println();
			
		}
		
		
		
		//2번
		int sub1 = 0, sub2 = 0, sub3 = 0, avg = 0;
	      System.out.println("3과목의 성적을 입력해 주세요 : ");
	      
	      sub1 = sc.nextInt();
	      sub2 = sc.nextInt();
	      sub3 = sc.nextInt();
	      sc.nextLine();//
	      avg = (sub1 + sub2 + sub3)/3;
	      
	      if(avg<75) {
	         System.out.println("평균 학점 : 0.0\n평균 성적 : F");
	      }else if(avg >= 75 && avg <= 79){
	         System.out.println("평균 학점 : 2.5\n평균 성적 : C+");
	      }else if(avg >= 80 && avg <= 84){
	         System.out.println("평균 학점 : 3\n평균 성적 : B");
	      }else if(avg >= 85 && avg <= 89){
	         System.out.println("평균 학점 : 3.5\n평균 성적 : B+");
	      }else if(avg >= 90 && avg <= 94){
	         System.out.println("평균 학점 : 4.0\n평균 성적 : A");
	      }else if(avg >= 95 && avg <= 100){
	         System.out.println("평균 학점 : 4.5\n평균 성적 : A+");
	      }else {
	    	  System.out.println("범위에 없는 성적입니다");
	      }
		
	}
}

