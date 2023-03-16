package project03_07;

import java.util.Scanner;

public class A8 {

	public static void main(String[] args) {
		int i, k = 1, N, M;
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		M = scanner.nextInt();
		for (i = 1; i < Math.max(N, M); i++) {
			if (N % i == 0 && M % i == 0)
				k = i;
		}
		System.out.println(k);
	}
}
