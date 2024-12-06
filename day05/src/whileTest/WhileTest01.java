package whileTest;
//while문
public class WhileTest01 {
	public static void main(String[] args) {
		
		
//		int i = 1;
//		while(i<=5) {
//			System.out.println("good");
//			i ++;
//		}
		
		
		int total = 0, i = 0;
		while(i<=5) {
			total +=i;
			i++;
		}
		System.out.println(total);
		
	}
}
