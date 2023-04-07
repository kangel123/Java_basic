package project03_07;

import java.util.Scanner;

public class A9 {

	// 소수 구하기
	public static void main(String[] args) {
		int i, j, N;
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();	// 범위 선택
		for (j = 1; j <= N; j++) {	// 1부터 해당 범위까지
			for (i = 2; i < j; i++) {	// 2부터 해당 숫자까지 (1은 모든 숫자의 공약수이므로 제외)
				if (j % i == 0)	// 공약수가 있으면 탈출
					break;
			}
			if (i == j)	// 공약수가 1과 자기 자신인 경우
				System.out.println(j);	// 소수이므로 출력
		}
	}

}
