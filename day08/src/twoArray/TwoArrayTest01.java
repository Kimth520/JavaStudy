package twoArray;
//2차원 배열
//행과 열로 구성된 데이터를 저장하는 배열의 형태
public class TwoArrayTest01 {
	public static void main(String[] args) {
		//2차원 배열
		int[][] ar1;//2차원 배열 선언
		ar1 = new int[3][2];//3행 2열 크기의 배열 생성
		
		System.out.println(ar1);//2차원 배열(3행 2열)의 전체 참조값 - JVM에 의해 제공
		System.out.println(ar1[0]);//0행의 참조값(1차원 배열)
		System.out.println(ar1[0][0]);//0행 0열의 초기화된 기본값
		
		//1차원 배열
		int[] ar2 = new int[3];
		System.out.println(ar2);//1차원 배열의 참조 값
		System.out.println(ar2[0]);//1차원 배열의 첫번째 값 (초기화 된 기본값)
		
	}
}
