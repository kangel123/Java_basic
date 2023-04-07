package project03_07;

import java.util.Scanner;

public class A6 {
	
	// 공약수 구하기
	public static void main(String[] args) {
		int i, N;
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();	// 공약수를 구할 숫자 적기
		for (i = 1; i < N; i++) {	// 1부터 고른 숫자 전까지 중에
			if (N % i == 0) {	// 숫자가 해당 값으로 나누어 떨어지면
				System.out.println(i);	// 공약수이므로 출력
			}
		}
	}
}
