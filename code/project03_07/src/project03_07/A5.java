package project03_07;

import java.util.Scanner;

public class A5 {
	public static void main(String[] args) {
		int i, j, N;
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		for (j = N; j >= 1; j--) {
			for (i = 1; i <= 2 * N - 1; i++) {
				if (N - j < i && i < N + j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
