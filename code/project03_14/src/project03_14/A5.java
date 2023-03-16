package project03_14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 123, 32, 356, 53, 2, 67, 31, 78, 41, 9, 29, 29, 129, 209, 302, 402, 21, 23, 24 };
		String n = "";

		try {
			Scanner scan = new Scanner(System.in);
			n = Integer.toString(scan.nextInt());
			int[] arr = new int[11];
			arr = searchNumber(numbers, n);
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != 0)
					System.out.println(arr[i]);
			}
		} catch (InputMismatchException e) {
			System.out.println("error : 숫자만 가능");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("error : 인덱스 범위 초과");
		} catch (Exception e) {
			System.out.println("error");
		}
	}

	public static int[] searchNumber(int[] numbers, String n) {
		int[] arr = new int[11];
		for (int i = 0, j = 0; i < numbers.length; i++) {
			if (Integer.toString(numbers[i]).contains(n)) {
				arr[j] = numbers[i];
				j++;
			}
		}
		return arr;
	}
}
