package project03_09;

import java.util.Scanner;

public class BankingSystem {
	public static void showMenu() {
		System.out.println("#Menu\n" + "1. Deposit\n" + "2. Withdrawal\n");
	}

	public static int runBanking(int money) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Balance : ");
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		switch (n) {
		case 1:
			money += m;
			break;
		case 2:
			money -= m;
			break;
		default:
			break;
		}
		return money;
	}

}
