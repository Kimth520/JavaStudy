package methodTest;

import java.util.Scanner;

public class MethodTask {
	public static void main(String[] args) {
		MethodTask ta = new MethodTask();
		
		// 1. 음수를 양수로, 양수를 음수로 바꿔주는 메소드
	    // 매개변수o, 리턴값o
	    // 메소드명 : changeSign
		System.out.println(ta.changeSign(10));
				
	    // 2. 이름과 정수를 받아와서 정수만큼 이름을 출력하는 메소드
	    // 매개변수 o, 리턴값 o
	    // 메소드명 : printName
		ta.printName("김태현",4);
	    // 3. 10이하의 숫자는 1로 10을 초과하는 숫자는 100으로 반환하는 메소드
	    // 매개변수o, 리턴값o
	    // 메소드명 : changeNumber
		System.out.println(ta.changeNumber(10));
	    // 4. 5개의 정수중 평균을 반환하는 메소드
	    // 매개변수o(배열), 리턴값o
	    // 메소드명 getAvg
		int[] ar = {10, 11, 12, 13, 14};
		System.out.println(ta.getavg(ar));
	    // 5. 정수 배열 중 최대값과 최소값을 출력하는 메소드
	    // 매개변수o(배열),리턴값 x
	    // 메소드명 printMinMax
		int[] ar1 = {10,20,30,40,50};
		ta.printMax(ar1);
	    // 6. 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
	    // BaNanA -> bAnANa
	    // 메소드명 : changeCase
	    // 매개변수와 리턴값 자유 => 단, 형변환 이용할 것

	    // 7. 아이디와 비밀번호를 입력받아 로그인하기
	    // 매개변수 o, 리턴값 o(boolean 타입)
	    // 메소드명 : login
	    // main메소드에서 id가 admin이고 비밀번호가 1234이면 관리자님 환영합니다 출력
	    // 둘 중 하나라도 틀리면 잘못입력했습니다 출력
		
		//로직
		//입력클래스 import
		//아이디와 패스워드 입력 메소드
		//if문으로 정답일때 아닐때 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요");
		String inputId = sc.next();
		System.out.println("패스워드를 입력하세요");
		String inputPassword = sc.next();
		
		if (ta.login(inputId, inputPassword)) {
            System.out.println("관리자님 환영합니다");
        } else {
            System.out.println("잘못 입력했습니다");
        }
		

	}
	// 1. 음수를 양수로, 양수를 음수로 바꿔주는 메소드
    // 매개변수o, 리턴값o
    // 메소드명 : changeSign
	//정수 num0
	//입력값에 -를 붙임
	
	//로직
	//결과 변수 = num * -1
	
	int changeSign(int num0) {
		int result0 = - num0;
		return result0;
	}

    // 2. 이름과 정수를 받아와서 정수만큼 이름을 출력하는 메소드
    // 매개변수 o, 리턴값 o
    // 메소드명 : printName
	
	//이름(String), 정수(int)
	//로직 for문을 사용하여 이름을 정수 횟수만큼
	
	//로직
	//for문으로 입력받은 count만큼 반복문
	
	void printName(String name, int count) {
		for(int i=0; i<count; i++) {
			System.out.println(name);
		}
	}

    // 3. 10이하의 숫자는 1로 10을 초과하는 숫자는 100으로 반환하는 메소드
    // 매개변수o, 리턴값o
    // 메소드명 : changeNumber
	
	//로직
	//if else if 문으로 조건문
	int changeNumber(int num1) {
		if(num1 > 10) {
			num1 = 100;
		}else if(num1<=10) {
			num1 = 1;
		}
		return num1;
	}

    // 4. 5개의 정수중 평균을 반환하는 메소드
    // 매개변수o(배열), 리턴값o
    // 메소드명 getAvg
	
	//로직
	//5개 정수 합 구할 변수 선언
	//for문으로 sum 구하기
	//sum을 배열의 길이로 나누기
	
	double getavg(int[] ar) {
		int sum = 0;
		for(int data : ar) {
			sum += data;
		}
		return (double) sum/ar.length;
	}

    // 5. 정수 배열 중 최대값과 최소값을 출력하는 메소드
    // 매개변수o(배열),리턴값 x
    // 메소드명 printMinMax
	
	//로직 구성
	//리턴값 x void
	//배열의 첫번째 값을 기준으로 초기 최솟값과 최댓값 설정
	//반복문으로 min max 구하기
	
	void printMax(int[] ar1) {
		int min = ar1[0];
		int max = ar1[0];
		for(int data1 : ar1) {
			if(data1<min){
				min = data1;
			}else if(data1>max) {
				max = data1;
			}
			
		}
		System.out.println("최솟값 : " + min);
		System.out.println("최대값 : " + max);
	}

    // 6. 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
    // BaNanA -> bAnANa
    // 메소드명 : changeCase
    // 매개변수와 리턴값 자유 => 단, 형변환 이용할 것
	
	///????
	void changeCase(String str) {
		
	}
	

    // 7. 아이디와 비밀번호를 입력받아 로그인하기
    // 매개변수 o, 리턴값 o(boolean 타입)
    // 메소드명 : login
    // main메소드에서 id가 admin이고 비밀번호가 1234이면 관리자님 환영합니다 출력
    // 둘 중 하나라도 틀리면 잘못입력했습니다 출력
	
	//로직구성
	//메소드명(입력받을 아이디, 입력받을 비밀번호)
	//정답인 아이디와 패스워드 션수 선언및 초기화
	//&&dhk equals사용
	boolean login(String id, String password) {
		String correctId = "admin";
		String correctPassword = "1234";
		if(id.equals(correctId)&&password.equals(correctPassword)) {
			return true;
		}else {
			return false;
		}
	}
}
