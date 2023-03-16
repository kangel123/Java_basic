package project03_07;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		int i, j, N;
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		for (j = 1; j <= N; j++) {
			for (i = 1; i <= j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
