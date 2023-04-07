package project03_07;

import java.util.Scanner;

public class A10 {

	// 간단한 자판기 만들기
	public static void main(String[] args) {
		int i = 1000, N;
		Scanner scanner = new Scanner(System.in);
		while (true) {	// 종료할 때까지 반복
			System.out.println("#Menu");
			System.out.println("0. exit");
			System.out.println("1. Coke - 340");
			System.out.println("2. Orange Juice -500");
			System.out.println("3. Milk - 650");
			System.out.println("4. Water - 290");
			System.out.println("5. Coffee - 170");
			System.out.println("구매하실 항목의 번호를 선택해주세요.");
			N = scanner.nextInt();	// 구매할 번호 선택
			if (N == 0) {	// 0 이면 종료
				System.out.println("exit");
				break;
			}
			switch (N) {	// 선택한 번호에 대해
			case 1:
				i -= 340;
				break;
			case 2:
				i -= 500;
				break;
			case 3:
				i -= 650;
				break;
			case 4:
				i -= 290;
				break;
			case 5:
				i -= 170;
				break;
			default:	// 해당 번호가 없으면
				System.out.println("해당 번호는 존재하지 않습니다.");
				break;
			}
			System.out.println("The change is " + i + "(100 X " + i / 100 + ", 50 X " + i % 100 / 50 + ", 10 X "
					+ i % 50 / 10 + ")");	// 거스름돈 출력
		}
	}

}
