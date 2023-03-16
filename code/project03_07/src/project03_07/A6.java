package project03_07;

import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {
		int i, N;
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		for (i = 1; i < N; i++) {
			if (N % i == 0) {
				System.out.println(i);
			}
		}
	}
}
