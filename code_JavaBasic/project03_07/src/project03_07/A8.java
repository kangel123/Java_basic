package project03_07;

import java.util.Scanner;

public class A8 {

	// 최대공약수 구하기
	public static void main(String[] args) {
		int i, k = 1, N, M;
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		M = scanner.nextInt();
		for (i = 1; i <= Math.min(N, M); i++) {	// 두 수 중에 가장 작은 숫자까지
			if (N % i == 0 && M % i == 0)	// 최대 공약수를 구한다
				k = i;
		}
		System.out.println(k);	// 최대공약수 출력
	}
}
