package project03_09;

import java.util.Scanner;

public class EncodingSystem {

	public static void showMenu() {
		System.out.println("#Menu");
		System.out.println("1. Encoder");
		System.out.println("2. Decoder");
	}

	public static StringBuilder chooseMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Write down word : ");
		StringBuilder sb = new StringBuilder(scanner.next());

		System.out.print("Choose Menu : ");
		switch (scanner.nextInt()) {
		case 1:
			return Encoder(sb);
		case 2:
			return Decoder(sb);
		default:
			System.out.println("There is no menu\n");
			return chooseMenu();
		}
	}

	public static StringBuilder Encoder(StringBuilder str) {
		for (int i = 0; i < str.length(); i++) {

			str.setCharAt(i, (char) ((int) str.charAt(i) + 49));
		}
		return str;
	}

	public static StringBuilder Decoder(StringBuilder str) {
		for (int i = 0; i < str.length(); i++) {
			str.setCharAt(i, (char) ((int) str.charAt(i) - 49));
		}
		return str;
	}
}
