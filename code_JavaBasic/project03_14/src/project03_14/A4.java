package project03_14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			String[] arr = scan.nextLine().split("");
			String str = scan.next();
			System.out.println(findingCharacter(arr, str));
		} catch (InputMismatchException e) {
			System.out.println("error : 입력 오류");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("error : 인덱스 범위 초과");
		} catch (Exception e) {
			System.out.println("error");
		}
	}

	public static int findingCharacter(String[] arr, String str) {
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(str)) {
				num = i+1;
				break;
			}
		}
		return num;
	}

}
