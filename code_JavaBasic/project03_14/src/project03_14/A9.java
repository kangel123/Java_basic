package project03_14;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class A9 {

	public static void main(String[] args) {
		ArrayCalculation list1 = new ArrayCalculation();
		ArrayList<Integer> number = new ArrayList<>();
		int k;
		Scanner scanner = new Scanner(System.in);
		try {
			while (true) {
				System.out.println("Please enter a number (0:exit) : ");
				k = scanner.nextInt();
				if (k == 0) {
					System.out.println("exit");
					break;
				}
				number.add(k);
				System.out.println("Result : " + k + " - Mean " + list1.Mean(number) + ", Max " + list1.Max(number)
						+ ", Min " + list1.Min(number));
			}

		} catch (InputMismatchException e) {
			System.out.println("error : 숫자만 가능");
		} catch (Exception e) {
			System.out.println("error");
		}
	}

}
