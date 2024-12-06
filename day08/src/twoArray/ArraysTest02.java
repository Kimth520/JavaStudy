package twoArray;

import java.util.Arrays;

public class ArraysTest02 {
	public static void main(String[] args) {
		
	//1차원 배열
	int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	
	//2차원 배열
	int[][] number2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	 System.out.println(number);
     System.out.println("1차원 배열 값 출력 : " + Arrays.toString(number));
     System.out.println(number2);
     System.out.println("1차원 배열 값 출력(참조값출력) : " + Arrays.toString(number2));
     System.out.println("2차원 배열 값 출력 : " + Arrays.deepToString(number2));

     
     int[][] arr = {{1}, {2, 3}, {4, 5, 6}};
     System.out.println(arr);
     System.out.println(arr.length);
     System.out.println(arr[0].length);
     System.out.println(arr[1].length);
     System.out.println(arr[2].length);
     for(int[] ar : arr) {
        for(int ar1 : ar) {
           System.out.print("* ");
        }
        System.out.println();
     }
     
	}
}