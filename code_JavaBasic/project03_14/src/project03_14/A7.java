package project03_14;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class A7 {

	public static void main(String[] args) {
		FibonacciNumbers fn = new FibonacciNumbers();
		ArrayList<Integer> list = new ArrayList<>();
		try {
			int num = fn.inputNumber();

			list = fn.fibonacciElementNumber(num);
			for (int j : list) {
				System.out.print(j + " ");
			}
		} catch (InputMismatchException e) {
			System.out.println("error : 숫자만 가능");
		} catch (Exception e) {
			System.out.println("error");
		}
	}
}
