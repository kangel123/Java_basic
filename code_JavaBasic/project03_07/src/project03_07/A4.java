package project03_07;

import java.util.Scanner;

public class A4 {

	// 별그리기2 (피라미드)
	public static void main(String[] args) {
		int i, j, N;
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();	// 행 개수
		for (j = 1; j <= N; j++) {	// 모든 행에 대하여
			for (i = 1; i <= 2 * N - 1; i++) {	// 행에 대한 열의 전체 크기는 (2 * 행번호 - 1)이다
				if (N - j < i && i < N + j)	// 별그리기
					System.out.print("*");
				else	// 빈 공간 생성
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
