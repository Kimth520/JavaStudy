package task;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		//1. 100000원이 넘는 금액을 입력받아 5만원, 1만원, 5천원, 1천원 단위로 나누어 출력하기
		//다섯 변수 선언
		int money = 0, fivem = 0, onem = 0, fivet = 0, onet = 0;
		//입력메시지 + 입력메소드
		System.out.println("10,0000원이 넘는 금액을 입력하세요 : ");
		money = sc.nextInt();
		//바로 이전의 큰수로 나눈 나머지로 이어서 계산하는 식
		fivem = money / 50000;
		onem = (money % 50000) / 10000;
		fivet = (money % 10000)  / 5000;
		onet = (money % 5000) / 1000;
		//결과 출력문
		System.out.printf("5만원권 : %d\n1만원권 : %d\n5천원권 : %d\n1천원권 : %d\n\n", fivem, onem, fivet, onet);
		
		//2. 키와 몸무게를 입력받아 BMI를 계산하기
		//공식 = 몸무게 / (키 * 키)
		//세 변수선언
		double height = 0.0, weight = 0.0, bmi = 0.0;
		//입력 메시지 + 입력 메소드
		System.out.println("키를 입력하시오 : ");
		height = sc.nextDouble();
		System.out.println("몸무게를 입력하시오 : ");
		weight = sc.nextDouble();
		//bmi계산식
		bmi = weight / (height * height);
		//결과 출력문
		System.out.printf("당신의 BMI는 [%f]입니다\n\n", bmi);
		
		//3. 밑변과 높이를 입력받아 삼각현의 넓이 계산하기
		//공식 = 0.5 * 밑변 * 높이
		//세 변수 선언
		double data1 = 0.0, data2 = 0.0, area = 0.0;
		//입력메시지 + 입력메소드
		System.out.println("밑변과 높이를 각각 입력하세요(띄어쓰기로 입력) : ");
		data1 = sc.nextDouble();
		data2 = sc.nextDouble();
		//넓이 연산식
		area = 0.5 * data1 * data2;
		//결과 출력
		System.out.printf("삼각형의 넓이는 %f입니다\n", area);
		
		
		
		//4. 두 정수를 입력받아 0보다 큰지 출력하기(true or false로 출력)
		//두 변수 선언
		int num1 = 0, num2 = 0;
		//입력메시지 + 입력메소드
		System.out.println("두 정수를 각각 입력하시오(띄어쓰기로 입력) : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		//0보다 큰지 논리
		System.out.println(num1 > 0);
		System.out.println(num2 > 0);
		
		
		//5. 사용자에게 물건의 개수와 가격을 입력받아 총액 계산하기
		//물건의 개수 : 3
		//물건의 개당 가격 : 1500
		//총액 : 금액원
		
		//세 변수 선언
		int numitem = 0, price = 0, total = 0;
		//입력메시지 + 입력메소드
		System.out.println("물건의 개수와 가격을 각각 입력하시오(띄어쓰기로 입력) : ");
		numitem = sc.nextInt();
		price = sc.nextInt();
		//총액 연산문
		total = numitem * price;
		//출력문
		System.out.printf("구매하신 물품의 총액은 %d입니다\n", total);
		
		//6. 두자리수 정수를 입력받아 각 자리의 숫자를 더하여 출력하기(각 자리수의 합을 계산)
		//네 변수 선언
		int num3 = 0, ten = 0, one = 0, add = 0;
		//입력메시지 + 입력메소드
		System.out.println("두자리수 정수를 입력하시오 : ");
		num3 = sc.nextInt();
		ten = num3 / 10;
		one = num3 % 10;
		add = ten + one;
		//각 자리수 합 출력
		System.out.printf("각 자리 숫자의 합은 %d/n", add);
		
		
		//7. 정수를 입력받아 양수이면서 짝수인지 확인하여 결과 출력하기
		//true or false
		//변수 선언
		int num4 = 0;
		//입력 메시지 + 입력 메소드
		System.out.println("정수를 입력하시오 : ");
		num4 = sc.nextInt();
		//양수이면서 짝수인 논리식
		System.out.println(num4>0 && (num4%2 == 0));
		
		
		//8. 두 숫자를 입력받아 첫번째 입력받는 숫자가 두번쨰 숫자보다 크거나 같은지 여부를 출력하기
		//true or false
		//두 변수 선언
		double data3 = 0.0, data4 = 0.0;
		//입력메시지 + 입력메소드
		System.out.println("두 숫자를 차례대로 입력하시오(띄어쓰기로 입력) : ");
		data3 = sc.nextDouble();
		data4 = sc.nextDouble();
		//논리 연산식
		System.out.println(data3 >= data4);
		
		//9. 두 숫자를 입력받아 한 숫자만 양수인지 여부 출력하기
		//true or false
		//두 숫자 변수 선언
		int num5 = 0, num6 = 0;
		//입력 메시지 + 입력 메소드
		System.out.println("두 숫자를 입력하시오(띄어쓰기로 입력)");
		num5 = sc.nextInt();
		num6 = sc.nextInt();
		//한 숫자만 양수인지 여부 
		System.out.println((num5>0&&num6<=0) || (num6>0&&num5<=0));
		
		
		//10. 연도를 입력받아 윤년인지 아닌지 출력하기 ( 2024년, 2025년으로 확인할 것)
		//true or false => true 이면 0000년은 윤년입니다로 출력, false이면 0000년은 윤년이 아닙니다로 출력
		// 윤년 계산 : 연도가 4로 나누어 떨어지고 100으로 나누어 떨러지지 않거나 400으로 나누어 떨어져야 한다
		
		//변수 선언
		int year = 0;
		boolean leap = false;
		//입력메시지 + 입력메소드
		System.out.println("연도를 입력하시오 : ");
		year = sc.nextInt();
		//boolean으로 윤년 여부 게산하는 논리식
		leap = (year % 4 == 0&&year % 100 != 0) || year % 400 == 0;
		// 논리 값에 따라 메시지 출력
        System.out.println(year + "년은 윤년" + (leap ? "입니다." : "이 아닙니다."));//삼항연산자...?
		
		
	}
}
