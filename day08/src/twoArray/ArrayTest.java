package twoArray;

import java.util.Arrays;

//Arrays. sort를 이용한 정렬
public class ArrayTest {
	public static void main(String[] args) {
	
		int[] number = {5, 2, 9 ,1, 6};
		 System.out.println("정렬 전 : " + Arrays.toString(number));
		Arrays.sort(number, 0, 4); //인덱스 0부터 3까지 오름차순 정렬
		 System.out.println("정렬 후 : " + Arrays.toString(number));
	}
}
