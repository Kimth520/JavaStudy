package staticTest;
//1. 정적 메소드 호출
public class MathUtilsMain {
	public static void main(String[] args) {
		//getMax() 호출 => 매개변수o, 리턴값o
		System.out.println(MathUtils.getMax(10,20));
		
		//round() 호출
		System.out.println(MathUtils.round(5.7));
		//round() : 소수점값을 가장 가까운 정수로 반올림하는 메소드
		
	}
}
