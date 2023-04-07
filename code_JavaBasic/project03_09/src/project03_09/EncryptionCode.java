package project03_09;

import java.util.Scanner;

public class EncryptionCode {
	public static void showMenu() {
		System.out.println("#Menu");
		System.out.println("1. Encryption");
		System.out.println("2. Decryption");
	}

	public static StringBuilder chooseMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Write down word : ");
		StringBuilder sb = new StringBuilder(scanner.next());

		System.out.print("Choose Menu : ");
		switch (scanner.nextInt()) {
		case 1:
			return Encryption(sb);
		case 2:
			return Decryption(sb);
		default:
			System.out.println("There is no menu\n");
			return chooseMenu();
		}
	}

	public static StringBuilder Encryption(StringBuilder str) {
		for (int i = 0; i < str.length(); i++) {
			str.setCharAt(i, (char) ((int) str.charAt(i) + 1));
		}
		return str;
	}

	public static StringBuilder Decryption(StringBuilder str) {
		for (int i = 0; i < str.length(); i++) {
			str.setCharAt(i, (char) ((int) str.charAt(i) - 1));
		}
		return str;
	}
	
}
