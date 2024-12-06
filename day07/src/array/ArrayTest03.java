package array;
//배열의 저장공간과 값
public class ArrayTest03 {
	public static void main(String[] args) {
		int[] arData = {4, 3, 2, 5};
		//정수형 배열 arData stack 메모리 영역에 생성(참조 변수),
		//heap 메모리 영역에 4칸짜리 4, 5, 2, 5,라는 값을 저장한 배열을 생성하고 
		//참조값(주소값)을 arData라는 참조 변수에 담는다
				System.out.println(arData);
				
		System.out.println(arData[0]);//값
		arData[0] += 10;// arData[0] 저장공간, 값
		System.out.println(arData[0]);//값
		
		int data = arData[3];
		System.out.println(data);
		
		double data1 = arData[2];//자동형변환
	    System.out.println(data1);
	      
//	      arData[4] = 10;
//	      System.out.println(arData[4]);
	    System.out.println("배열의 길이: " + arData.length);

	    
	    double[] arData1 = null; //double 타입의 배열 선언
	    arData1 = new double[4]; //double 타입의 배열변수에 int[] 타비의 배열을 할당하려고 하면 컴파일오류가 발생
	    //배열의 선언과 생성의 타입은 일치해야함
	    System.out.println("배열의 길이 : " + arData1.length);
	    
	}
}
