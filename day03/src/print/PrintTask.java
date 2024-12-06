package print;

public class PrintTask {
	public static void main(String[] args) {
		
		//1. Printf를 사용해 형식에 맞게 출력하기
		//이름 : 본인이름 
		//나이 : 본인나이 
		//취미 : 취미		
		//키 : 실수형 2자리까지
		//몸무게 : 실수형 3자리까지
		
		String name = "김태현", hobby = "골프";
		int age = 26;
		double height = 173.33, weight = 80.3333;
		
		System.out.printf("이름 : %s\n나이 : %d\n취미 : %s\n키 : %.2f\n몸무게 : %.3f\n\n", name, age, hobby, height, weight);
		
		//2. 10진수의 값 255를 8진수, 16진수, 10진수로 각각 출력
		
		int number = 255;
		System.out.printf("8진수 : %o, 16진수 : %x, 10진수 : %d\n", number, number, number);
		
		
		//3. 상품정보를 ptintln과 printf를 사용하여 아래 형식으로 출력하기
		// 각 자리수는 5자리로 정렬, tab키 2번 사용
		
		System.out.println("---------------------------");
		System.out.printf("%-5s\t\t%-5s", "상품명", "가격");
		System.out.println("\n---------------------------");
		System.out.printf("%-5s\t\t%-5d원", "메로나", 1500);
		System.out.printf("\n%-5s\t\t%-5d원", "누네띠네", 1200);
		System.out.printf("\n%-5s\t\t%-5d원", "꼬북칩", 2000);
		System.out.printf("\n%-5s\t\t%-5d원\n", "초코파이", 3000);
		
		//4. 봄 여름 가을 겨울을 아래와 같이 출력하기
		System.out.println("봄\n\t\t여름\n\t가을\n\t\t겨울\n");
		
		
	}
}
