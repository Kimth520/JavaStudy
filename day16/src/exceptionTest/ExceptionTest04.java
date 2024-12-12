package exceptionTest;
//예외 처리
public class ExceptionTest04 {
	public static void main(String[] args) {
		String[] ar = {"1", "2", "100", "a", "-50"};
		System.out.println(ar);
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		System.out.println(ar[4]);
		
		for(String i : ar) {
		try {
				System.out.println(Integer.parseInt(i));
				// java.lang.NumberFormatException: For input string: "a"
			
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환 불가 : " + e.getMessage());
		 }//예외가 생겼을때 반복문을 멈추게 하려면 try문 안에 반복문 위치
		}
	}
}
