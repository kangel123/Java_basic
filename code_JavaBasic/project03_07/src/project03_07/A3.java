package project03_07;

import java.util.Scanner;

public class A3 {

	// 별그리기1
	public static void main(String[] args) {
		int i, j, N;
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();	// 행 개수
		for (j = 1; j <= N; j++) {	// 모든 행에 대해
			for (i = 1; i <= j; i++) {	// 해당 행번호와 동일하게
				System.out.print("*");	// 별을 그린다
			}
			System.out.println();	// 다음 줄
		}
	}
}
