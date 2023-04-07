package project03_07;

import java.util.Scanner;

public class A5 {
	
	// 별그리기3 (거꾸로 피라미드)
	public static void main(String[] args) {
		int i, j, N;
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();	// 행 개수
		for (j = N; j >= 1; j--) {	// 피라미드를 거꾸로 해야하므로 행도 밑부터 시작
			for (i = 1; i <= 2 * N - 1; i++) {
				if (N - j < i && i < N + j)	// 별그리기
					System.out.print("*");
				else	// 빈 공간 생성
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
