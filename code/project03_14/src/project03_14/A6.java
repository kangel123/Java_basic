package project03_14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			int m = scan.nextInt();
			allCase(n, m);
		} catch (InputMismatchException e) {
			System.out.println("error : 숫자만 가능");
		} catch (Exception e) {
			System.out.println("error");
		}
	}

	public static void allCase(int n, int m) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				System.out.println(i + "," + j);
			}
		}
	}
}
