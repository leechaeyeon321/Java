package first_project;

import java.util.Scanner;
import java.util.Arrays;

public class Practice1{
	
	public static void printArray(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			if (i == 0) System.out.print('[');
			if (i == arr.length - 1) System.out.print(arr[i] + "]");
			else System.out.print(arr[i] + ", ");
		}
	}

	public static void main(String[] args) {
		
		int[] arr1 = {0, 0, 0}; //데이터 크기를 직접 만들어도 된다.
		int[] arr2 = new int[3]; //초기화 해서 만들어서 해도 된다.
		
		arr2[0] = 1;
		arr2[0] = 1;
		arr2[0] = 1;
		
		// arr1 = [0, 1, 2]
		for (int i=0; i<arr1.length; i++) {
			arr1[i] = i;
		}
		
		// for문을 이용한 출력
		for (int i=0; i<arr1.length; i++) {
//			System.out.print(i + " ");
		}
		
		// for-each문
		for (int value : arr1) {
//			System.out.print(value + " ");
		}
		
		// Arrays 클래스 이용
//		System.out.println(Arrays.toString(arr1)); //"[0, 1, 2]"
		// 직접 만든 메소드
		printArray(arr1);
//		printArray(arr2);
	}

}