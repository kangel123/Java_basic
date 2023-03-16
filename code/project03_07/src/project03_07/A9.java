package project03_07;

import java.util.Scanner;

public class A9 {

	public static void main(String[] args) {
		int i, j, N;
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		for (j = 1; j <= N; j++) {
			for (i = 2; i < j; i++) {
				if (j % i == 0)
					break;
			}
			if (i == j)
				System.out.println(j);
		}
	}

}
